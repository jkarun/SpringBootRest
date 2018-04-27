package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * RelationshipTypId generated by hbm2java
 */
@Embeddable
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelationshipTypId implements java.io.Serializable {

	private String relationCd;
	private String relationshipCd;

	public RelationshipTypId() {
	}

	public RelationshipTypId(String relationCd, String relationshipCd) {
		this.relationCd = relationCd;
		this.relationshipCd = relationshipCd;
	}

	@Column(name = "relation_cd", nullable = false, length = 8)
	public String getRelationCd() {
		return this.relationCd;
	}

	public void setRelationCd(String relationCd) {
		this.relationCd = relationCd;
	}

	@Column(name = "relationship_cd", nullable = false, length = 2)
	public String getRelationshipCd() {
		return this.relationshipCd;
	}

	public void setRelationshipCd(String relationshipCd) {
		this.relationshipCd = relationshipCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RelationshipTypId))
			return false;
		RelationshipTypId castOther = (RelationshipTypId) other;

		return ((this.getRelationCd() == castOther.getRelationCd()) || (this.getRelationCd() != null
				&& castOther.getRelationCd() != null && this.getRelationCd().equals(castOther.getRelationCd())))
				&& ((this.getRelationshipCd() == castOther.getRelationshipCd())
						|| (this.getRelationshipCd() != null && castOther.getRelationshipCd() != null
								&& this.getRelationshipCd().equals(castOther.getRelationshipCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRelationCd() == null ? 0 : this.getRelationCd().hashCode());
		result = 37 * result + (getRelationshipCd() == null ? 0 : this.getRelationshipCd().hashCode());
		return result;
	}

}
