package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PicfFormAttachment generated by hbm2java
 */
@Entity
@Table(name="picf_form_attachment"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfFormAttachment  implements java.io.Serializable {


     private BigDecimal id;
     private PicfAttachment picfAttachment;
     private PicfFormTemplate picfFormTemplate;
     private BigDecimal formAuditId;
     private String resourceType;
     private BigDecimal resourceId;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;

    public PicfFormAttachment() {
    }

	
    public PicfFormAttachment(PicfAttachment picfAttachment) {
        this.picfAttachment = picfAttachment;
    }
    public PicfFormAttachment(PicfAttachment picfAttachment, PicfFormTemplate picfFormTemplate, BigDecimal formAuditId, String resourceType, BigDecimal resourceId, BigDecimal lastUpdatedUser, Date lastUpdatedDate) {
       this.picfAttachment = picfAttachment;
       this.picfFormTemplate = picfFormTemplate;
       this.formAuditId = formAuditId;
       this.resourceType = resourceType;
       this.resourceId = resourceId;
       this.lastUpdatedUser = lastUpdatedUser;
       this.lastUpdatedDate = lastUpdatedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="attachment_id", nullable=false)
    public PicfAttachment getPicfAttachment() {
        return this.picfAttachment;
    }
    
    public void setPicfAttachment(PicfAttachment picfAttachment) {
        this.picfAttachment = picfAttachment;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="form_id")
    public PicfFormTemplate getPicfFormTemplate() {
        return this.picfFormTemplate;
    }
    
    public void setPicfFormTemplate(PicfFormTemplate picfFormTemplate) {
        this.picfFormTemplate = picfFormTemplate;
    }

    
    @Column(name="formAudit_id", scale=0)
    public BigDecimal getFormAuditId() {
        return this.formAuditId;
    }
    
    public void setFormAuditId(BigDecimal formAuditId) {
        this.formAuditId = formAuditId;
    }

    
    @Column(name="resourceType", length=50)
    public String getResourceType() {
        return this.resourceType;
    }
    
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    
    @Column(name="resourceId", scale=0)
    public BigDecimal getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    
    @Column(name="last_updated_user", scale=0)
    public BigDecimal getLastUpdatedUser() {
        return this.lastUpdatedUser;
    }
    
    public void setLastUpdatedUser(BigDecimal lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_updated_date", length=23)
    public Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }




}


