package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * PortalpropertiesId generated by hbm2java
 */
@Embeddable
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalpropertiesId implements java.io.Serializable {

	private String portalId;
	private String propertyId;

	public PortalpropertiesId() {
	}

	public PortalpropertiesId(String portalId, String propertyId) {
		this.portalId = portalId;
		this.propertyId = propertyId;
	}

	@Column(name = "portal_id", nullable = false, length = 50)
	public String getPortalId() {
		return this.portalId;
	}

	public void setPortalId(String portalId) {
		this.portalId = portalId;
	}

	@Column(name = "property_id", nullable = false, length = 50)
	public String getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PortalpropertiesId))
			return false;
		PortalpropertiesId castOther = (PortalpropertiesId) other;

		return ((this.getPortalId() == castOther.getPortalId()) || (this.getPortalId() != null
				&& castOther.getPortalId() != null && this.getPortalId().equals(castOther.getPortalId())))
				&& ((this.getPropertyId() == castOther.getPropertyId())
						|| (this.getPropertyId() != null && castOther.getPropertyId() != null
								&& this.getPropertyId().equals(castOther.getPropertyId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPortalId() == null ? 0 : this.getPortalId().hashCode());
		result = 37 * result + (getPropertyId() == null ? 0 : this.getPropertyId().hashCode());
		return result;
	}

}
