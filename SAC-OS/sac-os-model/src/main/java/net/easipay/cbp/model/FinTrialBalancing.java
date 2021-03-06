package net.easipay.cbp.model;

// Generated 2015-7-2 9:35:55 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FIN_STAT_BANK generated by hbm2java
 */
@Entity
@Table(name = "FIN_TRIAL_BALANCING", schema = "SAC_SYN")
public class FinTrialBalancing implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3053612474882855245L;
	private Long id;
	private String codeId;
	private String sacCurrency;
	private BigDecimal balance;
	private Date createTime;
	private String memo;
	private String codeName;
	private String direction;
	private BigDecimal diffBalance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getSacCurrency() {
		return sacCurrency;
	}
	public void setSacCurrency(String sacCurrency) {
		this.sacCurrency = sacCurrency;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public BigDecimal getDiffBalance() {
		return diffBalance;
	}
	public void setDiffBalance(BigDecimal diffBalance) {
		this.diffBalance = diffBalance;
	}
	
	


}
