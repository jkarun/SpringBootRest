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
 * PicfFormCntxtDefinition generated by hbm2java
 */
@Entity
@Table(name = "picf_form_cntxt_definition")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfFormCntxtDefinition implements java.io.Serializable {

	private BigDecimal id;
	private String name;
	private String displayName;
	private String description;
	private String beanRef;
	private String resourceType;
	private String runtimeLabelName;
	private String runtimeDisplayProperty;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private BigDecimal tenantId;
	private Byte isDeleted;
	private Set<PicfFormCntxtMapping> picfFormCntxtMappings = new HashSet<PicfFormCntxtMapping>(0);

	public PicfFormCntxtDefinition() {
	}

	public PicfFormCntxtDefinition(String name, String displayName, String description, String beanRef,
			String resourceType, String runtimeLabelName, String runtimeDisplayProperty, BigDecimal lastUpdatedUser,
			Date lastUpdatedDate, BigDecimal tenantId, Byte isDeleted,
			Set<PicfFormCntxtMapping> picfFormCntxtMappings) {
		this.name = name;
		this.displayName = displayName;
		this.description = description;
		this.beanRef = beanRef;
		this.resourceType = resourceType;
		this.runtimeLabelName = runtimeLabelName;
		this.runtimeDisplayProperty = runtimeDisplayProperty;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.tenantId = tenantId;
		this.isDeleted = isDeleted;
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

	@Column(name = "name", length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "display_name", length = 250)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "bean_ref", length = 200)
	public String getBeanRef() {
		return this.beanRef;
	}

	public void setBeanRef(String beanRef) {
		this.beanRef = beanRef;
	}

	@Column(name = "resourceType", length = 150)
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Column(name = "runtime_label_name", length = 200)
	public String getRuntimeLabelName() {
		return this.runtimeLabelName;
	}

	public void setRuntimeLabelName(String runtimeLabelName) {
		this.runtimeLabelName = runtimeLabelName;
	}

	@Column(name = "runtime_display_property", length = 200)
	public String getRuntimeDisplayProperty() {
		return this.runtimeDisplayProperty;
	}

	public void setRuntimeDisplayProperty(String runtimeDisplayProperty) {
		this.runtimeDisplayProperty = runtimeDisplayProperty;
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

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picfFormCntxtDefinition")
	public Set<PicfFormCntxtMapping> getPicfFormCntxtMappings() {
		return this.picfFormCntxtMappings;
	}

	public void setPicfFormCntxtMappings(Set<PicfFormCntxtMapping> picfFormCntxtMappings) {
		this.picfFormCntxtMappings = picfFormCntxtMappings;
	}

}
