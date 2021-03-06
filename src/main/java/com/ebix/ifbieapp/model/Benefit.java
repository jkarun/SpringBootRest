package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Benefit generated by hbm2java
 */
@Entity
@Table(name = "benefit")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Benefit implements java.io.Serializable {

	private BigDecimal benefitId;
	private AppCase appCase;
	private Rider rider;
	private String planCode;
	private Double amount;
	private String permTableRating;

	public Benefit() {
	}

	public Benefit(AppCase appCase) {
		this.appCase = appCase;
	}

	public Benefit(AppCase appCase, Rider rider, String planCode, Double amount, String permTableRating) {
		this.appCase = appCase;
		this.rider = rider;
		this.planCode = planCode;
		this.amount = amount;
		this.permTableRating = permTableRating;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "benefitId", unique = true, nullable = false, scale = 0)
	public BigDecimal getBenefitId() {
		return this.benefitId;
	}

	public void setBenefitId(BigDecimal benefitId) {
		this.benefitId = benefitId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id", nullable = false)
	public AppCase getAppCase() {
		return this.appCase;
	}

	public void setAppCase(AppCase appCase) {
		this.appCase = appCase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "riderId")
	public Rider getRider() {
		return this.rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	@Column(name = "plan_code")
	public String getPlanCode() {
		return this.planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	@Column(name = "amount", precision = 53, scale = 0)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "perm_table_rating")
	public String getPermTableRating() {
		return this.permTableRating;
	}

	public void setPermTableRating(String permTableRating) {
		this.permTableRating = permTableRating;
	}

}
