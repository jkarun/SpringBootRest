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
 * PicfJobDetail generated by hbm2java
 */
@Entity
@Table(name = "picf_job_detail")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfJobDetail implements java.io.Serializable {

	private BigDecimal id;
	private String name;
	private String description;
	private String groupName;
	private String jobClass;
	private Byte isStateFul;
	private Byte requestRecovery;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;
	private Set<PicfTriggerDetail> picfTriggerDetails = new HashSet<PicfTriggerDetail>(0);

	public PicfJobDetail() {
	}

	public PicfJobDetail(String name, String groupName, String jobClass) {
		this.name = name;
		this.groupName = groupName;
		this.jobClass = jobClass;
	}

	public PicfJobDetail(String name, String description, String groupName, String jobClass, Byte isStateFul,
			Byte requestRecovery, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted,
			Set<PicfTriggerDetail> picfTriggerDetails) {
		this.name = name;
		this.description = description;
		this.groupName = groupName;
		this.jobClass = jobClass;
		this.isStateFul = isStateFul;
		this.requestRecovery = requestRecovery;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
		this.picfTriggerDetails = picfTriggerDetails;
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

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "group_name", nullable = false, length = 45)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "jobClass", nullable = false, length = 100)
	public String getJobClass() {
		return this.jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	@Column(name = "isStateFul")
	public Byte getIsStateFul() {
		return this.isStateFul;
	}

	public void setIsStateFul(Byte isStateFul) {
		this.isStateFul = isStateFul;
	}

	@Column(name = "requestRecovery")
	public Byte getRequestRecovery() {
		return this.requestRecovery;
	}

	public void setRequestRecovery(Byte requestRecovery) {
		this.requestRecovery = requestRecovery;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfJobDetail")
	public Set<PicfTriggerDetail> getPicfTriggerDetails() {
		return this.picfTriggerDetails;
	}

	public void setPicfTriggerDetails(Set<PicfTriggerDetail> picfTriggerDetails) {
		this.picfTriggerDetails = picfTriggerDetails;
	}

}
