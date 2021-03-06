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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * PdfUw generated by hbm2java
 */
@Entity
@Table(name = "pdf_uw")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PdfUw implements java.io.Serializable {

	private Integer pdfUwId;
	private String pdfName;
	private byte[] pdfContent;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public PdfUw() {
	}

	public PdfUw(char isDeletedInd, Date lstUpdtDtm) {
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public PdfUw(String pdfName, byte[] pdfContent, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.pdfName = pdfName;
		this.pdfContent = pdfContent;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pdf_uw_id", unique = true, nullable = false)
	public Integer getPdfUwId() {
		return this.pdfUwId;
	}

	public void setPdfUwId(Integer pdfUwId) {
		this.pdfUwId = pdfUwId;
	}

	@Column(name = "pdf_name", length = 50)
	public String getPdfName() {
		return this.pdfName;
	}

	public void setPdfName(String pdfName) {
		this.pdfName = pdfName;
	}

	@Column(name = "pdf_content")
	public byte[] getPdfContent() {
		return this.pdfContent;
	}

	public void setPdfContent(byte[] pdfContent) {
		this.pdfContent = pdfContent;
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
