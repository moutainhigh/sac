package net.easipay.cbp.model;

// Generated 2015-7-2 9:35:55 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FinCode5 generated by hbm2java
 */
@Entity
@Table(name = "FIN_CODE5", schema = "SAC_SYN")
public class FinCode5 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2665307552622619933L;
	private String code5Id;
	private String codeName;

	public FinCode5() {
	}

	public FinCode5(String code5Id) {
		this.code5Id = code5Id;
	}

	public FinCode5(String code5Id, String codeName) {
		this.code5Id = code5Id;
		this.codeName = codeName;
	}

	@Id
	@Column(name = "CODE5_ID", unique = true, nullable = false, length = 2)
	public String getCode5Id() {
		return this.code5Id;
	}

	public void setCode5Id(String code5Id) {
		this.code5Id = code5Id;
	}

	@Column(name = "CODE_NAME", length = 100)
	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

}