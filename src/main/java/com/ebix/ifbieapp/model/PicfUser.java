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
 * PicfUser generated by hbm2java
 */
@Entity
@Table(name = "picf_user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfUser implements java.io.Serializable {

	private BigDecimal id;
	private String firstName;
	private String lastName;
	private String email;
	private String loginId;
	private String description;
	private String pwd;
	private String status;
	private String isLoggedIn;
	private BigDecimal tenantId;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;
	private String countyOffice;
	private Byte isAdmin;

	public PicfUser() {
	}

	public PicfUser(String firstName, String lastName, String email, String loginId, String pwd, String status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.loginId = loginId;
		this.pwd = pwd;
		this.status = status;
	}

	public PicfUser(String firstName, String lastName, String email, String loginId, String description, String pwd,
			String status, String isLoggedIn, BigDecimal tenantId, BigDecimal lastUpdatedUser, Date lastUpdatedDate,
			Byte isDeleted, String countyOffice, Byte isAdmin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.loginId = loginId;
		this.description = description;
		this.pwd = pwd;
		this.status = status;
		this.isLoggedIn = isLoggedIn;
		this.tenantId = tenantId;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
		this.countyOffice = countyOffice;
		this.isAdmin = isAdmin;
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

	@Column(name = "first_name", nullable = false, length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "login_Id", nullable = false, length = 30)
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "pwd", nullable = false, length = 10)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "status", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "is_logged_in", length = 1)
	public String getIsLoggedIn() {
		return this.isLoggedIn;
	}

	public void setIsLoggedIn(String isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	@Column(name = "tenant_id", scale = 0)
	public BigDecimal getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(BigDecimal tenantId) {
		this.tenantId = tenantId;
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

	@Column(name = "county_office", length = 100)
	public String getCountyOffice() {
		return this.countyOffice;
	}

	public void setCountyOffice(String countyOffice) {
		this.countyOffice = countyOffice;
	}

	@Column(name = "is_admin")
	public Byte getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Byte isAdmin) {
		this.isAdmin = isAdmin;
	}

}
