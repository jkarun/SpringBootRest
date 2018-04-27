package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * EappFormTemplate generated by hbm2java
 */
@Entity
@Table(name = "eapp_form_template")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EappFormTemplate implements java.io.Serializable {

	private Integer id;
	private String templateVersion;
	private int formTemplateId;
	private Date effectiveDate;
	private Date expiryDate;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;
	private Set<EappFormTemplateMap> eappFormTemplateMaps = new HashSet<EappFormTemplateMap>(0);

	public EappFormTemplate() {
	}

	public EappFormTemplate(String templateVersion, int formTemplateId, char isDeletedInd, Date lstUpdtDtm) {
		this.templateVersion = templateVersion;
		this.formTemplateId = formTemplateId;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public EappFormTemplate(String templateVersion, int formTemplateId, Date effectiveDate, Date expiryDate,
			char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, Set<EappFormTemplateMap> eappFormTemplateMaps) {
		this.templateVersion = templateVersion;
		this.formTemplateId = formTemplateId;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
		this.eappFormTemplateMaps = eappFormTemplateMaps;
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

	@Column(name = "template_version", nullable = false, length = 20)
	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	@Column(name = "form_template_id", nullable = false)
	public int getFormTemplateId() {
		return this.formTemplateId;
	}

	public void setFormTemplateId(int formTemplateId) {
		this.formTemplateId = formTemplateId;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "effective_date", length = 23)
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiry_date", length = 23)
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eappFormTemplate")
	public Set<EappFormTemplateMap> getEappFormTemplateMaps() {
		return this.eappFormTemplateMaps;
	}

	public void setEappFormTemplateMaps(Set<EappFormTemplateMap> eappFormTemplateMaps) {
		this.eappFormTemplateMaps = eappFormTemplateMaps;
	}

}
