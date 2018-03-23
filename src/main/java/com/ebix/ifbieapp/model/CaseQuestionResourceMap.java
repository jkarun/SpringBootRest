package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
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
 * CaseQuestionResourceMap generated by hbm2java
 */
@Entity
@Table(name = "case_question_resource_map")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseQuestionResourceMap implements java.io.Serializable {

	private int caseQuestionResourceId;
	private AppCase appCase;
	private int resourceId;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public CaseQuestionResourceMap() {
	}

	public CaseQuestionResourceMap(int caseQuestionResourceId, AppCase appCase, int resourceId, char isDeletedInd,
			Date lstUpdtDtm) {
		this.caseQuestionResourceId = caseQuestionResourceId;
		this.appCase = appCase;
		this.resourceId = resourceId;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public CaseQuestionResourceMap(int caseQuestionResourceId, AppCase appCase, int resourceId, char isDeletedInd,
			String lstUpdtUserId, Date lstUpdtDtm) {
		this.caseQuestionResourceId = caseQuestionResourceId;
		this.appCase = appCase;
		this.resourceId = resourceId;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id

	@Column(name = "case_question_resource_id", unique = true, nullable = false)
	public int getCaseQuestionResourceId() {
		return this.caseQuestionResourceId;
	}

	public void setCaseQuestionResourceId(int caseQuestionResourceId) {
		this.caseQuestionResourceId = caseQuestionResourceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id", nullable = false)
	public AppCase getAppCase() {
		return this.appCase;
	}

	public void setAppCase(AppCase appCase) {
		this.appCase = appCase;
	}

	@Column(name = "resource_id", nullable = false)
	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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
