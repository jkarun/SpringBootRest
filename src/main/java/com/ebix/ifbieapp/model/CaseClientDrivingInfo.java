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
 * CaseClientDrivingInfo generated by hbm2java
 */
@Entity
@Table(name = "case_client_driving_info")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseClientDrivingInfo implements java.io.Serializable {

	private Integer caseClientDrivingInfoId;
	private CaseClientMap caseClientMap;
	private String drivingLicenseIssueStateCd;
	private String licenseNumber;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public CaseClientDrivingInfo() {
	}

	public CaseClientDrivingInfo(char isDeletedInd, Date lstUpdtDtm) {
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public CaseClientDrivingInfo(CaseClientMap caseClientMap, String drivingLicenseIssueStateCd, String licenseNumber,
			char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.caseClientMap = caseClientMap;
		this.drivingLicenseIssueStateCd = drivingLicenseIssueStateCd;
		this.licenseNumber = licenseNumber;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "case_client_driving_info_id", unique = true, nullable = false)
	public Integer getCaseClientDrivingInfoId() {
		return this.caseClientDrivingInfoId;
	}

	public void setCaseClientDrivingInfoId(Integer caseClientDrivingInfoId) {
		this.caseClientDrivingInfoId = caseClientDrivingInfoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_client_map_id")
	public CaseClientMap getCaseClientMap() {
		return this.caseClientMap;
	}

	public void setCaseClientMap(CaseClientMap caseClientMap) {
		this.caseClientMap = caseClientMap;
	}

	@Column(name = "driving_license_issue_state_cd", length = 2)
	public String getDrivingLicenseIssueStateCd() {
		return this.drivingLicenseIssueStateCd;
	}

	public void setDrivingLicenseIssueStateCd(String drivingLicenseIssueStateCd) {
		this.drivingLicenseIssueStateCd = drivingLicenseIssueStateCd;
	}

	@Column(name = "license_number", length = 20)
	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
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
