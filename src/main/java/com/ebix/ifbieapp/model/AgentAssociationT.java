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
 * AgentAssociationT generated by hbm2java
 */
@Entity
@Table(name = "agent_association_t")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgentAssociationT implements java.io.Serializable {

	private Integer agentAssocId;
	private AgentT agentT;
	private String firstName;
	private String lastName;
	private String compProducerId;
	private String carrierCode;
	private String carrierApptTypCd;
	private String emailAddr1;
	private String emailAddr2;
	private char isDeletedInd;
	private String lstUpdtUserId;
	private Date lstUpdtDtm;
	private String license;

	public AgentAssociationT() {
	}

	public AgentAssociationT(AgentT agentT, char isDeletedInd, Date lstUpdtDtm) {
		this.agentT = agentT;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtDtm = lstUpdtDtm;
	}

	public AgentAssociationT(AgentT agentT, String firstName, String lastName, String compProducerId,
			String carrierCode, String carrierApptTypCd, String emailAddr1, String emailAddr2, char isDeletedInd,
			String lstUpdtUserId, Date lstUpdtDtm, String license) {
		this.agentT = agentT;
		this.firstName = firstName;
		this.lastName = lastName;
		this.compProducerId = compProducerId;
		this.carrierCode = carrierCode;
		this.carrierApptTypCd = carrierApptTypCd;
		this.emailAddr1 = emailAddr1;
		this.emailAddr2 = emailAddr2;
		this.isDeletedInd = isDeletedInd;
		this.lstUpdtUserId = lstUpdtUserId;
		this.lstUpdtDtm = lstUpdtDtm;
		this.license = license;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "agent_assoc_id", unique = true, nullable = false)
	public Integer getAgentAssocId() {
		return this.agentAssocId;
	}

	public void setAgentAssocId(Integer agentAssocId) {
		this.agentAssocId = agentAssocId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent_seq_num", nullable = false)
	public AgentT getAgentT() {
		return this.agentT;
	}

	public void setAgentT(AgentT agentT) {
		this.agentT = agentT;
	}

	@Column(name = "first_name", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "comp_producer_id", length = 15)
	public String getCompProducerId() {
		return this.compProducerId;
	}

	public void setCompProducerId(String compProducerId) {
		this.compProducerId = compProducerId;
	}

	@Column(name = "carrier_code", length = 8)
	public String getCarrierCode() {
		return this.carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@Column(name = "carrier_appt_typ_cd", length = 25)
	public String getCarrierApptTypCd() {
		return this.carrierApptTypCd;
	}

	public void setCarrierApptTypCd(String carrierApptTypCd) {
		this.carrierApptTypCd = carrierApptTypCd;
	}

	@Column(name = "email_addr_1", length = 50)
	public String getEmailAddr1() {
		return this.emailAddr1;
	}

	public void setEmailAddr1(String emailAddr1) {
		this.emailAddr1 = emailAddr1;
	}

	@Column(name = "email_addr_2", length = 50)
	public String getEmailAddr2() {
		return this.emailAddr2;
	}

	public void setEmailAddr2(String emailAddr2) {
		this.emailAddr2 = emailAddr2;
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

	@Column(name = "license", length = 50)
	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

}
