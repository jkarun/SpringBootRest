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
import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * EappFormTemplateMap generated by hbm2java
 */
@Entity
@Table(name = "eapp_form_template_map"

		, uniqueConstraints = {
				@UniqueConstraint(columnNames = { "eapp_form_template_criteria_id", "eapp_form_template_id",
						"sequence_num" }),
				@UniqueConstraint(columnNames = { "eapp_form_template_criteria_id", "eapp_form_template_id" }) })
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EappFormTemplateMap implements java.io.Serializable {

	private Integer id;
	private EappFormTemplate eappFormTemplate;
	private EappFormTemplateCriteria eappFormTemplateCriteria;
	private int sequenceNum;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public EappFormTemplateMap() {
	}

	public EappFormTemplateMap(EappFormTemplate eappFormTemplate, EappFormTemplateCriteria eappFormTemplateCriteria,
			int sequenceNum, char isDeletedInd, Date lstUpdtDtm) {
		this.eappFormTemplate = eappFormTemplate;
		this.eappFormTemplateCriteria = eappFormTemplateCriteria;
		this.sequenceNum = sequenceNum;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public EappFormTemplateMap(EappFormTemplate eappFormTemplate, EappFormTemplateCriteria eappFormTemplateCriteria,
			int sequenceNum, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.eappFormTemplate = eappFormTemplate;
		this.eappFormTemplateCriteria = eappFormTemplateCriteria;
		this.sequenceNum = sequenceNum;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eapp_form_template_id", nullable = false)
	public EappFormTemplate getEappFormTemplate() {
		return this.eappFormTemplate;
	}

	public void setEappFormTemplate(EappFormTemplate eappFormTemplate) {
		this.eappFormTemplate = eappFormTemplate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eapp_form_template_criteria_id", nullable = false)
	public EappFormTemplateCriteria getEappFormTemplateCriteria() {
		return this.eappFormTemplateCriteria;
	}

	public void setEappFormTemplateCriteria(EappFormTemplateCriteria eappFormTemplateCriteria) {
		this.eappFormTemplateCriteria = eappFormTemplateCriteria;
	}

	@Column(name = "sequence_num", nullable = false)
	public int getSequenceNum() {
		return this.sequenceNum;
	}

	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
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
