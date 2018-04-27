package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * PicfFormTemplate generated by hbm2java
 */
@Entity
@Table(name = "picf_form_template"

		, uniqueConstraints = @UniqueConstraint(columnNames = "formName"))
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfFormTemplate implements java.io.Serializable {

	private BigDecimal id;
	private PicfAttributeSet picfAttributeSet;
	private String formName;
	private String formCode;
	private String description;
	private String documentType;
	private String formType;
	private String dynamicType;
	private Character isPhysicalFileReq;
	private Character isHistoryReq;
	private Character isDraft;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;
	private Set<PicfCommunicationTemplate> picfCommunicationTemplates = new HashSet<PicfCommunicationTemplate>(0);
	private Set<PicfFormAttachment> picfFormAttachments = new HashSet<PicfFormAttachment>(0);
	private Set<PicfFormAudit> picfFormAudits = new HashSet<PicfFormAudit>(0);
	private Set<PicfAcrofields> picfAcrofieldses = new HashSet<PicfAcrofields>(0);
	private Set<PicfFormCntxtMapping> picfFormCntxtMappings = new HashSet<PicfFormCntxtMapping>(0);

	public PicfFormTemplate() {
	}

	public PicfFormTemplate(String formName) {
		this.formName = formName;
	}

	public PicfFormTemplate(PicfAttributeSet picfAttributeSet, String formName, String formCode, String description,
			String documentType, String formType, String dynamicType, Character isPhysicalFileReq,
			Character isHistoryReq, Character isDraft, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted,
			Set<PicfCommunicationTemplate> picfCommunicationTemplates, Set<PicfFormAttachment> picfFormAttachments,
			Set<PicfFormAudit> picfFormAudits, Set<PicfAcrofields> picfAcrofieldses,
			Set<PicfFormCntxtMapping> picfFormCntxtMappings) {
		this.picfAttributeSet = picfAttributeSet;
		this.formName = formName;
		this.formCode = formCode;
		this.description = description;
		this.documentType = documentType;
		this.formType = formType;
		this.dynamicType = dynamicType;
		this.isPhysicalFileReq = isPhysicalFileReq;
		this.isHistoryReq = isHistoryReq;
		this.isDraft = isDraft;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
		this.picfCommunicationTemplates = picfCommunicationTemplates;
		this.picfFormAttachments = picfFormAttachments;
		this.picfFormAudits = picfFormAudits;
		this.picfAcrofieldses = picfAcrofieldses;
		this.picfFormCntxtMappings = picfFormCntxtMappings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "editable_form_View_id")
	public PicfAttributeSet getPicfAttributeSet() {
		return this.picfAttributeSet;
	}

	public void setPicfAttributeSet(PicfAttributeSet picfAttributeSet) {
		this.picfAttributeSet = picfAttributeSet;
	}

	@Column(name = "formName", unique = true, nullable = false, length = 256)
	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	@Column(name = "formCode", length = 128)
	public String getFormCode() {
		return this.formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	@Column(name = "description", length = 512)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "document_type", length = 45)
	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	@Column(name = "form_Type", length = 20)
	public String getFormType() {
		return this.formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	@Column(name = "dynamic_Type", length = 20)
	public String getDynamicType() {
		return this.dynamicType;
	}

	public void setDynamicType(String dynamicType) {
		this.dynamicType = dynamicType;
	}

	@Column(name = "isPhysicalFileReq", length = 1)
	public Character getIsPhysicalFileReq() {
		return this.isPhysicalFileReq;
	}

	public void setIsPhysicalFileReq(Character isPhysicalFileReq) {
		this.isPhysicalFileReq = isPhysicalFileReq;
	}

	@Column(name = "isHistoryReq", length = 1)
	public Character getIsHistoryReq() {
		return this.isHistoryReq;
	}

	public void setIsHistoryReq(Character isHistoryReq) {
		this.isHistoryReq = isHistoryReq;
	}

	@Column(name = "is_draft", length = 1)
	public Character getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(Character isDraft) {
		this.isDraft = isDraft;
	}

	@Column(name = "last_updated_user", scale = 0)
	public BigDecimal getLastUpdatedUser() {
		return this.lastUpdatedUser;
	}

	public void setLastUpdatedUser(BigDecimal lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_date", length = 23)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "picf_communication_form", schema = "dbo", catalog = "life_eapp", joinColumns = {
			@JoinColumn(name = "formId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "templateId", nullable = false, updatable = false) })
	public Set<PicfCommunicationTemplate> getPicfCommunicationTemplates() {
		return this.picfCommunicationTemplates;
	}

	public void setPicfCommunicationTemplates(Set<PicfCommunicationTemplate> picfCommunicationTemplates) {
		this.picfCommunicationTemplates = picfCommunicationTemplates;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfFormTemplate")
	public Set<PicfFormAttachment> getPicfFormAttachments() {
		return this.picfFormAttachments;
	}

	public void setPicfFormAttachments(Set<PicfFormAttachment> picfFormAttachments) {
		this.picfFormAttachments = picfFormAttachments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfFormTemplate")
	public Set<PicfFormAudit> getPicfFormAudits() {
		return this.picfFormAudits;
	}

	public void setPicfFormAudits(Set<PicfFormAudit> picfFormAudits) {
		this.picfFormAudits = picfFormAudits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfFormTemplate")
	public Set<PicfAcrofields> getPicfAcrofieldses() {
		return this.picfAcrofieldses;
	}

	public void setPicfAcrofieldses(Set<PicfAcrofields> picfAcrofieldses) {
		this.picfAcrofieldses = picfAcrofieldses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfFormTemplate")
	public Set<PicfFormCntxtMapping> getPicfFormCntxtMappings() {
		return this.picfFormCntxtMappings;
	}

	public void setPicfFormCntxtMappings(Set<PicfFormCntxtMapping> picfFormCntxtMappings) {
		this.picfFormCntxtMappings = picfFormCntxtMappings;
	}

}
