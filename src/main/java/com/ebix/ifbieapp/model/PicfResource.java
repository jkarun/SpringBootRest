package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
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
 * PicfResource generated by hbm2java
 */
@Entity
@Table(name = "picf_resource")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfResource implements java.io.Serializable {

	private BigDecimal resourceId;
	private String resourceName;
	private String resourceType;
	private String resourceDesc;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;
	private String resourceDn;
	private String parentResourceDn;

	public PicfResource() {
	}

	public PicfResource(String resourceName) {
		this.resourceName = resourceName;
	}

	public PicfResource(String resourceName, String resourceType, String resourceDesc, BigDecimal lastUpdatedUser,
			Date lastUpdatedDate, Byte isDeleted, String resourceDn, String parentResourceDn) {
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.resourceDesc = resourceDesc;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
		this.resourceDn = resourceDn;
		this.parentResourceDn = parentResourceDn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "resource_id", unique = true, nullable = false, scale = 0)
	public BigDecimal getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(BigDecimal resourceId) {
		this.resourceId = resourceId;
	}

	@Column(name = "resource_name", nullable = false)
	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Column(name = "resource_type")
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Column(name = "resource_desc")
	public String getResourceDesc() {
		return this.resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
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

	@Column(name = "resource_dn", length = 150)
	public String getResourceDn() {
		return this.resourceDn;
	}

	public void setResourceDn(String resourceDn) {
		this.resourceDn = resourceDn;
	}

	@Column(name = "parentResource_dn", length = 150)
	public String getParentResourceDn() {
		return this.parentResourceDn;
	}

	public void setParentResourceDn(String parentResourceDn) {
		this.parentResourceDn = parentResourceDn;
	}

}
