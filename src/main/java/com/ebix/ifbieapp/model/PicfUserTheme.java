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
 * PicfUserTheme generated by hbm2java
 */
@Entity
@Table(name = "picf_user_theme")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfUserTheme implements java.io.Serializable {

	private BigDecimal id;
	private BigDecimal tenantId;
	private BigDecimal userId;
	private BigDecimal themeId;
	private Date lastUpdatedDate;
	private BigDecimal lastUpdatedUser;
	private Byte isDeleted;

	public PicfUserTheme() {
	}

	public PicfUserTheme(BigDecimal tenantId, BigDecimal userId, BigDecimal themeId) {
		this.tenantId = tenantId;
		this.userId = userId;
		this.themeId = themeId;
	}

	public PicfUserTheme(BigDecimal tenantId, BigDecimal userId, BigDecimal themeId, Date lastUpdatedDate,
			BigDecimal lastUpdatedUser, Byte isDeleted) {
		this.tenantId = tenantId;
		this.userId = userId;
		this.themeId = themeId;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isDeleted = isDeleted;
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

	@Column(name = "tenant_id", nullable = false, scale = 0)
	public BigDecimal getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(BigDecimal tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "user_id", nullable = false, scale = 0)
	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	@Column(name = "theme_id", nullable = false, scale = 0)
	public BigDecimal getThemeId() {
		return this.themeId;
	}

	public void setThemeId(BigDecimal themeId) {
		this.themeId = themeId;
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

	@Column(name = "last_updated_user", scale = 0)
	public BigDecimal getLastUpdatedUser() {
		return this.lastUpdatedUser;
	}

	public void setLastUpdatedUser(BigDecimal lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

}
