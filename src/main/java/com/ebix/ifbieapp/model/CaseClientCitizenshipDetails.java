package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * CaseClientCitizenshipDetails generated by hbm2java
 */
@Entity
@Table(name = "case_client_citizenship_details")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseClientCitizenshipDetails implements java.io.Serializable {

	private Integer caseClientCitizenshipDetailsId;
	private CaseClientMap caseClientMap;
	private String currentCountryCd;
	private Character residentInd;
	private Character citizenshipInd;
	private Integer yearsInUsNum;
	private String residingCountryCd;
	private String residingDocumentType;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;
	private Character haveGreenCard;

	public CaseClientCitizenshipDetails() {
	}

	public CaseClientCitizenshipDetails(char isDeletedInd, Date lstUpdtDtm) {
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public CaseClientCitizenshipDetails(CaseClientMap caseClientMap, String currentCountryCd, Character residentInd,
			Character citizenshipInd, Integer yearsInUsNum, String residingCountryCd, String residingDocumentType,
			char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, Character haveGreenCard) {
		this.caseClientMap = caseClientMap;
		this.currentCountryCd = currentCountryCd;
		this.residentInd = residentInd;
		this.citizenshipInd = citizenshipInd;
		this.yearsInUsNum = yearsInUsNum;
		this.residingCountryCd = residingCountryCd;
		this.residingDocumentType = residingDocumentType;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
		this.haveGreenCard = haveGreenCard;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "case_client_citizenship_details_id", unique = true, nullable = false)
	public Integer getCaseClientCitizenshipDetailsId() {
		return this.caseClientCitizenshipDetailsId;
	}

	public void setCaseClientCitizenshipDetailsId(Integer caseClientCitizenshipDetailsId) {
		this.caseClientCitizenshipDetailsId = caseClientCitizenshipDetailsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_client_map_id")
	public CaseClientMap getCaseClientMap() {
		return this.caseClientMap;
	}

	public void setCaseClientMap(CaseClientMap caseClientMap) {
		this.caseClientMap = caseClientMap;
	}

	@Column(name = "current_country_cd", length = 3)
	public String getCurrentCountryCd() {
		return this.currentCountryCd;
	}

	public void setCurrentCountryCd(String currentCountryCd) {
		this.currentCountryCd = currentCountryCd;
	}

	@Column(name = "resident_ind", length = 1)
	public Character getResidentInd() {
		return this.residentInd;
	}

	public void setResidentInd(Character residentInd) {
		this.residentInd = residentInd;
	}

	@Column(name = "citizenship_ind", length = 1)
	public Character getCitizenshipInd() {
		return this.citizenshipInd;
	}

	public void setCitizenshipInd(Character citizenshipInd) {
		this.citizenshipInd = citizenshipInd;
	}

	@Column(name = "years_in_US_num")
	public Integer getYearsInUsNum() {
		return this.yearsInUsNum;
	}

	public void setYearsInUsNum(Integer yearsInUsNum) {
		this.yearsInUsNum = yearsInUsNum;
	}

	@Column(name = "residing_country_cd", length = 50)
	public String getResidingCountryCd() {
		return this.residingCountryCd;
	}

	public void setResidingCountryCd(String residingCountryCd) {
		this.residingCountryCd = residingCountryCd;
	}

	@Column(name = "residing_document_type", length = 8)
	public String getResidingDocumentType() {
		return this.residingDocumentType;
	}

	public void setResidingDocumentType(String residingDocumentType) {
		this.residingDocumentType = residingDocumentType;
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

	@Column(name = "have_green_card", length = 1)
	public Character getHaveGreenCard() {
		return this.haveGreenCard;
	}

	public void setHaveGreenCard(Character haveGreenCard) {
		this.haveGreenCard = haveGreenCard;
	}

}
