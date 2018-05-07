/**
 * 
 */
package net.easipay.cbp.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author jjiang
 * @date 2017-03-20
 */

public class SacBalanceQueryForm implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7362945130925178886L;

	@NotBlank(message = "客户类型")
    @Pattern(regexp = "^|1|2$", message = "客户类型必须为1企业,2个人")
	private String cusType;
	
	@NotBlank(message = "组织机构号不能为空")
    private String orgCode;

    @NotBlank(message = "币种不能为空")
    private String currency;

    @NotBlank(message = "业务类型不能为空")
    @Pattern(regexp = "^000|00|20|21|22|23|30|40|41|50|60|70|71|80|90$", message = "业务类型必须为000全部,00默认,20航付通,21航付通专项 EIR放箱,22航付通专项 放箱打单费,23新航付通专项,30跨境B2C,40代付,41代收,50外汇通,60清算,70速结汇,71速汇通,80关税代付,90行邮税")
    private String bussType;
    
    @NotBlank(message = "余额类型不能为空")
    @Pattern(regexp = "^|00|01$", message = "余额类型必须为00全部,01可用")
    private String balType;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBussType() {
		return bussType;
	}

	public void setBussType(String bussType) {
		this.bussType = bussType;
	}

	public String getBalType() {
		return balType;
	}

	public void setBalType(String balType) {
		this.balType = balType;
	}

	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
    
	
    

}
