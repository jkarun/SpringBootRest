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
 * QuestionnaireAssociateInfo generated by hbm2java
 */
@Entity
@Table(name = "questionnaire_associate_info")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionnaireAssociateInfo implements java.io.Serializable {

	private Integer assoId;
	private AppCase appCase;
	private String name;
	private String valOfBusInt;
	private String percentOwned;
	private String amtCarried;
	private String amtApplied;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public QuestionnaireAssociateInfo() {
	}

	public QuestionnaireAssociateInfo(AppCase appCase, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.appCase = appCase;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public QuestionnaireAssociateInfo(AppCase appCase, String name, String valOfBusInt, String percentOwned,
			String amtCarried, String amtApplied, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.appCase = appCase;
		this.name = name;
		this.valOfBusInt = valOfBusInt;
		this.percentOwned = percentOwned;
		this.amtCarried = amtCarried;
		this.amtApplied = amtApplied;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "asso_id", unique = true, nullable = false)
	public Integer getAssoId() {
		return this.assoId;
	}

	public void setAssoId(Integer assoId) {
		this.assoId = assoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id", nullable = false)
	public AppCase getAppCase() {
		return this.appCase;
	}

	public void setAppCase(AppCase appCase) {
		this.appCase = appCase;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "val_of_bus_int", length = 50)
	public String getValOfBusInt() {
		return this.valOfBusInt;
	}

	public void setValOfBusInt(String valOfBusInt) {
		this.valOfBusInt = valOfBusInt;
	}

	@Column(name = "percent_owned", length = 50)
	public String getPercentOwned() {
		return this.percentOwned;
	}

	public void setPercentOwned(String percentOwned) {
		this.percentOwned = percentOwned;
	}

	@Column(name = "amt_carried", length = 50)
	public String getAmtCarried() {
		return this.amtCarried;
	}

	public void setAmtCarried(String amtCarried) {
		this.amtCarried = amtCarried;
	}

	@Column(name = "amt_applied", length = 50)
	public String getAmtApplied() {
		return this.amtApplied;
	}

	public void setAmtApplied(String amtApplied) {
		this.amtApplied = amtApplied;
	}

	@Column(name = "is_deleted_ind", nullable = false, length = 1)
	public char getIsDeletedInd() {
		return this.isDeletedInd;
	}

	public void setIsDeletedInd(char isDeletedInd) {
		this.isDeletedInd = isDeletedInd;
	}

	@Column(name = "lst_updt_user_id", nullable = false, length = 20)
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
