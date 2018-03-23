package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PicfNotes generated by hbm2java
 */
@Entity
@Table(name="picf_notes"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfNotes  implements java.io.Serializable {


     private BigDecimal id;
     private PicfGroup picfGroup;
     private PicfNotes picfNotes;
     private String text;
     private String accessType;
     private String resourceType;
     private BigDecimal resourceId;
     private Byte isDraft;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;
     private Byte isDeleted;
     private Set<PicfNotes> picfNoteses = new HashSet<PicfNotes>(0);

    public PicfNotes() {
    }

	
    public PicfNotes(PicfGroup picfGroup, String resourceType) {
        this.picfGroup = picfGroup;
        this.resourceType = resourceType;
    }
    public PicfNotes(PicfGroup picfGroup, PicfNotes picfNotes, String text, String accessType, String resourceType, BigDecimal resourceId, Byte isDraft, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted, Set<PicfNotes> picfNoteses) {
       this.picfGroup = picfGroup;
       this.picfNotes = picfNotes;
       this.text = text;
       this.accessType = accessType;
       this.resourceType = resourceType;
       this.resourceId = resourceId;
       this.isDraft = isDraft;
       this.lastUpdatedUser = lastUpdatedUser;
       this.lastUpdatedDate = lastUpdatedDate;
       this.isDeleted = isDeleted;
       this.picfNoteses = picfNoteses;
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
    @JoinColumn(name="group_id", nullable=false)
    public PicfGroup getPicfGroup() {
        return this.picfGroup;
    }
    
    public void setPicfGroup(PicfGroup picfGroup) {
        this.picfGroup = picfGroup;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent")
    public PicfNotes getPicfNotes() {
        return this.picfNotes;
    }
    
    public void setPicfNotes(PicfNotes picfNotes) {
        this.picfNotes = picfNotes;
    }

    
    @Column(name="text")
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    
    @Column(name="access_type")
    public String getAccessType() {
        return this.accessType;
    }
    
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    
    @Column(name="resource_type", nullable=false, length=50)
    public String getResourceType() {
        return this.resourceType;
    }
    
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    
    @Column(name="resource_id", scale=0)
    public BigDecimal getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    
    @Column(name="isDraft")
    public Byte getIsDraft() {
        return this.isDraft;
    }
    
    public void setIsDraft(Byte isDraft) {
        this.isDraft = isDraft;
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

    
    @Column(name="is_deleted")
    public Byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfNotes")
    public Set<PicfNotes> getPicfNoteses() {
        return this.picfNoteses;
    }
    
    public void setPicfNoteses(Set<PicfNotes> picfNoteses) {
        this.picfNoteses = picfNoteses;
    }




}

