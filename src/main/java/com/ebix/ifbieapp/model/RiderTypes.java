package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RiderTypes generated by hbm2java
 */
@Entity
@Table(name="rider_types"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class RiderTypes  implements java.io.Serializable {


     private String riderTypeCd;
     private String riderTypeDesc;
     private Character isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public RiderTypes() {
    }

	
    public RiderTypes(String riderTypeCd, String riderTypeDesc) {
        this.riderTypeCd = riderTypeCd;
        this.riderTypeDesc = riderTypeDesc;
    }
    public RiderTypes(String riderTypeCd, String riderTypeDesc, Character isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.riderTypeCd = riderTypeCd;
       this.riderTypeDesc = riderTypeDesc;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id 

    
    @Column(name="rider_type_cd", unique=true, nullable=false, length=8)
    public String getRiderTypeCd() {
        return this.riderTypeCd;
    }
    
    public void setRiderTypeCd(String riderTypeCd) {
        this.riderTypeCd = riderTypeCd;
    }

    
    @Column(name="rider_type_desc", nullable=false, length=50)
    public String getRiderTypeDesc() {
        return this.riderTypeDesc;
    }
    
    public void setRiderTypeDesc(String riderTypeDesc) {
        this.riderTypeDesc = riderTypeDesc;
    }

    
    @Column(name="is_deleted_ind", length=1)
    public Character getIsDeletedInd() {
        return this.isDeletedInd;
    }
    
    public void setIsDeletedInd(Character isDeletedInd) {
        this.isDeletedInd = isDeletedInd;
    }

    
    @Column(name="lst_updt_user_id", length=50)
    public String getLstUpdtUserId() {
        return this.lstUpdtUserId;
    }
    
    public void setLstUpdtUserId(String lstUpdtUserId) {
        this.lstUpdtUserId = lstUpdtUserId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lst_updt_dtm", length=23)
    public Date getLstUpdtDtm() {
        return this.lstUpdtDtm;
    }
    
    public void setLstUpdtDtm(Date lstUpdtDtm) {
        this.lstUpdtDtm = lstUpdtDtm;
    }




}

