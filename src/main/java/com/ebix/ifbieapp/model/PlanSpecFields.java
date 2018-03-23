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
 * PlanSpecFields generated by hbm2java
 */
@Entity
@Table(name="plan_spec_fields"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PlanSpecFields  implements java.io.Serializable {


     private int planSpecFieldId;
     private int planId;
     private String fieldName;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public PlanSpecFields() {
    }

	
    public PlanSpecFields(int planSpecFieldId, int planId, char isDeletedInd, Date lstUpdtDtm) {
        this.planSpecFieldId = planSpecFieldId;
        this.planId = planId;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public PlanSpecFields(int planSpecFieldId, int planId, String fieldName, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.planSpecFieldId = planSpecFieldId;
       this.planId = planId;
       this.fieldName = fieldName;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id 

    
    @Column(name="plan_spec_field_id", unique=true, nullable=false)
    public int getPlanSpecFieldId() {
        return this.planSpecFieldId;
    }
    
    public void setPlanSpecFieldId(int planSpecFieldId) {
        this.planSpecFieldId = planSpecFieldId;
    }

    
    @Column(name="plan_id", nullable=false)
    public int getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(int planId) {
        this.planId = planId;
    }

    
    @Column(name="field_name", length=50)
    public String getFieldName() {
        return this.fieldName;
    }
    
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    
    @Column(name="is_deleted_ind", nullable=false, length=1)
    public char getIsDeletedInd() {
        return this.isDeletedInd;
    }
    
    public void setIsDeletedInd(char isDeletedInd) {
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
    @Column(name="lst_updt_dtm", nullable=false, length=23)
    public Date getLstUpdtDtm() {
        return this.lstUpdtDtm;
    }
    
    public void setLstUpdtDtm(Date lstUpdtDtm) {
        this.lstUpdtDtm = lstUpdtDtm;
    }




}


