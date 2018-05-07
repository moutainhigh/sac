package net.easipay.cbp.model;

// Generated 2015-7-6 15:57:25 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SacTrxDetail generated by hbm2java
 */
@Entity
@Table(name = "SAC_TRX_DETAIL", schema = "SAC_SYN")
public class SacTrxDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4379686424868310191L;
	private Long id;
	private String chnNo;
	private String cusBillNo;
	private String platBillNo;
	private String trxBatchNo;
	private String trxSerialNo;
	private String otrxSerialNo;
	private String receiverPlatAcc;
	private String paymentPlatAcc;
	private String bussType;
	private String trxType;
	private BigDecimal trxAmount;
	private String trxCurrencyType;
	private String sacCurrency;
	private BigDecimal sacAmount;
	private BigDecimal exRate;
	private String issuingBank;
	private String payconType;
	private String payWay;
	private String draccNodeCode;
	private String craccNodeCode;
	private String trxState;
	private Date createTime;
	private Date updateTime;
	private String chnBatchNo;
	private String cusBatchNo;
	private String busiType;
	private String memo;
	private String reversalStatus;
	private String finSign;
	private String chaConStatus;
	private BigDecimal channelCost;
	private BigDecimal cusCharge;
	private Date trxSuccTime;


	public SacTrxDetail() {
	}

	public SacTrxDetail(Long id, String cusBillNo) {
		this.id = id;
		this.cusBillNo = cusBillNo;
	}

	public SacTrxDetail(Long id, String cusBillNo,
			String platBillNo, String trxBatchNo, String trxSerialNo,
			String otrxSerialNo, String receiverPlatAcc, String paymentPlatAcc,
			String bussType, String trxType, BigDecimal trxAmount,
			String trxCurrencyType,
			BigDecimal exRate, String issuingBank,
			String payconType, String payWay, String trxState, Date updateTime,
			Date createTime, String memo,
			String draccNodeCode, String craccNodeCode, String busiType,String reversalStatus) {
		this.id = id;
		this.cusBillNo = cusBillNo;
		this.platBillNo = platBillNo;
		this.trxBatchNo = trxBatchNo;
		this.trxSerialNo = trxSerialNo;
		this.otrxSerialNo = otrxSerialNo;
		this.receiverPlatAcc = receiverPlatAcc;
		this.paymentPlatAcc = paymentPlatAcc;
		this.bussType = bussType;
		this.trxType = trxType;
		this.trxAmount = trxAmount;
		this.trxCurrencyType = trxCurrencyType;
		this.exRate = exRate;
		this.issuingBank = issuingBank;
		this.payconType = payconType;
		this.payWay = payWay;
		this.trxState = trxState;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.memo = memo;
		this.draccNodeCode = draccNodeCode;
		this.craccNodeCode = craccNodeCode;
		this.busiType = busiType;
		this.reversalStatus = reversalStatus;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CUS_BILL_NO", nullable = false, length = 30)
	public String getCusBillNo() {
		return this.cusBillNo;
	}

	public void setCusBillNo(String cusBillNo) {
		this.cusBillNo = cusBillNo;
	}

	@Column(name = "PLAT_BILL_NO", length = 30)
	public String getPlatBillNo() {
		return this.platBillNo;
	}

	public void setPlatBillNo(String platBillNo) {
		this.platBillNo = platBillNo;
	}

	@Column(name = "TRX_BATCH_NO", length = 30)
	public String getTrxBatchNo() {
		return this.trxBatchNo;
	}

	public void setTrxBatchNo(String trxBatchNo) {
		this.trxBatchNo = trxBatchNo;
	}

	@Column(name = "TRX_SERIAL_NO", length = 30)
	public String getTrxSerialNo() {
		return this.trxSerialNo;
	}

	public void setTrxSerialNo(String trxSerialNo) {
		this.trxSerialNo = trxSerialNo;
	}

	@Column(name = "OTRX_SERIAL_NO", length = 30)
	public String getOtrxSerialNo() {
		return this.otrxSerialNo;
	}

	public void setOtrxSerialNo(String otrxSerialNo) {
		this.otrxSerialNo = otrxSerialNo;
	}

	@Column(name = "RECEIVER_PLAT_ACC", length = 30)
	public String getReceiverPlatAcc() {
		return this.receiverPlatAcc;
	}

	public void setReceiverPlatAcc(String receiverPlatAcc) {
		this.receiverPlatAcc = receiverPlatAcc;
	}

	@Column(name = "PAYMENT_PLAT_ACC", length = 30)
	public String getPaymentPlatAcc() {
		return this.paymentPlatAcc;
	}

	public void setPaymentPlatAcc(String paymentPlatAcc) {
		this.paymentPlatAcc = paymentPlatAcc;
	}


	@Column(name = "TRX_TYPE", length = 8)
	public String getTrxType() {
		return this.trxType;
	}

	public void setTrxType(String trxType) {
		this.trxType = trxType;
	}

	@Column(name = "TRX_AMOUNT")
	public BigDecimal getTrxAmount() {
		return this.trxAmount;
	}

	public void setTrxAmount(BigDecimal trxAmount) {
		this.trxAmount = trxAmount;
	}

	@Column(name = "TRX_CURRENCY_TYPE", length = 4)
	public String getTrxCurrencyType() {
		return this.trxCurrencyType;
	}

	public void setTrxCurrencyType(String trxCurrencyType) {
		this.trxCurrencyType = trxCurrencyType;
	}


	@Column(name = "EX_RATE", precision = 13, scale = 8)
	public BigDecimal getExRate() {
		return this.exRate;
	}

	public void setExRate(BigDecimal exRate) {
		this.exRate = exRate;
	}

	@Column(name = "ISSUING_BANK", length = 50)
	public String getIssuingBank() {
		return this.issuingBank;
	}

	public void setIssuingBank(String issuingBank) {
		this.issuingBank = issuingBank;
	}

	@Column(name = "PAYCON_TYPE", length = 4)
	public String getPayconType() {
		return this.payconType;
	}

	public void setPayconType(String payconType) {
		this.payconType = payconType;
	}

	@Column(name = "PAY_WAY", length = 4)
	public String getPayWay() {
		return this.payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	@Column(name = "TRX_STATE", length = 4)
	public String getTrxState() {
		return this.trxState;
	}

	public void setTrxState(String trxState) {
		this.trxState = trxState;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", length = 11)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 11)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "MEMO", length = 100)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "DRACC_NODE_CODE", length = 8)
	public String getDraccNodeCode() {
		return this.draccNodeCode;
	}

	public void setDraccNodeCode(String draccNodeCode) {
		this.draccNodeCode = draccNodeCode;
	}

	@Column(name = "CRACC_NODE_CODE", length = 8)
	public String getCraccNodeCode() {
		return this.craccNodeCode;
	}

	public void setCraccNodeCode(String craccNodeCode) {
		this.craccNodeCode = craccNodeCode;
	}

	@Column(name = "BUSI_TYPE", length = 4)
	public String getBusiType() {
		return this.busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getChnBatchNo() {
		return chnBatchNo;
	}

	public void setChnBatchNo(String chnBatchNo) {
		this.chnBatchNo = chnBatchNo;
	}

	public String getCusBatchNo() {
		return cusBatchNo;
	}

	public void setCusBatchNo(String cusBatchNo) {
		this.cusBatchNo = cusBatchNo;
	}
	

	public String getChnNo() {
		return chnNo;
	}

	public void setChnNo(String chnNo) {
		this.chnNo = chnNo;
	}

	public String getBussType() {
		return bussType;
	}

	public void setBussType(String bussType) {
		this.bussType = bussType;
	}

	public String getSacCurrency() {
		return sacCurrency;
	}

	public void setSacCurrency(String sacCurrency) {
		this.sacCurrency = sacCurrency;
	}

	public BigDecimal getSacAmount() {
		return sacAmount;
	}

	public void setSacAmount(BigDecimal sacAmount) {
		this.sacAmount = sacAmount;
	}

	public String getReversalStatus() {
		return reversalStatus;
	}

	public void setReversalStatus(String reversalStatus) {
		this.reversalStatus = reversalStatus;
	}

	public String getFinSign() {
		return finSign;
	}

	public void setFinSign(String finSign) {
		this.finSign = finSign;
	}

	public String getChaConStatus() {
		return chaConStatus;
	}

	public void setChaConStatus(String chaConStatus) {
		this.chaConStatus = chaConStatus;
	}

	public BigDecimal getChannelCost() {
		return channelCost;
	}

	public void setChannelCost(BigDecimal channelCost) {
		this.channelCost = channelCost;
	}

	public BigDecimal getCusCharge() {
		return cusCharge;
	}

	public void setCusCharge(BigDecimal cusCharge) {
		this.cusCharge = cusCharge;
	}

	public Date getTrxSuccTime() {
		return trxSuccTime;
	}

	public void setTrxSuccTime(Date trxSuccTime) {
		this.trxSuccTime = trxSuccTime;
	}

	

	

	

}