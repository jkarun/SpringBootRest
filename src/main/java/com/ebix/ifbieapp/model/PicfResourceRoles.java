package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * PicfResourceRoles generated by hbm2java
 */
@Entity
@Table(name = "picf_resource_roles")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfResourceRoles implements java.io.Serializable {

	private BigDecimal id;
	private PicfRole picfRole;
	private String resourceDn;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private BigDecimal tenantId;

	public PicfResourceRoles() {
	}

	public PicfResourceRoles(PicfRole picfRole) {
		this.picfRole = picfRole;
	}

	public PicfResourceRoles(PicfRole picfRole, String resourceDn, BigDecimal lastUpdatedUser, Date lastUpdatedDate,
			BigDecimal tenantId) {
		this.picfRole = picfRole;
		this.resourceDn = resourceDn;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "role_id", nullable = false)
	public PicfRole getPicfRole() {
		return this.picfRole;
	}

	public void setPicfRole(PicfRole picfRole) {
		this.picfRole = picfRole;
	}

	@Column(name = "resource_dn", length = 150)
	public String getResourceDn() {
		return this.resourceDn;
	}

	public void setResourceDn(String resourceDn) {
		this.resourceDn = resourceDn;
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

	@Column(name = "tenant_id", scale = 0)
	public BigDecimal getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(BigDecimal tenantId) {
		this.tenantId = tenantId;
	}

}
