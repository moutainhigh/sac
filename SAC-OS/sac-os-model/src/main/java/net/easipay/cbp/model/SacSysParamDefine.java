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
 * SacSysParamDefine generated by hbm2java
 */
@Entity
@Table(name = "SAC_SYS_PARAM_DEFINE", schema = "SAC_SYN")
public class SacSysParamDefine implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5347265175255040040L;
	private Long id;
	private String paramKey;
	private String magicType;
	private String paramName;
	private String paramValue;
	private String paramDesc;
	private BigDecimal createUserId;
	private Date createTime;
	private BigDecimal updateUserId;
	private Date updateTime;
	private String memo;

	public SacSysParamDefine() {
	}

	public SacSysParamDefine(Long id, String paramKey, String magicType,
			String paramValue) {
		this.id = id;
		this.paramKey = paramKey;
		this.magicType = magicType;
		this.paramValue = paramValue;
	}

	public SacSysParamDefine(Long id, String paramKey, String magicType,
			String paramName, String paramValue, String paramDesc,
			BigDecimal createUserId, Date createTime, BigDecimal updateUserId,
			Date updateTime, String memo) {
		this.id = id;
		this.paramKey = paramKey;
		this.magicType = magicType;
		this.paramName = paramName;
		this.paramValue = paramValue;
		this.paramDesc = paramDesc;
		this.createUserId = createUserId;
		this.createTime = createTime;
		this.updateUserId = updateUserId;
		this.updateTime = updateTime;
		this.memo = memo;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "PARAM_KEY", nullable = false, length = 8)
	public String getParamKey() {
		return this.paramKey;
	}

	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	@Column(name = "MAGIC_TYPE", nullable = false, length = 16)
	public String getMagicType() {
		return this.magicType;
	}

	public void setMagicType(String magicType) {
		this.magicType = magicType;
	}

	@Column(name = "PARAM_NAME", length = 30)
	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	@Column(name = "PARAM_VALUE", nullable = false, length = 128)
	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	@Column(name = "PARAM_DESC", length = 128)
	public String getParamDesc() {
		return this.paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	@Column(name = "CREATE_USER_ID", scale = 0)
	public BigDecimal getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(BigDecimal createUserId) {
		this.createUserId = createUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 11)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATE_USER_ID", scale = 0)
	public BigDecimal getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(BigDecimal updateUserId) {
		this.updateUserId = updateUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", length = 11)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "MEMO", length = 256)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
