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
 * PicfAttrkvpair generated by hbm2java
 */
@Entity
@Table(name="picf_attrkvpair"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfAttrkvpair  implements java.io.Serializable {


     private BigDecimal id;
     private PicfAttribute picfAttribute;
     private String attrkey;
     private String attrValue;
     private Date lastUpdatedDate;
     private BigDecimal lastUpdatedUser;
     private Byte isDeleted;

    public PicfAttrkvpair() {
    }

    public PicfAttrkvpair(PicfAttribute picfAttribute, String attrkey, String attrValue, Date lastUpdatedDate, BigDecimal lastUpdatedUser, Byte isDeleted) {
       this.picfAttribute = picfAttribute;
       this.attrkey = attrkey;
       this.attrValue = attrValue;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedUser = lastUpdatedUser;
       this.isDeleted = isDeleted;
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
    @JoinColumn(name="attrId")
    public PicfAttribute getPicfAttribute() {
        return this.picfAttribute;
    }
    
    public void setPicfAttribute(PicfAttribute picfAttribute) {
        this.picfAttribute = picfAttribute;
    }

    
    @Column(name="attrkey", length=250)
    public String getAttrkey() {
        return this.attrkey;
    }
    
    public void setAttrkey(String attrkey) {
        this.attrkey = attrkey;
    }

    
    @Column(name="attrValue", length=250)
    public String getAttrValue() {
        return this.attrValue;
    }
    
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_updated_date", length=23)
    public Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    
    @Column(name="last_updated_user", scale=0)
    public BigDecimal getLastUpdatedUser() {
        return this.lastUpdatedUser;
    }
    
    public void setLastUpdatedUser(BigDecimal lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    
    @Column(name="is_deleted")
    public Byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }




}


