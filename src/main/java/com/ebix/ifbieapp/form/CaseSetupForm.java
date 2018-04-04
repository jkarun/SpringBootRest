package com.ebix.ifbieapp.form;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CaseSetupForm {

	private String applicationState;
	private String signedAt;

	// PROPOSED INSURED DETAILS
	private String dob;
	private int age;
	private Character saveAge;

	// CASE INFORMATION
	// *Plan of Insurance -> Single Premium [display val: prodNm key:prodCd @
	// base_products]
	private String productType; // prodNm
	private String planOfInsurance; // prodCd
	private Character nicotineUsed;
	private Character nicotineUseInd;
	private String nicotineTypeCd;
	private String nicotineTypeOther;

	private Character pastNicotineUse;
	private String pastNicotineUseDate;

	private BigDecimal amountOfInsurance;

	public CaseSetupForm() {
	}

	public CaseSetupForm(String applicationState, String signedAt, String dob, int age, Character saveAge,
			String productType, String planOfInsurance, Character nicotineUsed, Character nicotineUseInd,
			String nicotineTypeCd, String nicotineTypeOther, Character pastNicotineUse, String pastNicotineUseDate,
			BigDecimal amountOfInsurance) {
		super();
		this.applicationState = applicationState;
		this.signedAt = signedAt;
		this.dob = dob;
		this.age = age;
		this.saveAge = saveAge;
		this.productType = productType;
		this.planOfInsurance = planOfInsurance;
		this.nicotineUsed = nicotineUsed;
		this.nicotineUseInd = nicotineUseInd;
		this.nicotineTypeCd = nicotineTypeCd;
		this.nicotineTypeOther = nicotineTypeOther;
		this.pastNicotineUse = pastNicotineUse;
		this.pastNicotineUseDate = pastNicotineUseDate;
		this.amountOfInsurance = amountOfInsurance;
	}

	public String getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}

	public String getSignedAt() {
		return signedAt;
	}

	public void setSignedAt(String signedAt) {
		this.signedAt = signedAt;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Character isSaveAge() {
		return saveAge;
	}

	public void setSaveAge(Character saveAge) {
		this.saveAge = saveAge;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPlanOfInsurance() {
		return planOfInsurance;
	}

	public void setPlanOfInsurance(String planOfInsurance) {
		this.planOfInsurance = planOfInsurance;
	}

	public Character isNicotineUsed() {
		return nicotineUsed;
	}

	public void setNicotineUsed(Character nicotineUsed) {
		this.nicotineUsed = nicotineUsed;
	}

	public Character getNicotineUseInd() {
		return nicotineUseInd;
	}

	public void setNicotineUseInd(Character nicotineUseInd) {
		this.nicotineUseInd = nicotineUseInd;
	}

	public String getNicotineTypeCd() {
		return nicotineTypeCd;
	}

	public void setNicotineTypeCd(String nicotineTypeCd) {
		this.nicotineTypeCd = nicotineTypeCd;
	}

	public String getNicotineTypeOther() {
		return nicotineTypeOther;
	}

	public void setNicotineTypeOther(String nicotineTypeOther) {
		this.nicotineTypeOther = nicotineTypeOther;
	}

	public Character getPastNicotineUse() {
		return pastNicotineUse;
	}

	public void setPastNicotineUse(Character pastNicotineUse) {
		this.pastNicotineUse = pastNicotineUse;
	}

	public String getPastNicotineUseDate() {
		return pastNicotineUseDate;
	}

	public void setPastNicotineUseDate(String pastNicotineUseDate) {
		this.pastNicotineUseDate = pastNicotineUseDate;
	}

	public BigDecimal getAmountOfInsurance() {
		return amountOfInsurance;
	}

	public void setAmountOfInsurance(BigDecimal amountOfInsurance) {
		this.amountOfInsurance = amountOfInsurance;
	}

	@Override
	public String toString() {
		return "CaseSetupForm [applicationState=" + applicationState + ", signedAt=" + signedAt + ", dob=" + dob
				+ ", age=" + age + ", saveAge=" + saveAge + ", productType=" + productType + ", planOfInsurance="
				+ planOfInsurance + ", nicotineUsed=" + nicotineUsed + ", nicotineUseInd=" + nicotineUseInd
				+ ", nicotineTypeCd=" + nicotineTypeCd + ", nicotineTypeOther=" + nicotineTypeOther
				+ ", pastNicotineUse=" + pastNicotineUse + ", pastNicotineUseDate=" + pastNicotineUseDate
				+ ", amountOfInsurance=" + amountOfInsurance + "]";
	}

}
