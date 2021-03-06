package net.easipay.cbp.view.Job;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import net.easipay.cbp.constant.Constants;
import net.easipay.cbp.exception.SacException;
import net.easipay.cbp.model.SacCusParameter;
import net.easipay.cbp.model.form.FinTaskReceiveForm;
import net.easipay.cbp.service.OriTransactionManager;
import net.easipay.cbp.service.SacCusParameterService;
import net.easipay.cbp.util.DateUtil;
import net.easipay.cbp.sequence.SequenceCreatorUtil;

import org.apache.log4j.Logger;
import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;

@GlassJob(description = "针对支付处理账户调整任务(购付汇和行邮税)", team = "对账系统", created = "2016-04-08")
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class ProcessAutoReconciliationAccPayJob implements Job {
  @Autowired
  private OriTransactionManager oriTransactionManager;
  @Autowired
  private SacCusParameterService sacCusParameterService;

  private static final Logger logger = Logger.getLogger(ProcessAutoReconciliationAccPayJob.class);

  @Override
  public void execute(JobExecutionContext context) throws JobExecutionException {
    logger.info("处理账户调整任务(购付汇和行邮税)...");
      //将大账户(业务类型30)的钱转移到 71 90 层的业务类型  因为购汇的时候是从71里面拿钱去购汇的，如果不把钱转到71，商户就没钱购汇了
      //yesterday
      String trxSuccTime = DateUtil.formatCurrentDate(Calendar.DATE, -1, "yyyyMMdd");
      // 获取所有需要调账的交易
      Map<String, Object> queryMap = new HashMap<String, Object>();
      queryMap.put("trxType", Constants.TRX_TYPE_3302);
      queryMap.put("trxState", Constants.TRANSACTION_SUCCESS_FLAG);
      queryMap.put("trxSuccTime", trxSuccTime);
      queryMap.put("groupFields", "CRACC_CARD_ID");

      List<Map<String, Object>> amountList = oriTransactionManager.getAmountGroupByCus(queryMap);
      
      Iterator<Map<String, Object>> it = amountList.iterator();
      while(it.hasNext()){
    	  Map<String, Object> next = it.next();
    	  BigDecimal payAmounts = (BigDecimal)next.get("payAmounts");//支付金额
    	  BigDecimal taxAmounts = (BigDecimal)next.get("taxAmounts");//行邮税
    	  String craccCardId = (String)next.get("cardId");//收款方CARDID
    	  //货款加运费
    	  BigDecimal mainAmount = payAmounts.subtract(taxAmounts);
    	  try {
        	  Map<String,Object> queryParamMap = new HashMap<String,Object>();
        	  queryParamMap.put("orgCardId", craccCardId);
      		  List<SacCusParameter> cusList = sacCusParameterService.getSacCusParameterByParam(queryParamMap);
        	  if(cusList==null||cusList.size()<=0){
        		  throw new SacException("999990", "未维护的组织机构代码,无法自动调账！");
        	  }
        	  String craccCusName = cusList.get(0).getCusName();
        	  String cusNo = cusList.get(0).getCusNo();
        	  String payCurrency = "01";//币种
        	  //220203 31位
        	  String codeIdDTax = "220203".concat(cusNo).concat(payCurrency).concat("30").concat("03");//行邮税付款方
        	  String codeIdDPay = "220203".concat(cusNo).concat(payCurrency).concat("30").concat("02");//货款运费付款方
        	  
        	  String codeIdCTax = "220203".concat(cusNo).concat(payCurrency).concat("90").concat("03");//行邮税收款方
        	  String codeIdCPay = "220203".concat(cusNo).concat(payCurrency).concat("71").concat("02");//货款运费收款方
        	  
        	  
        	  
        	  String paramsMain = String.format(Constants.TEMPLATE_PARAMS,codeIdDPay,craccCusName,payCurrency,mainAmount,codeIdCPay,craccCusName,payCurrency,mainAmount);
          	  String digestMain = String.format(Constants.TEMPLATE_DIGEST,"清算自动调账(3302)",craccCusName,craccCusName,payCurrency,mainAmount);
        	  FinTaskReceiveForm form = new FinTaskReceiveForm();
    	      form.setBusiType("30");//跨境B2C
    	      form.setStep(1);
    	      form.setTrxCode("4101");//自动调账
    	      form.setSerno("P"+SequenceCreatorUtil.generateTrxSerialNo());
    	  	  form.setTradeTime(new Date());
    	  	  form.setDigest(digestMain);
    	  	  form.setParams(paramsMain);
    	  	  oriTransactionManager.reconliciationAccountToFa(form);
    	  	  
    	   	  String paramsTax = String.format(Constants.TEMPLATE_PARAMS,codeIdDTax,craccCusName,payCurrency,taxAmounts,codeIdCTax,craccCusName,payCurrency,taxAmounts);
          	  String digestTax = String.format(Constants.TEMPLATE_DIGEST,"清算自动调账(3302)",craccCusName,craccCusName,payCurrency,taxAmounts);
        	  FinTaskReceiveForm formTax = new FinTaskReceiveForm();
        	  formTax.setBusiType("30");//跨境B2C
        	  formTax.setStep(1);
        	  formTax.setTrxCode("4101");//自动调账
        	  formTax.setSerno("P"+SequenceCreatorUtil.generateTrxSerialNo());
        	  formTax.setTradeTime(new Date());
        	  formTax.setDigest(digestTax);
        	  formTax.setParams(paramsTax);
    	  	  oriTransactionManager.reconliciationAccountToFa(formTax);
		} catch (Exception e) {
			logger.error("商户号["+craccCardId+"]自动调账异常", e);
		}
      }
    logger.info("结束执行处理自动调账任务...");
  }
}
