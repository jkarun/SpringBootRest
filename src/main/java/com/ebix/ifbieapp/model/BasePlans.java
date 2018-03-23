package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * BasePlans generated by hbm2java
 */
@Entity
@Table(name = "base_plans")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasePlans implements java.io.Serializable {

	private int planId;
	private String planCd;
	private String planNm;
	private String covTypCd;
	private String linOfBusinCd;
	private Integer companyId;
	private Integer prodId;
	private Date planExpyDt;
	private Date planEffDt;
	private Character priInsInd;
	private Character secInsInd;
	private Character othrInsInd;
	private Character covAmtReqdInd;
	private Character multiSelectInd;
	private Integer planRateClassId;
	private Character genderCd;
	private BigDecimal policyFee;
	private Integer planDiOccpClassId;
	private Character isSinglePremium;
	private BigDecimal singlePremiumAmt;
	private Character isPrefRequired;
	private Character isReqmntCreated;
	private Character isQuestnrRequired;
	private Character addIntoFaceAmt;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public BasePlans() {
	}

	public BasePlans(int planId, String planCd, char isDeletedInd, Date lstUpdtDtm) {
		this.planId = planId;
		this.planCd = planCd;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public BasePlans(int planId, String planCd, String planNm, String covTypCd, String linOfBusinCd, Integer companyId,
			Integer prodId, Date planExpyDt, Date planEffDt, Character priInsInd, Character secInsInd,
			Character othrInsInd, Character covAmtReqdInd, Character multiSelectInd, Integer planRateClassId,
			Character genderCd, BigDecimal policyFee, Integer planDiOccpClassId, Character isSinglePremium,
			BigDecimal singlePremiumAmt, Character isPrefRequired, Character isReqmntCreated,
			Character isQuestnrRequired, Character addIntoFaceAmt, char isDeletedInd, String lstUpdtUserId,
			Date lstUpdtDtm) {
		this.planId = planId;
		this.planCd = planCd;
		this.planNm = planNm;
		this.covTypCd = covTypCd;
		this.linOfBusinCd = linOfBusinCd;
		this.companyId = companyId;
		this.prodId = prodId;
		this.planExpyDt = planExpyDt;
		this.planEffDt = planEffDt;
		this.priInsInd = priInsInd;
		this.secInsInd = secInsInd;
		this.othrInsInd = othrInsInd;
		this.covAmtReqdInd = covAmtReqdInd;
		this.multiSelectInd = multiSelectInd;
		this.planRateClassId = planRateClassId;
		this.genderCd = genderCd;
		this.policyFee = policyFee;
		this.planDiOccpClassId = planDiOccpClassId;
		this.isSinglePremium = isSinglePremium;
		this.singlePremiumAmt = singlePremiumAmt;
		this.isPrefRequired = isPrefRequired;
		this.isReqmntCreated = isReqmntCreated;
		this.isQuestnrRequired = isQuestnrRequired;
		this.addIntoFaceAmt = addIntoFaceAmt;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id

	@Column(name = "plan_id", unique = true, nullable = false)
	public int getPlanId() {
		return this.planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	@Column(name = "plan_cd", nullable = false, length = 15)
	public String getPlanCd() {
		return this.planCd;
	}

	public void setPlanCd(String planCd) {
		this.planCd = planCd;
	}

	@Column(name = "plan_nm", length = 250)
	public String getPlanNm() {
		return this.planNm;
	}

	public void setPlanNm(String planNm) {
		this.planNm = planNm;
	}

	@Column(name = "cov_typ_cd", length = 8)
	public String getCovTypCd() {
		return this.covTypCd;
	}

	public void setCovTypCd(String covTypCd) {
		this.covTypCd = covTypCd;
	}

	@Column(name = "lin_of_busin_cd", length = 8)
	public String getLinOfBusinCd() {
		return this.linOfBusinCd;
	}

	public void setLinOfBusinCd(String linOfBusinCd) {
		this.linOfBusinCd = linOfBusinCd;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "prod_id")
	public Integer getProdId() {
		return this.prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "plan_expy_dt", length = 23)
	public Date getPlanExpyDt() {
		return this.planExpyDt;
	}

	public void setPlanExpyDt(Date planExpyDt) {
		this.planExpyDt = planExpyDt;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "plan_eff_dt", length = 23)
	public Date getPlanEffDt() {
		return this.planEffDt;
	}

	public void setPlanEffDt(Date planEffDt) {
		this.planEffDt = planEffDt;
	}

	@Column(name = "pri_ins_ind", length = 1)
	public Character getPriInsInd() {
		return this.priInsInd;
	}

	public void setPriInsInd(Character priInsInd) {
		this.priInsInd = priInsInd;
	}

	@Column(name = "sec_ins_ind", length = 1)
	public Character getSecInsInd() {
		return this.secInsInd;
	}

	public void setSecInsInd(Character secInsInd) {
		this.secInsInd = secInsInd;
	}

	@Column(name = "othr_ins_ind", length = 1)
	public Character getOthrInsInd() {
		return this.othrInsInd;
	}

	public void setOthrInsInd(Character othrInsInd) {
		this.othrInsInd = othrInsInd;
	}

	@Column(name = "cov_amt_reqd_ind", length = 1)
	public Character getCovAmtReqdInd() {
		return this.covAmtReqdInd;
	}

	public void setCovAmtReqdInd(Character covAmtReqdInd) {
		this.covAmtReqdInd = covAmtReqdInd;
	}

	@Column(name = "multi_select_ind", length = 1)
	public Character getMultiSelectInd() {
		return this.multiSelectInd;
	}

	public void setMultiSelectInd(Character multiSelectInd) {
		this.multiSelectInd = multiSelectInd;
	}

	@Column(name = "plan_rate_class_id")
	public Integer getPlanRateClassId() {
		return this.planRateClassId;
	}

	public void setPlanRateClassId(Integer planRateClassId) {
		this.planRateClassId = planRateClassId;
	}

	@Column(name = "gender_cd", length = 1)
	public Character getGenderCd() {
		return this.genderCd;
	}

	public void setGenderCd(Character genderCd) {
		this.genderCd = genderCd;
	}

	@Column(name = "policy_fee", precision = 12)
	public BigDecimal getPolicyFee() {
		return this.policyFee;
	}

	public void setPolicyFee(BigDecimal policyFee) {
		this.policyFee = policyFee;
	}

	@Column(name = "plan_di_occp_class_id")
	public Integer getPlanDiOccpClassId() {
		return this.planDiOccpClassId;
	}

	public void setPlanDiOccpClassId(Integer planDiOccpClassId) {
		this.planDiOccpClassId = planDiOccpClassId;
	}

	@Column(name = "is_single_premium", length = 1)
	public Character getIsSinglePremium() {
		return this.isSinglePremium;
	}

	public void setIsSinglePremium(Character isSinglePremium) {
		this.isSinglePremium = isSinglePremium;
	}

	@Column(name = "single_premium_amt", precision = 12)
	public BigDecimal getSinglePremiumAmt() {
		return this.singlePremiumAmt;
	}

	public void setSinglePremiumAmt(BigDecimal singlePremiumAmt) {
		this.singlePremiumAmt = singlePremiumAmt;
	}

	@Column(name = "is_pref_required", length = 1)
	public Character getIsPrefRequired() {
		return this.isPrefRequired;
	}

	public void setIsPrefRequired(Character isPrefRequired) {
		this.isPrefRequired = isPrefRequired;
	}

	@Column(name = "is_reqmnt_created", length = 1)
	public Character getIsReqmntCreated() {
		return this.isReqmntCreated;
	}

	public void setIsReqmntCreated(Character isReqmntCreated) {
		this.isReqmntCreated = isReqmntCreated;
	}

	@Column(name = "is_questnr_required", length = 1)
	public Character getIsQuestnrRequired() {
		return this.isQuestnrRequired;
	}

	public void setIsQuestnrRequired(Character isQuestnrRequired) {
		this.isQuestnrRequired = isQuestnrRequired;
	}

	@Column(name = "add_into_face_amt", length = 1)
	public Character getAddIntoFaceAmt() {
		return this.addIntoFaceAmt;
	}

	public void setAddIntoFaceAmt(Character addIntoFaceAmt) {
		this.addIntoFaceAmt = addIntoFaceAmt;
	}

	@Column(name = "is_deleted_ind", nullable = false, length = 1)
	public char getIsDeletedInd() {
		return this.isDeletedInd;
	}

	public void setIsDeletedInd(char isDeletedInd) {
		this.isDeletedInd = isDeletedInd;
	}

	@Column(name = "lst_updt_user_id", length = 50)
	public String getLstUpdtUserId() {
		return this.lstUpdtUserId;
	}

	public void setLstUpdtUserId(String lstUpdtUserId) {
		this.lstUpdtUserId = lstUpdtUserId;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lst_updt_dtm", nullable = false, length = 23)
	public Date getLstUpdtDtm() {
		return this.lstUpdtDtm;
	}

	public void setLstUpdtDtm(Date lstUpdtDtm) {
		this.lstUpdtDtm = lstUpdtDtm;
	}

}
