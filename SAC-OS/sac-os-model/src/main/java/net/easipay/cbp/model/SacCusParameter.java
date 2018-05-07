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
 * SacCusParameter generated by hbm2java
 */
@Entity
@Table(name = "SAC_CUS_PARAMETER", schema = "SAC_SYN")
public class SacCusParameter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 266912375772298851L;
	private Long id;
	private String cusNo;
	private String merchantNcode;
	private String cusName;
	private String cusPlatAcc;
	private String cusPlatAccName;
	private String bussType;
	private String refundFlag;
	private String sacBankAcc;
	private String accName;
	private String depositBank;
	private String craccBankCode;
	private BigDecimal feeRate;
	private String feeComWay;
	private String feeSacWay;
	private String sacType;
	private String sacPeriod;
	private Long intervalNumber;
	private String sacCurrency;
	private BigDecimal sacStartAmount;
	private BigDecimal trxUpLim;
	private Date createTime;
	private Date updateTime;
	private String isValidFlag;
	private String memo;
	private String orgCardId;

	public SacCusParameter() {
	}

	public SacCusParameter(Long id, String cusNo, String cusPlatAcc,
			String cusPlatAccName, String bussType, 
			String refundFlag, String currencyType, String sacBankAcc,
			String accName, String depositBank, String sacType,
			String sacCurrency) {
		this.id = id;
		this.cusNo = cusNo;
		this.cusPlatAcc = cusPlatAcc;
		this.cusPlatAccName = cusPlatAccName;
		this.bussType = bussType;
		this.refundFlag = refundFlag;
		this.sacBankAcc = sacBankAcc;
		this.accName = accName;
		this.depositBank = depositBank;
		this.sacType = sacType;
		this.sacCurrency = sacCurrency;
	}

	public SacCusParameter(Long id, String cusNo, String cusPlatAcc,
			String cusPlatAccName, String bussType, 
			String refundFlag, String currencyType, String sacBankAcc,
			String accName, String depositBank, String craccBankCode,
			BigDecimal feeRate, String feeComWay, String feeSacWay,
			String sacPeriod, BigDecimal trxUpLim, Date createTime,
			String memo, String sacType, String sacCurrency,
			BigDecimal sacStartAmount, Date updateTime, String isValidFlag) {
		this.id = id;
		this.cusNo = cusNo;
		this.cusPlatAcc = cusPlatAcc;
		this.cusPlatAccName = cusPlatAccName;
		this.bussType = bussType;
		this.refundFlag = refundFlag;
		this.sacBankAcc = sacBankAcc;
		this.accName = accName;
		this.depositBank = depositBank;
		this.craccBankCode = craccBankCode;
		this.feeRate = feeRate;
		this.feeComWay = feeComWay;
		this.feeSacWay = feeSacWay;
		this.sacPeriod = sacPeriod;
		this.trxUpLim = trxUpLim;
		this.createTime = createTime;
		this.memo = memo;
		this.sacType = sacType;
		this.sacCurrency = sacCurrency;
		this.sacStartAmount = sacStartAmount;
		this.updateTime = updateTime;
		this.isValidFlag = isValidFlag;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CUS_NO", nullable = false, length = 8)
	public String getCusNo() {
		return this.cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	@Column(name = "CUS_PLAT_ACC", nullable = false, length = 30)
	public String getCusPlatAcc() {
		return this.cusPlatAcc;
	}

	public void setCusPlatAcc(String cusPlatAcc) {
		this.cusPlatAcc = cusPlatAcc;
	}

	@Column(name = "CUS_PLAT_ACC_NAME", nullable = false, length = 50)
	public String getCusPlatAccName() {
		return this.cusPlatAccName;
	}

	public void setCusPlatAccName(String cusPlatAccName) {
		this.cusPlatAccName = cusPlatAccName;
	}

	@Column(name = "BUSS_TYPE", nullable = false, length = 8)
	public String getBussType() {
		return this.bussType;
	}

	public void setBussType(String bussType) {
		this.bussType = bussType;
	}

	@Column(name = "REFUND_FLAG", nullable = false, length = 1)
	public String getRefundFlag() {
		return this.refundFlag;
	}

	public void setRefundFlag(String refundFlag) {
		this.refundFlag = refundFlag;
	}


	@Column(name = "SAC_BANK_ACC", nullable = false, length = 30)
	public String getSacBankAcc() {
		return this.sacBankAcc;
	}

	public void setSacBankAcc(String sacBankAcc) {
		this.sacBankAcc = sacBankAcc;
	}

	@Column(name = "ACC_NAME", nullable = false, length = 30)
	public String getAccName() {
		return this.accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Column(name = "DEPOSIT_BANK", nullable = false, length = 50)
	public String getDepositBank() {
		return this.depositBank;
	}

	public void setDepositBank(String depositBank) {
		this.depositBank = depositBank;
	}

	@Column(name = "CRACC_BANK_CODE", length = 30)
	public String getCraccBankCode() {
		return this.craccBankCode;
	}

	public void setCraccBankCode(String craccBankCode) {
		this.craccBankCode = craccBankCode;
	}

	@Column(name = "FEE_RATE")
	public BigDecimal getFeeRate() {
		return this.feeRate;
	}

	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
	}

	@Column(name = "FEE_COM_WAY", length = 8)
	public String getFeeComWay() {
		return this.feeComWay;
	}

	public void setFeeComWay(String feeComWay) {
		this.feeComWay = feeComWay;
	}

	@Column(name = "FEE_SAC_WAY", length = 8)
	public String getFeeSacWay() {
		return this.feeSacWay;
	}

	public void setFeeSacWay(String feeSacWay) {
		this.feeSacWay = feeSacWay;
	}

	@Column(name = "SAC_PERIOD", length = 8)
	public String getSacPeriod() {
		return this.sacPeriod;
	}

	public void setSacPeriod(String sacPeriod) {
		this.sacPeriod = sacPeriod;
	}

	@Column(name = "TRX_UP_LIM")
	public BigDecimal getTrxUpLim() {
		return this.trxUpLim;
	}

	public void setTrxUpLim(BigDecimal trxUpLim) {
		this.trxUpLim = trxUpLim;
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

	@Column(name = "SAC_TYPE", nullable = false, length = 4)
	public String getSacType() {
		return this.sacType;
	}

	public void setSacType(String sacType) {
		this.sacType = sacType;
	}

	@Column(name = "SAC_CURRENCY", nullable = false, length = 4)
	public String getSacCurrency() {
		return this.sacCurrency;
	}

	public void setSacCurrency(String sacCurrency) {
		this.sacCurrency = sacCurrency;
	}

	@Column(name = "SAC_START_AMOUNT")
	public BigDecimal getSacStartAmount() {
		return this.sacStartAmount;
	}

	public void setSacStartAmount(BigDecimal sacStartAmount) {
		this.sacStartAmount = sacStartAmount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", length = 11)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "IS_VALID_FLAG", length = 2)
	public String getIsValidFlag() {
		return this.isValidFlag;
	}

	public void setIsValidFlag(String isValidFlag) {
		this.isValidFlag = isValidFlag;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public Long getIntervalNumber() {
		return intervalNumber;
	}

	public void setIntervalNumber(Long intervalNumber) {
		this.intervalNumber = intervalNumber;
	}

	public String getMerchantNcode() {
		return merchantNcode;
	}

	public void setMerchantNcode(String merchantNcode) {
		this.merchantNcode = merchantNcode;
	}

	public String getOrgCardId() {
		return orgCardId;
	}

	public void setOrgCardId(String orgCardId) {
		this.orgCardId = orgCardId;
	}
	
	

}
