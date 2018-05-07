<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ taglib prefix="easipay" uri="/WEB-INF/tag/easipay-tag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="${ctx}/scripts/wdatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	$(function(){
		/* 下拉选项默认赋值  */
		var currencyType = "${currencyType}";/* 币种   */
		$('select[name="currencyType"]').find("option[value="+currencyType+"]").attr("selected",true);
		
		/* 点击查询时 */
		$("#query").click(function(){
			var startDate = $("#startDate").val();
			if(startDate==""){
				$("#validateDateMsg").html("起始日期不能为空! ");
				return false;
			}else{
				$("#reportFormQuery").submit();
			}
		});
		/* 点击下载按钮  */
		$("#download").click(function(){
			$("#reportFormQuery").attr("action","${ctx}/cusPaymentDetailDownload").submit();
			$("#reportFormQuery").attr("action","${ctx}/cusPaymentDetailQuery");
		});
	});
</script>
<title>商户结算应付款明细查询及下载</title>
</head>
<body>
	<div class="content">
	 	<div class="con ">
	 		<form id="reportFormQuery" action="cusPaymentDetailQuery" method="post">
	 			<div class="table fontcolor4 fontsize1 fontfamily2">
	 				<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td align="right">交易日期(起):</td>
							<td>
								<input type="text" class="txt2" id="startDate" name="startDate" value="${startDate}" 
									onfocus="WdatePicker({readOnly:true,maxDate:'#F{$dp.$D(\'endDate\')||\'%y-%M-%d\'}',dateFmt:'yyyyMMdd'})"/>
							</td>
							<td align="right">交易日期(止):</td>
							<td>
								<input type="text" class="txt2"  id="endDate" name="endDate" value="${endDate}" 
									onfocus="WdatePicker({readOnly:true,minDate:'#F{$dp.$D(\'startDate\')}',dateFmt:'yyyyMMdd',maxDate:'%y-%M-%d'})"/>
							</td>
							<td><span id="validateDateMsg" style="color: red;"></span></td>
						</tr>
						<tr>
							<td align="right">商户名称：</td>
							<td>
								<input type="text" class="txt2" name="cusNo" value="${cusNo}"/>
							</td>
							<td align="right">币种：</td>
							<td>
								<select name="currencyType" class="select1" >
									<option value="" >全部</option>
									<c:forEach items="${ccyMap}" var="ccy">
										<option value="${ccy.key}" >${ccy.value}</option>
									</c:forEach>
								</select>
							</td>
							<td>
								<input id="query" class="bluebtn" type="button" value="查询">
								<input id="download" class="bluebtn" type="button" value="下载">
							</td>
						</tr> 				
	 				</table>
	 			</div>
			</form>
	 	</div>
	 	<div class="table fontcolor4 fontsize1 fontfamily2">
	 		<table width="100%" border="0" cellpadding="0" cellspacing="0">
	 			<tr height="35" bgcolor="#cccccc">
	 				<th>商户号</th>
					<th>商户名称</th>
					<th>交易日期</th>
					<th>清算日期</th>
					<th>业务类型</th>
					<th>交易类型</th>
					<th>笔数</th>
					<th>总金额</th>
					<th>币种</th>
					<th>商户手续费</th>
					<th>商户结算总金额</th>
					<th>是否已结算</th>
					<th>结算批次号</th>
	 			</tr>
	 			<c:if test="${empty cusPaymentDetailList}">
                    <tr>
                        <td class="fontfamily1" colspan="5" align="center">没有相关记录!</td>
                    </tr>
                </c:if>
                <c:set var="totalAmount" value="0"></c:set>
                <c:set var="sacAmount" value="0"></c:set>
                <c:forEach var="cusPaymentDetail" items="${cusPaymentDetailList}" varStatus="status">
               	<c:choose>
                       <c:when test="${status.index %2 == 0 }">
                           <tr align="center" height="35">
                       </c:when>
                       <c:otherwise>
                           <tr align="center" height="35" bgcolor="#eeeeee">
                       </c:otherwise>
                    </c:choose>
                  	<td class="fontfamily1">${cusPaymentDetail.cusNo}</td>
					<td class="fontfamily1">${cusPaymentDetail.cusName}</td>
					<td class="fontfamily1">${cusPaymentDetail.trxDate}</td>
					<td class="fontfamily1">${cusPaymentDetail.sacDate}</td>
					<td class="fontfamily1">${cusPaymentDetail.bussType}</td>
					<td class="fontfamily1">${cusPaymentDetail.trxType}</td>
					<td class="fontfamily1">${cusPaymentDetail.totalNum}</td>
					<td class="fontfamily1">${cusPaymentDetail.totalAmount}</td>
					<td class="fontfamily1">${cusPaymentDetail.currencyType}</td>
					<td class="fontfamily1">${cusPaymentDetail.fees}</td>
					<td class="fontfamily1">${cusPaymentDetail.sacAmount}</td>
					<td class="fontfamily1">${cusPaymentDetail.sacSign}</td>
					<td class="fontfamily1">${cusPaymentDetail.setBatchNo}</td>
				</tr>
               </c:forEach>
               <c:forEach items="${countList}" var="countMap" varStatus="status">
               		<tr align="center" height="35">
                		<td class="fontfamily1" colspan="7" align="right">${status.index eq 0?"查询总汇总:":""}</td>
						<td class="fontfamily1">${countMap.ALL_TOTAL_AMOUNT}</td>
						<td class="fontfamily1">${countMap.CURRENCY_TYPE}</td>
						<td class="fontfamily1"></td>
						<td class="fontfamily1">${countMap.ALL_SAC_AMOUNT}</td>
					</tr>
				</c:forEach>
	 		</table>
	 		<div style="width: 100%; height: 32px; text-align: right;"id="pageDiv" class="pagination1 btn">
	 			<table width="100%" cellspacing="0" cellpadding="0" height="24">
					<tr>
						<td align="right" height="24">
							<easipay:pageNum pageSize="${pageSize}" count="${totalCount}" pageNo="${pageNo}" url="/cusPaymentDetailQuery"/>
						</td>
					</tr>
				</table>
	 		</div>
	 	</div>
	 </div>
</body>
</html>