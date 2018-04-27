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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * PicfQuestion generated by hbm2java
 */
@Entity
@Table(name = "picf_question")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfQuestion implements java.io.Serializable {

	private BigDecimal id;
	private String description;
	private Integer sortNum;
	private Character isMandatory;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;
	private Character isRoot;
	private String orientation;
	private String shortName;
	private Set<PicfEventTypes> picfEventTypeses = new HashSet<PicfEventTypes>(0);
	private Set<PicfResponseOptions> picfResponseOptionses = new HashSet<PicfResponseOptions>(0);

	public PicfQuestion() {
	}

	public PicfQuestion(String description, Integer sortNum, Character isMandatory, BigDecimal lastUpdatedUser,
			Date lastUpdatedDate, Byte isDeleted, Character isRoot, String orientation, String shortName,
			Set<PicfEventTypes> picfEventTypeses, Set<PicfResponseOptions> picfResponseOptionses) {
		this.description = description;
		this.sortNum = sortNum;
		this.isMandatory = isMandatory;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
		this.isRoot = isRoot;
		this.orientation = orientation;
		this.shortName = shortName;
		this.picfEventTypeses = picfEventTypeses;
		this.picfResponseOptionses = picfResponseOptionses;
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

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "sort_Num")
	public Integer getSortNum() {
		return this.sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	@Column(name = "is_Mandatory", length = 1)
	public Character getIsMandatory() {
		return this.isMandatory;
	}

	public void setIsMandatory(Character isMandatory) {
		this.isMandatory = isMandatory;
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

	@Column(name = "is_Root", length = 1)
	public Character getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(Character isRoot) {
		this.isRoot = isRoot;
	}

	@Column(name = "orientation", length = 25)
	public String getOrientation() {
		return this.orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	@Column(name = "short_name", length = 50)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfQuestion")
	public Set<PicfEventTypes> getPicfEventTypeses() {
		return this.picfEventTypeses;
	}

	public void setPicfEventTypeses(Set<PicfEventTypes> picfEventTypeses) {
		this.picfEventTypeses = picfEventTypeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfQuestion")
	public Set<PicfResponseOptions> getPicfResponseOptionses() {
		return this.picfResponseOptionses;
	}

	public void setPicfResponseOptionses(Set<PicfResponseOptions> picfResponseOptionses) {
		this.picfResponseOptionses = picfResponseOptionses;
	}

}
