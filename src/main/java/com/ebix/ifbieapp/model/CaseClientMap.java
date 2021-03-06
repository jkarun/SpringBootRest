package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * CaseClientMap generated by hbm2java
 */
@Entity
@Table(name = "case_client_map")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseClientMap implements java.io.Serializable {

	private Integer caseClientMapId;
	private AppCase appCase;
	private ClientDetails clientDetails;
	private Integer age;
	private Character hazardousSportDrivingLicenseRevokeIndicator;
	private String stakeholderType;
	private String relationshipWithStakeholder;
	private String relatedStakeholderType;
	private Character maritalStatusCd;
	private String maritalStatusOther;
	private Character driverInd;
	private Character estatePlanningInd;
	private String stakeholderDesignation;
	private BigDecimal stakeholderSharePercentage;
	private Character evenlyDistributedInd;
	private String additionalCommentsForStakeholder;
	private Character trustFirstLastPagePossessingInd;
	private Character charitableInd;
	private String addressMatchingStakeholderType;
	private Character spouseTermRiderInd;
	private Character assignmentOtherThanOwnerInd;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;
	private String isPipelineInsured;
	private String heightInches;
	private String weight;
	private Character backUpWithHoldingInd;
	private String relationShipOther;
	private String permTableRating;
	private Integer planRateClassId;
	private String otherRelationship;
	private Boolean status;
	private Boolean questionaireStatus;
	private Boolean questionaireNoToAll;
	private Set<CaseClientAddressDetails> caseClientAddressDetailses = new HashSet<CaseClientAddressDetails>(0);
	private Set<CaseClientFlatextra> caseClientFlatextras = new HashSet<CaseClientFlatextra>(0);
	private Set<CaseClientEmploymentDetails> caseClientEmploymentDetailses = new HashSet<CaseClientEmploymentDetails>(
			0);
	private Set<CaseClientInforceDetails> caseClientInforceDetailses = new HashSet<CaseClientInforceDetails>(0);
	private Set<CaseInsureNicotineUsage> caseInsureNicotineUsages = new HashSet<CaseInsureNicotineUsage>(0);
	private Set<Revocable> revocables = new HashSet<Revocable>(0);
	private Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseBeneficiaryId = new HashSet<CaseBeneficiaryStakeholderMap>(
			0);
	private Set<CaseClientDrivingInfo> caseClientDrivingInfos = new HashSet<CaseClientDrivingInfo>(0);
	private Set<Rider> riders = new HashSet<Rider>(0);
	private Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseClientMapId = new HashSet<CaseBeneficiaryStakeholderMap>(
			0);
	private Set<CaseClientEstatePlanning> caseClientEstatePlannings = new HashSet<CaseClientEstatePlanning>(0);
	private Set<CaseClientCoverage> caseClientCoverages = new HashSet<CaseClientCoverage>(0);
	private Set<CaseClientReplacingInforcePolicyDetails> caseClientReplacingInforcePolicyDetailses = new HashSet<CaseClientReplacingInforcePolicyDetails>(
			0);
	private Set<CaseClientQuestionResponse> caseClientQuestionResponses = new HashSet<CaseClientQuestionResponse>(0);
	private Set<CaseClientContactDetails> caseClientContactDetailses = new HashSet<CaseClientContactDetails>(0);
	private Set<CaseClientCitizenshipDetails> caseClientCitizenshipDetailses = new HashSet<CaseClientCitizenshipDetails>(
			0);

	public CaseClientMap() {
	}

	public CaseClientMap(char isDeletedInd, Date lstUpdtDtm) {
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public CaseClientMap(AppCase appCase, ClientDetails clientDetails, Integer age,
			Character hazardousSportDrivingLicenseRevokeIndicator, String stakeholderType,
			String relationshipWithStakeholder, String relatedStakeholderType, Character maritalStatusCd,
			String maritalStatusOther, Character driverInd, Character estatePlanningInd, String stakeholderDesignation,
			BigDecimal stakeholderSharePercentage, Character evenlyDistributedInd,
			String additionalCommentsForStakeholder, Character trustFirstLastPagePossessingInd, Character charitableInd,
			String addressMatchingStakeholderType, Character spouseTermRiderInd, Character assignmentOtherThanOwnerInd,
			char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, String isPipelineInsured, String heightInches,
			String weight, Character backUpWithHoldingInd, String relationShipOther, String permTableRating,
			Integer planRateClassId, String otherRelationship, Boolean status, Boolean questionaireStatus,
			Boolean questionaireNoToAll, Set<CaseClientAddressDetails> caseClientAddressDetailses,
			Set<CaseClientFlatextra> caseClientFlatextras,
			Set<CaseClientEmploymentDetails> caseClientEmploymentDetailses,
			Set<CaseClientInforceDetails> caseClientInforceDetailses,
			Set<CaseInsureNicotineUsage> caseInsureNicotineUsages, Set<Revocable> revocables,
			Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseBeneficiaryId,
			Set<CaseClientDrivingInfo> caseClientDrivingInfos, Set<Rider> riders,
			Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseClientMapId,
			Set<CaseClientEstatePlanning> caseClientEstatePlannings, Set<CaseClientCoverage> caseClientCoverages,
			Set<CaseClientReplacingInforcePolicyDetails> caseClientReplacingInforcePolicyDetailses,
			Set<CaseClientQuestionResponse> caseClientQuestionResponses,
			Set<CaseClientContactDetails> caseClientContactDetailses,
			Set<CaseClientCitizenshipDetails> caseClientCitizenshipDetailses) {
		this.appCase = appCase;
		this.clientDetails = clientDetails;
		this.age = age;
		this.hazardousSportDrivingLicenseRevokeIndicator = hazardousSportDrivingLicenseRevokeIndicator;
		this.stakeholderType = stakeholderType;
		this.relationshipWithStakeholder = relationshipWithStakeholder;
		this.relatedStakeholderType = relatedStakeholderType;
		this.maritalStatusCd = maritalStatusCd;
		this.maritalStatusOther = maritalStatusOther;
		this.driverInd = driverInd;
		this.estatePlanningInd = estatePlanningInd;
		this.stakeholderDesignation = stakeholderDesignation;
		this.stakeholderSharePercentage = stakeholderSharePercentage;
		this.evenlyDistributedInd = evenlyDistributedInd;
		this.additionalCommentsForStakeholder = additionalCommentsForStakeholder;
		this.trustFirstLastPagePossessingInd = trustFirstLastPagePossessingInd;
		this.charitableInd = charitableInd;
		this.addressMatchingStakeholderType = addressMatchingStakeholderType;
		this.spouseTermRiderInd = spouseTermRiderInd;
		this.assignmentOtherThanOwnerInd = assignmentOtherThanOwnerInd;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
		this.isPipelineInsured = isPipelineInsured;
		this.heightInches = heightInches;
		this.weight = weight;
		this.backUpWithHoldingInd = backUpWithHoldingInd;
		this.relationShipOther = relationShipOther;
		this.permTableRating = permTableRating;
		this.planRateClassId = planRateClassId;
		this.otherRelationship = otherRelationship;
		this.status = status;
		this.questionaireStatus = questionaireStatus;
		this.questionaireNoToAll = questionaireNoToAll;
		this.caseClientAddressDetailses = caseClientAddressDetailses;
		this.caseClientFlatextras = caseClientFlatextras;
		this.caseClientEmploymentDetailses = caseClientEmploymentDetailses;
		this.caseClientInforceDetailses = caseClientInforceDetailses;
		this.caseInsureNicotineUsages = caseInsureNicotineUsages;
		this.revocables = revocables;
		this.caseBeneficiaryStakeholderMapsForCaseBeneficiaryId = caseBeneficiaryStakeholderMapsForCaseBeneficiaryId;
		this.caseClientDrivingInfos = caseClientDrivingInfos;
		this.riders = riders;
		this.caseBeneficiaryStakeholderMapsForCaseClientMapId = caseBeneficiaryStakeholderMapsForCaseClientMapId;
		this.caseClientEstatePlannings = caseClientEstatePlannings;
		this.caseClientCoverages = caseClientCoverages;
		this.caseClientReplacingInforcePolicyDetailses = caseClientReplacingInforcePolicyDetailses;
		this.caseClientQuestionResponses = caseClientQuestionResponses;
		this.caseClientContactDetailses = caseClientContactDetailses;
		this.caseClientCitizenshipDetailses = caseClientCitizenshipDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "case_client_map_id", unique = true, nullable = false)
	public Integer getCaseClientMapId() {
		return this.caseClientMapId;
	}

	public void setCaseClientMapId(Integer caseClientMapId) {
		this.caseClientMapId = caseClientMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id")
	public AppCase getAppCase() {
		return this.appCase;
	}

	public void setAppCase(AppCase appCase) {
		this.appCase = appCase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_details_id")
	public ClientDetails getClientDetails() {
		return this.clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "hazardous_sport_driving_license_revoke_indicator", length = 1)
	public Character getHazardousSportDrivingLicenseRevokeIndicator() {
		return this.hazardousSportDrivingLicenseRevokeIndicator;
	}

	public void setHazardousSportDrivingLicenseRevokeIndicator(Character hazardousSportDrivingLicenseRevokeIndicator) {
		this.hazardousSportDrivingLicenseRevokeIndicator = hazardousSportDrivingLicenseRevokeIndicator;
	}

	@Column(name = "stakeholder_type", length = 8)
	public String getStakeholderType() {
		return this.stakeholderType;
	}

	public void setStakeholderType(String stakeholderType) {
		this.stakeholderType = stakeholderType;
	}

	@Column(name = "relationship_with_stakeholder", length = 50)
	public String getRelationshipWithStakeholder() {
		return this.relationshipWithStakeholder;
	}

	public void setRelationshipWithStakeholder(String relationshipWithStakeholder) {
		this.relationshipWithStakeholder = relationshipWithStakeholder;
	}

	@Column(name = "related_stakeholder_type", length = 20)
	public String getRelatedStakeholderType() {
		return this.relatedStakeholderType;
	}

	public void setRelatedStakeholderType(String relatedStakeholderType) {
		this.relatedStakeholderType = relatedStakeholderType;
	}

	@Column(name = "marital_status_cd", length = 1)
	public Character getMaritalStatusCd() {
		return this.maritalStatusCd;
	}

	public void setMaritalStatusCd(Character maritalStatusCd) {
		this.maritalStatusCd = maritalStatusCd;
	}

	@Column(name = "marital_status_other", length = 20)
	public String getMaritalStatusOther() {
		return this.maritalStatusOther;
	}

	public void setMaritalStatusOther(String maritalStatusOther) {
		this.maritalStatusOther = maritalStatusOther;
	}

	@Column(name = "driver_ind", length = 1)
	public Character getDriverInd() {
		return this.driverInd;
	}

	public void setDriverInd(Character driverInd) {
		this.driverInd = driverInd;
	}

	@Column(name = "estate_planning_ind", length = 1)
	public Character getEstatePlanningInd() {
		return this.estatePlanningInd;
	}

	public void setEstatePlanningInd(Character estatePlanningInd) {
		this.estatePlanningInd = estatePlanningInd;
	}

	@Column(name = "stakeholder_designation", length = 20)
	public String getStakeholderDesignation() {
		return this.stakeholderDesignation;
	}

	public void setStakeholderDesignation(String stakeholderDesignation) {
		this.stakeholderDesignation = stakeholderDesignation;
	}

	@Column(name = "stakeholder_share_percentage", precision = 5)
	public BigDecimal getStakeholderSharePercentage() {
		return this.stakeholderSharePercentage;
	}

	public void setStakeholderSharePercentage(BigDecimal stakeholderSharePercentage) {
		this.stakeholderSharePercentage = stakeholderSharePercentage;
	}

	@Column(name = "evenly_distributed_ind", length = 1)
	public Character getEvenlyDistributedInd() {
		return this.evenlyDistributedInd;
	}

	public void setEvenlyDistributedInd(Character evenlyDistributedInd) {
		this.evenlyDistributedInd = evenlyDistributedInd;
	}

	@Column(name = "additional_comments_for_stakeholder", length = 1000)
	public String getAdditionalCommentsForStakeholder() {
		return this.additionalCommentsForStakeholder;
	}

	public void setAdditionalCommentsForStakeholder(String additionalCommentsForStakeholder) {
		this.additionalCommentsForStakeholder = additionalCommentsForStakeholder;
	}

	@Column(name = "trust_first_last_page_possessing_ind", length = 1)
	public Character getTrustFirstLastPagePossessingInd() {
		return this.trustFirstLastPagePossessingInd;
	}

	public void setTrustFirstLastPagePossessingInd(Character trustFirstLastPagePossessingInd) {
		this.trustFirstLastPagePossessingInd = trustFirstLastPagePossessingInd;
	}

	@Column(name = "charitable_ind", length = 1)
	public Character getCharitableInd() {
		return this.charitableInd;
	}

	public void setCharitableInd(Character charitableInd) {
		this.charitableInd = charitableInd;
	}

	@Column(name = "address_matching_stakeholder_type", length = 50)
	public String getAddressMatchingStakeholderType() {
		return this.addressMatchingStakeholderType;
	}

	public void setAddressMatchingStakeholderType(String addressMatchingStakeholderType) {
		this.addressMatchingStakeholderType = addressMatchingStakeholderType;
	}

	@Column(name = "spouse_term_rider_ind", length = 1)
	public Character getSpouseTermRiderInd() {
		return this.spouseTermRiderInd;
	}

	public void setSpouseTermRiderInd(Character spouseTermRiderInd) {
		this.spouseTermRiderInd = spouseTermRiderInd;
	}

	@Column(name = "assignment_other_than_owner_ind", length = 1)
	public Character getAssignmentOtherThanOwnerInd() {
		return this.assignmentOtherThanOwnerInd;
	}

	public void setAssignmentOtherThanOwnerInd(Character assignmentOtherThanOwnerInd) {
		this.assignmentOtherThanOwnerInd = assignmentOtherThanOwnerInd;
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

	@Column(name = "is_pipeline_insured", length = 3)
	public String getIsPipelineInsured() {
		return this.isPipelineInsured;
	}

	public void setIsPipelineInsured(String isPipelineInsured) {
		this.isPipelineInsured = isPipelineInsured;
	}

	@Column(name = "height_inches", length = 3)
	public String getHeightInches() {
		return this.heightInches;
	}

	public void setHeightInches(String heightInches) {
		this.heightInches = heightInches;
	}

	@Column(name = "weight", length = 5)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "backUpWithHolding_ind", length = 1)
	public Character getBackUpWithHoldingInd() {
		return this.backUpWithHoldingInd;
	}

	public void setBackUpWithHoldingInd(Character backUpWithHoldingInd) {
		this.backUpWithHoldingInd = backUpWithHoldingInd;
	}

	@Column(name = "relationShip_Other", length = 50)
	public String getRelationShipOther() {
		return this.relationShipOther;
	}

	public void setRelationShipOther(String relationShipOther) {
		this.relationShipOther = relationShipOther;
	}

	@Column(name = "perm_table_rating", length = 50)
	public String getPermTableRating() {
		return this.permTableRating;
	}

	public void setPermTableRating(String permTableRating) {
		this.permTableRating = permTableRating;
	}

	@Column(name = "plan_rate_class_id")
	public Integer getPlanRateClassId() {
		return this.planRateClassId;
	}

	public void setPlanRateClassId(Integer planRateClassId) {
		this.planRateClassId = planRateClassId;
	}

	@Column(name = "other_relationship", length = 50)
	public String getOtherRelationship() {
		return this.otherRelationship;
	}

	public void setOtherRelationship(String otherRelationship) {
		this.otherRelationship = otherRelationship;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "questionaire_status")
	public Boolean getQuestionaireStatus() {
		return this.questionaireStatus;
	}

	public void setQuestionaireStatus(Boolean questionaireStatus) {
		this.questionaireStatus = questionaireStatus;
	}

	@Column(name = "questionaire_noToAll")
	public Boolean getQuestionaireNoToAll() {
		return this.questionaireNoToAll;
	}

	public void setQuestionaireNoToAll(Boolean questionaireNoToAll) {
		this.questionaireNoToAll = questionaireNoToAll;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientAddressDetails> getCaseClientAddressDetailses() {
		return this.caseClientAddressDetailses;
	}

	public void setCaseClientAddressDetailses(Set<CaseClientAddressDetails> caseClientAddressDetailses) {
		this.caseClientAddressDetailses = caseClientAddressDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientFlatextra> getCaseClientFlatextras() {
		return this.caseClientFlatextras;
	}

	public void setCaseClientFlatextras(Set<CaseClientFlatextra> caseClientFlatextras) {
		this.caseClientFlatextras = caseClientFlatextras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientEmploymentDetails> getCaseClientEmploymentDetailses() {
		return this.caseClientEmploymentDetailses;
	}

	public void setCaseClientEmploymentDetailses(Set<CaseClientEmploymentDetails> caseClientEmploymentDetailses) {
		this.caseClientEmploymentDetailses = caseClientEmploymentDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientInforceDetails> getCaseClientInforceDetailses() {
		return this.caseClientInforceDetailses;
	}

	public void setCaseClientInforceDetailses(Set<CaseClientInforceDetails> caseClientInforceDetailses) {
		this.caseClientInforceDetailses = caseClientInforceDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseInsureNicotineUsage> getCaseInsureNicotineUsages() {
		return this.caseInsureNicotineUsages;
	}

	public void setCaseInsureNicotineUsages(Set<CaseInsureNicotineUsage> caseInsureNicotineUsages) {
		this.caseInsureNicotineUsages = caseInsureNicotineUsages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<Revocable> getRevocables() {
		return this.revocables;
	}

	public void setRevocables(Set<Revocable> revocables) {
		this.revocables = revocables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMapByCaseBeneficiaryId")
	public Set<CaseBeneficiaryStakeholderMap> getCaseBeneficiaryStakeholderMapsForCaseBeneficiaryId() {
		return this.caseBeneficiaryStakeholderMapsForCaseBeneficiaryId;
	}

	public void setCaseBeneficiaryStakeholderMapsForCaseBeneficiaryId(
			Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseBeneficiaryId) {
		this.caseBeneficiaryStakeholderMapsForCaseBeneficiaryId = caseBeneficiaryStakeholderMapsForCaseBeneficiaryId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientDrivingInfo> getCaseClientDrivingInfos() {
		return this.caseClientDrivingInfos;
	}

	public void setCaseClientDrivingInfos(Set<CaseClientDrivingInfo> caseClientDrivingInfos) {
		this.caseClientDrivingInfos = caseClientDrivingInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<Rider> getRiders() {
		return this.riders;
	}

	public void setRiders(Set<Rider> riders) {
		this.riders = riders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMapByCaseClientMapId")
	public Set<CaseBeneficiaryStakeholderMap> getCaseBeneficiaryStakeholderMapsForCaseClientMapId() {
		return this.caseBeneficiaryStakeholderMapsForCaseClientMapId;
	}

	public void setCaseBeneficiaryStakeholderMapsForCaseClientMapId(
			Set<CaseBeneficiaryStakeholderMap> caseBeneficiaryStakeholderMapsForCaseClientMapId) {
		this.caseBeneficiaryStakeholderMapsForCaseClientMapId = caseBeneficiaryStakeholderMapsForCaseClientMapId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientEstatePlanning> getCaseClientEstatePlannings() {
		return this.caseClientEstatePlannings;
	}

	public void setCaseClientEstatePlannings(Set<CaseClientEstatePlanning> caseClientEstatePlannings) {
		this.caseClientEstatePlannings = caseClientEstatePlannings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientCoverage> getCaseClientCoverages() {
		return this.caseClientCoverages;
	}

	public void setCaseClientCoverages(Set<CaseClientCoverage> caseClientCoverages) {
		this.caseClientCoverages = caseClientCoverages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientReplacingInforcePolicyDetails> getCaseClientReplacingInforcePolicyDetailses() {
		return this.caseClientReplacingInforcePolicyDetailses;
	}

	public void setCaseClientReplacingInforcePolicyDetailses(
			Set<CaseClientReplacingInforcePolicyDetails> caseClientReplacingInforcePolicyDetailses) {
		this.caseClientReplacingInforcePolicyDetailses = caseClientReplacingInforcePolicyDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientQuestionResponse> getCaseClientQuestionResponses() {
		return this.caseClientQuestionResponses;
	}

	public void setCaseClientQuestionResponses(Set<CaseClientQuestionResponse> caseClientQuestionResponses) {
		this.caseClientQuestionResponses = caseClientQuestionResponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientContactDetails> getCaseClientContactDetailses() {
		return this.caseClientContactDetailses;
	}

	public void setCaseClientContactDetailses(Set<CaseClientContactDetails> caseClientContactDetailses) {
		this.caseClientContactDetailses = caseClientContactDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caseClientMap")
	public Set<CaseClientCitizenshipDetails> getCaseClientCitizenshipDetailses() {
		return this.caseClientCitizenshipDetailses;
	}

	public void setCaseClientCitizenshipDetailses(Set<CaseClientCitizenshipDetails> caseClientCitizenshipDetailses) {
		this.caseClientCitizenshipDetailses = caseClientCitizenshipDetailses;
	}

}
