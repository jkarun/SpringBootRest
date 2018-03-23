package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AgentInboxView generated by hbm2java
 */
@Entity
@Table(name="AGENT_INBOX_VIEW"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class AgentInboxView  implements java.io.Serializable {


     private AgentInboxViewId id;

    public AgentInboxView() {
    }

    public AgentInboxView(AgentInboxViewId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="caseid", column=@Column(name="CASEID", length=21) ), 
        @AttributeOverride(name="caseId", column=@Column(name="CASE_ID", nullable=false) ), 
        @AttributeOverride(name="insuredName", column=@Column(name="INSURED_NAME", length=101) ), 
        @AttributeOverride(name="insuredContact", column=@Column(name="INSURED_CONTACT", length=100) ), 
        @AttributeOverride(name="planCode", column=@Column(name="PLAN_CODE", length=15) ), 
        @AttributeOverride(name="planName", column=@Column(name="PLAN_NAME", length=250) ), 
        @AttributeOverride(name="productCode", column=@Column(name="PRODUCT_CODE", length=8) ), 
        @AttributeOverride(name="productName", column=@Column(name="PRODUCT_NAME", length=100) ), 
        @AttributeOverride(name="faceAmount", column=@Column(name="FACE_AMOUNT", length=8000) ), 
        @AttributeOverride(name="amountCollected", column=@Column(name="AMOUNT_COLLECTED", precision=12) ), 
        @AttributeOverride(name="casetypecd", column=@Column(name="CASETYPECD", length=20) ), 
        @AttributeOverride(name="signedDate", column=@Column(name="SIGNED_DATE", length=23) ), 
        @AttributeOverride(name="daysLeftToSubmit", column=@Column(name="DAYS_LEFT_TO_SUBMIT") ), 
        @AttributeOverride(name="applncasetypecd", column=@Column(name="APPLNCASETYPECD", length=20) ), 
        @AttributeOverride(name="companyid", column=@Column(name="COMPANYID") ), 
        @AttributeOverride(name="companyCode", column=@Column(name="COMPANY_CODE", length=8) ), 
        @AttributeOverride(name="companyName", column=@Column(name="COMPANY_NAME", length=100) ), 
        @AttributeOverride(name="lstUpdtUserId", column=@Column(name="LST_UPDT_USER_ID", length=50) ), 
        @AttributeOverride(name="caseStatus", column=@Column(name="CASE_STATUS", nullable=false, length=20) ) } )
    public AgentInboxViewId getId() {
        return this.id;
    }
    
    public void setId(AgentInboxViewId id) {
        this.id = id;
    }




}


