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
 * BillingModeType generated by hbm2java
 */
@Entity
@Table(name = "billing_mode_type")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingModeType implements java.io.Serializable {

	private String billModeTypCd;
	private String billModeTypDesc;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public BillingModeType() {
	}

	public BillingModeType(String billModeTypCd, char isDeletedInd, Date lstUpdtDtm) {
		this.billModeTypCd = billModeTypCd;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public BillingModeType(String billModeTypCd, String billModeTypDesc, char isDeletedInd, String lstUpdtUserId,
			Date lstUpdtDtm) {
		this.billModeTypCd = billModeTypCd;
		this.billModeTypDesc = billModeTypDesc;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id

	@Column(name = "bill_mode_typ_cd", unique = true, nullable = false, length = 12)
	public String getBillModeTypCd() {
		return this.billModeTypCd;
	}

	public void setBillModeTypCd(String billModeTypCd) {
		this.billModeTypCd = billModeTypCd;
	}

	@Column(name = "bill_mode_typ_desc", length = 50)
	public String getBillModeTypDesc() {
		return this.billModeTypDesc;
	}

	public void setBillModeTypDesc(String billModeTypDesc) {
		this.billModeTypDesc = billModeTypDesc;
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
