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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * BeneCategory generated by hbm2java
 */
@Entity
@Table(name = "bene_category")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BeneCategory implements java.io.Serializable {

	private int beneCatId;
	private String beneCatNm;
	private Character isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public BeneCategory() {
	}

	public BeneCategory(int beneCatId) {
		this.beneCatId = beneCatId;
	}

	public BeneCategory(int beneCatId, String beneCatNm, Character isDeletedInd, String lstUpdtUserId,
			Date lstUpdtDtm) {
		this.beneCatId = beneCatId;
		this.beneCatNm = beneCatNm;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id

	@Column(name = "bene_cat_id", unique = true, nullable = false)
	public int getBeneCatId() {
		return this.beneCatId;
	}

	public void setBeneCatId(int beneCatId) {
		this.beneCatId = beneCatId;
	}

	@Column(name = "bene_cat_nm", length = 50)
	public String getBeneCatNm() {
		return this.beneCatNm;
	}

	public void setBeneCatNm(String beneCatNm) {
		this.beneCatNm = beneCatNm;
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
