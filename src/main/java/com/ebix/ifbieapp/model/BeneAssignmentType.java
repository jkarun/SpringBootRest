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
 * BeneAssignmentType generated by hbm2java
 */
@Entity
@Table(name="bene_assignment_type"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class BeneAssignmentType  implements java.io.Serializable {


     private String beneAssignmentTypeCd;
     private String beneAssignmentTypeDesc;
     private Character isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public BeneAssignmentType() {
    }

	
    public BeneAssignmentType(String beneAssignmentTypeCd, String beneAssignmentTypeDesc) {
        this.beneAssignmentTypeCd = beneAssignmentTypeCd;
        this.beneAssignmentTypeDesc = beneAssignmentTypeDesc;
    }
    public BeneAssignmentType(String beneAssignmentTypeCd, String beneAssignmentTypeDesc, Character isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.beneAssignmentTypeCd = beneAssignmentTypeCd;
       this.beneAssignmentTypeDesc = beneAssignmentTypeDesc;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id 

    
    @Column(name="bene_assignment_type_cd", unique=true, nullable=false, length=50)
    public String getBeneAssignmentTypeCd() {
        return this.beneAssignmentTypeCd;
    }
    
    public void setBeneAssignmentTypeCd(String beneAssignmentTypeCd) {
        this.beneAssignmentTypeCd = beneAssignmentTypeCd;
    }

    
    @Column(name="bene_assignment_type_desc", nullable=false, length=50)
    public String getBeneAssignmentTypeDesc() {
        return this.beneAssignmentTypeDesc;
    }
    
    public void setBeneAssignmentTypeDesc(String beneAssignmentTypeDesc) {
        this.beneAssignmentTypeDesc = beneAssignmentTypeDesc;
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

