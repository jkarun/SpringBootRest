package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Portal generated by hbm2java
 */
@Entity
@Table(name="portal"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class Portal  implements java.io.Serializable {


     private String portalId;
     private String portalDesc;
     private Date lstUpdtDtm;
     private String lstUpdtUserId;
     private char isDeletedInd;
     private Set<Portalproperties> portalpropertieses = new HashSet<Portalproperties>(0);

    public Portal() {
    }

	
    public Portal(String portalId, Date lstUpdtDtm, String lstUpdtUserId, char isDeletedInd) {
        this.portalId = portalId;
        this.lstUpdtDtm = lstUpdtDtm;
        this.lstUpdtUserId = lstUpdtUserId;
        this.isDeletedInd = isDeletedInd;
    }
    public Portal(String portalId, String portalDesc, Date lstUpdtDtm, String lstUpdtUserId, char isDeletedInd, Set<Portalproperties> portalpropertieses) {
       this.portalId = portalId;
       this.portalDesc = portalDesc;
       this.lstUpdtDtm = lstUpdtDtm;
       this.lstUpdtUserId = lstUpdtUserId;
       this.isDeletedInd = isDeletedInd;
       this.portalpropertieses = portalpropertieses;
    }
   
     @Id 

    
    @Column(name="portal_id", unique=true, nullable=false, length=50)
    public String getPortalId() {
        return this.portalId;
    }
    
    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    
    @Column(name="portal_desc", length=200)
    public String getPortalDesc() {
        return this.portalDesc;
    }
    
    public void setPortalDesc(String portalDesc) {
        this.portalDesc = portalDesc;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="portal")
    public Set<Portalproperties> getPortalpropertieses() {
        return this.portalpropertieses;
    }
    
    public void setPortalpropertieses(Set<Portalproperties> portalpropertieses) {
        this.portalpropertieses = portalpropertieses;
    }




}

