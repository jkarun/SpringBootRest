package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
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
 * EsignStatus generated by hbm2java
 */
@Entity
@Table(name = "esign_status"

		, uniqueConstraints = @UniqueConstraint(columnNames = "esign_status_cd"))
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EsignStatus implements java.io.Serializable {

	private Integer id;
	private String esignStatusCd;
	private String esignStatusDesc;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public EsignStatus() {
	}

	public EsignStatus(char isDeletedInd, Date lstUpdtDtm) {
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public EsignStatus(String esignStatusCd, String esignStatusDesc, char isDeletedInd, String lstUpdtUserId,
			Date lstUpdtDtm) {
		this.esignStatusCd = esignStatusCd;
		this.esignStatusDesc = esignStatusDesc;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "esign_status_cd", unique = true, length = 20)
	public String getEsignStatusCd() {
		return this.esignStatusCd;
	}

	public void setEsignStatusCd(String esignStatusCd) {
		this.esignStatusCd = esignStatusCd;
	}

	@Column(name = "esign_status_desc", length = 50)
	public String getEsignStatusDesc() {
		return this.esignStatusDesc;
	}

	public void setEsignStatusDesc(String esignStatusDesc) {
		this.esignStatusDesc = esignStatusDesc;
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
