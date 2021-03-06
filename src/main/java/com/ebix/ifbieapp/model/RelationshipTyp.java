package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * RelationshipTyp generated by hbm2java
 */
@Entity
@Table(name = "relationship_typ")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelationshipTyp implements java.io.Serializable {

	private RelationshipTypId id;
	private String relationshipNm;
	private Integer relSortNum;
	private Integer companyId;
	private Character isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public RelationshipTyp() {
	}

	public RelationshipTyp(RelationshipTypId id) {
		this.id = id;
	}

	public RelationshipTyp(RelationshipTypId id, String relationshipNm, Integer relSortNum, Integer companyId,
			Character isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
		this.id = id;
		this.relationshipNm = relationshipNm;
		this.relSortNum = relSortNum;
		this.companyId = companyId;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "relationCd", column = @Column(name = "relation_cd", nullable = false, length = 8)),
			@AttributeOverride(name = "relationshipCd", column = @Column(name = "relationship_cd", nullable = false, length = 2)) })
	public RelationshipTypId getId() {
		return this.id;
	}

	public void setId(RelationshipTypId id) {
		this.id = id;
	}

	@Column(name = "relationship_nm", length = 20)
	public String getRelationshipNm() {
		return this.relationshipNm;
	}

	public void setRelationshipNm(String relationshipNm) {
		this.relationshipNm = relationshipNm;
	}

	@Column(name = "rel_sort_num")
	public Integer getRelSortNum() {
		return this.relSortNum;
	}

	public void setRelSortNum(Integer relSortNum) {
		this.relSortNum = relSortNum;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
