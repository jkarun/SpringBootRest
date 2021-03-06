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
 * CaseAgent generated by hbm2java
 */
@Entity
@Table(name = "case_agent")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseAgent implements java.io.Serializable {

	private Integer caseAgentId;
	private AppCase appCase;
	private String agentId;
	private String agentFirstNm;
	private String agentLastNm;
	private BigDecimal agentShare;
	private String agentEmailAddress;
	private String agentSpecialRequest;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;
	private Character isDefaultAgent;
	private String countyOffice;

	public CaseAgent() {
	}

	public CaseAgent(AppCase appCase, char isDeletedInd, Date lstUpdtDtm) {
		this.appCase = appCase;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public CaseAgent(AppCase appCase, String agentId, String agentFirstNm, String agentLastNm, BigDecimal agentShare,
			String agentEmailAddress, String agentSpecialRequest, char isDeletedInd, String lstUpdtUserId,
			Date lstUpdtDtm, Character isDefaultAgent, String countyOffice) {
		this.appCase = appCase;
		this.agentId = agentId;
		this.agentFirstNm = agentFirstNm;
		this.agentLastNm = agentLastNm;
		this.agentShare = agentShare;
		this.agentEmailAddress = agentEmailAddress;
		this.agentSpecialRequest = agentSpecialRequest;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
		this.isDefaultAgent = isDefaultAgent;
		this.countyOffice = countyOffice;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "case_agent_id", unique = true, nullable = false)
	public Integer getCaseAgentId() {
		return this.caseAgentId;
	}

	public void setCaseAgentId(Integer caseAgentId) {
		this.caseAgentId = caseAgentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id", nullable = false)
	public AppCase getAppCase() {
		return this.appCase;
	}

	public void setAppCase(AppCase appCase) {
		this.appCase = appCase;
	}

	@Column(name = "agent_id", length = 50)
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	@Column(name = "agent_first_nm", length = 50)
	public String getAgentFirstNm() {
		return this.agentFirstNm;
	}

	public void setAgentFirstNm(String agentFirstNm) {
		this.agentFirstNm = agentFirstNm;
	}

	@Column(name = "agent_last_nm", length = 50)
	public String getAgentLastNm() {
		return this.agentLastNm;
	}

	public void setAgentLastNm(String agentLastNm) {
		this.agentLastNm = agentLastNm;
	}

	@Column(name = "agent_share", precision = 5)
	public BigDecimal getAgentShare() {
		return this.agentShare;
	}

	public void setAgentShare(BigDecimal agentShare) {
		this.agentShare = agentShare;
	}

	@Column(name = "agent_email_address", length = 100)
	public String getAgentEmailAddress() {
		return this.agentEmailAddress;
	}

	public void setAgentEmailAddress(String agentEmailAddress) {
		this.agentEmailAddress = agentEmailAddress;
	}

	@Column(name = "agent_special_request", length = 1000)
	public String getAgentSpecialRequest() {
		return this.agentSpecialRequest;
	}

	public void setAgentSpecialRequest(String agentSpecialRequest) {
		this.agentSpecialRequest = agentSpecialRequest;
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

	@Column(name = "is_default_agent", length = 1)
	public Character getIsDefaultAgent() {
		return this.isDefaultAgent;
	}

	public void setIsDefaultAgent(Character isDefaultAgent) {
		this.isDefaultAgent = isDefaultAgent;
	}

	@Column(name = "county_office", length = 100)
	public String getCountyOffice() {
		return this.countyOffice;
	}

	public void setCountyOffice(String countyOffice) {
		this.countyOffice = countyOffice;
	}

}
