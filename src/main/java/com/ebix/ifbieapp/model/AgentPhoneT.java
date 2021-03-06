package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

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
 * AgentPhoneT generated by hbm2java
 */
@Entity
@Table(name = "agent_phone_t")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgentPhoneT implements java.io.Serializable {

	private Integer phoneSeqNum;
	private AgentT agentT;
	private String phoneTyp;
	private String areaCd;
	private String phNumber;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;

	public AgentPhoneT() {
	}

	public AgentPhoneT(AgentT agentT, char isDeletedInd, Date lstUpdtDtm) {
		this.agentT = agentT;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public AgentPhoneT(AgentT agentT, String phoneTyp, String areaCd, String phNumber, char isDeletedInd,
			String lstUpdtUserId, Date lstUpdtDtm) {
		this.agentT = agentT;
		this.phoneTyp = phoneTyp;
		this.areaCd = areaCd;
		this.phNumber = phNumber;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "phone_seq_num", unique = true, nullable = false)
	public Integer getPhoneSeqNum() {
		return this.phoneSeqNum;
	}

	public void setPhoneSeqNum(Integer phoneSeqNum) {
		this.phoneSeqNum = phoneSeqNum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent_seq_num", nullable = false)
	public AgentT getAgentT() {
		return this.agentT;
	}

	public void setAgentT(AgentT agentT) {
		this.agentT = agentT;
	}

	@Column(name = "phone_typ", length = 15)
	public String getPhoneTyp() {
		return this.phoneTyp;
	}

	public void setPhoneTyp(String phoneTyp) {
		this.phoneTyp = phoneTyp;
	}

	@Column(name = "area_cd", length = 8)
	public String getAreaCd() {
		return this.areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	@Column(name = "ph_number", length = 10)
	public String getPhNumber() {
		return this.phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
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

}
