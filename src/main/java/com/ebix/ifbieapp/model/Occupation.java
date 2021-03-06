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
 * Occupation generated by hbm2java
 */
@Entity
@Table(name = "occupation")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Occupation implements java.io.Serializable {

	private String occTypCd;
	private String occTypDsc;
	private Date lstUpdtDtm;
	private String lstUpdtUserId;
	private Character isDeletedInd;

	public Occupation() {
	}

	public Occupation(String occTypCd) {
		this.occTypCd = occTypCd;
	}

	public Occupation(String occTypCd, String occTypDsc, Date lstUpdtDtm, String lstUpdtUserId,
			Character isDeletedInd) {
		this.occTypCd = occTypCd;
		this.occTypDsc = occTypDsc;
		this.lstUpdtDtm = lstUpdtDtm;
		this.lstUpdtUserId = lstUpdtUserId;
		this.isDeletedInd = isDeletedInd;
	}

	@Id

	@Column(name = "occ_typ_cd", unique = true, nullable = false, length = 8)
	public String getOccTypCd() {
		return this.occTypCd;
	}

	public void setOccTypCd(String occTypCd) {
		this.occTypCd = occTypCd;
	}

	@Column(name = "occ_typ_dsc", length = 20)
	public String getOccTypDsc() {
		return this.occTypDsc;
	}

	public void setOccTypDsc(String occTypDsc) {
		this.occTypDsc = occTypDsc;
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

	@Column(name = "lst_updt_user_id", length = 20)
	public String getLstUpdtUserId() {
		return this.lstUpdtUserId;
	}

	public void setLstUpdtUserId(String lstUpdtUserId) {
		this.lstUpdtUserId = lstUpdtUserId;
	}

	@Column(name = "is_deleted_ind", length = 1)
	public Character getIsDeletedInd() {
		return this.isDeletedInd;
	}

	public void setIsDeletedInd(Character isDeletedInd) {
		this.isDeletedInd = isDeletedInd;
	}

}
