package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * ApplnCaseType generated by hbm2java
 */
@Entity
@Table(name = "appln_case_type", uniqueConstraints = @UniqueConstraint(columnNames = { "company_id", "case_typ_cd",
		"appln_case_type_cd" }))
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplnCaseType implements java.io.Serializable {

	private int id;
	private Integer companyId;
	private String caseTypCd;
	private String applnCaseTypeCd;
	private String caseTypeDesc;
	private Character isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public ApplnCaseType() {
	}

	public ApplnCaseType(int id) {
		this.id = id;
	}

	public ApplnCaseType(int id, Integer companyId, String caseTypCd, String applnCaseTypeCd, String caseTypeDesc,
			Character isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.id = id;
		this.companyId = companyId;
		this.caseTypCd = caseTypCd;
		this.applnCaseTypeCd = applnCaseTypeCd;
		this.caseTypeDesc = caseTypeDesc;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "case_typ_cd", length = 8)
	public String getCaseTypCd() {
		return this.caseTypCd;
	}

	public void setCaseTypCd(String caseTypCd) {
		this.caseTypCd = caseTypCd;
	}

	@Column(name = "appln_case_type_cd", length = 20)
	public String getApplnCaseTypeCd() {
		return this.applnCaseTypeCd;
	}

	public void setApplnCaseTypeCd(String applnCaseTypeCd) {
		this.applnCaseTypeCd = applnCaseTypeCd;
	}

	@Column(name = "case_type_desc", length = 50)
	public String getCaseTypeDesc() {
		return this.caseTypeDesc;
	}

	public void setCaseTypeDesc(String caseTypeDesc) {
		this.caseTypeDesc = caseTypeDesc;
	}

	@Column(name = "is_deleted_ind", length = 1)
	public Character getIsDeletedInd() {
		return this.isDeletedInd;
	}

	public void setIsDeletedInd(Character isDeletedInd) {
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
	@Column(name = "lst_updt_dtm", length = 23)
	public Date getLstUpdtDtm() {
		return this.lstUpdtDtm;
	}

	public void setLstUpdtDtm(Date lstUpdtDtm) {
		this.lstUpdtDtm = lstUpdtDtm;
	}

}
