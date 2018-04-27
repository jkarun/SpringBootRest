package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * CloningPartyscreenDetails generated by hbm2java
 */
@Entity
@Table(name = "cloning_partyscreen_details")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloningPartyscreenDetails implements java.io.Serializable {

	private CloningPartyscreenDetailsId id;

	public CloningPartyscreenDetails() {
	}

	public CloningPartyscreenDetails(CloningPartyscreenDetailsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "seqNum", column = @Column(name = "seq_num", nullable = false)),
			@AttributeOverride(name = "currentCaseId", column = @Column(name = "current_case_id")),
			@AttributeOverride(name = "newApplicationType", column = @Column(name = "new_applicationType")),
			@AttributeOverride(name = "newCaseType", column = @Column(name = "new_caseType")),
			@AttributeOverride(name = "partiesStakeholderTypeList", column = @Column(name = "parties_StakeholderTypeList")),
			@AttributeOverride(name = "screenCloningList", column = @Column(name = "ScreenCloningList")),
			@AttributeOverride(name = "clonedCaseId", column = @Column(name = "clonedCaseID")),
			@AttributeOverride(name = "lstUpdtDtm", column = @Column(name = "lst_updt_dtm", nullable = false, length = 23)) })
	public CloningPartyscreenDetailsId getId() {
		return this.id;
	}

	public void setId(CloningPartyscreenDetailsId id) {
		this.id = id;
	}

}
