package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Portalproperties generated by hbm2java
 */
@Entity
@Table(name="portalproperties"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class Portalproperties  implements java.io.Serializable {


     private PortalpropertiesId id;
     private Portal portal;
     private String propertyValue;
     private Date lstUpdtDtm;
     private String lstUpdtUserId;
     private char isDeletedInd;

    public Portalproperties() {
    }

    public Portalproperties(PortalpropertiesId id, Portal portal, String propertyValue, Date lstUpdtDtm, String lstUpdtUserId, char isDeletedInd) {
       this.id = id;
       this.portal = portal;
       this.propertyValue = propertyValue;
       this.lstUpdtDtm = lstUpdtDtm;
       this.lstUpdtUserId = lstUpdtUserId;
       this.isDeletedInd = isDeletedInd;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="portalId", column=@Column(name="portal_id", nullable=false, length=50) ), 
        @AttributeOverride(name="propertyId", column=@Column(name="property_id", nullable=false, length=50) ) } )
    public PortalpropertiesId getId() {
        return this.id;
    }
    
    public void setId(PortalpropertiesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="portal_id", nullable=false, insertable=false, updatable=false)
    public Portal getPortal() {
        return this.portal;
    }
    
    public void setPortal(Portal portal) {
        this.portal = portal;
    }

    
    @Column(name="property_value", nullable=false, length=200)
    public String getPropertyValue() {
        return this.propertyValue;
    }
    
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lst_updt_dtm", nullable=false, length=23)
    public Date getLstUpdtDtm() {
        return this.lstUpdtDtm;
    }
    
    public void setLstUpdtDtm(Date lstUpdtDtm) {
        this.lstUpdtDtm = lstUpdtDtm;
    }

    
    @Column(name="lst_updt_user_id", nullable=false, length=50)
    public String getLstUpdtUserId() {
        return this.lstUpdtUserId;
    }
    
    public void setLstUpdtUserId(String lstUpdtUserId) {
        this.lstUpdtUserId = lstUpdtUserId;
    }

    
    @Column(name="is_deleted_ind", nullable=false, length=1)
    public char getIsDeletedInd() {
        return this.isDeletedInd;
    }
    
    public void setIsDeletedInd(char isDeletedInd) {
        this.isDeletedInd = isDeletedInd;
    }




}


