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
 * PicfRolePermissions generated by hbm2java
 */
@Entity
@Table(name="picf_role_permissions"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfRolePermissions  implements java.io.Serializable {


     private BigDecimal id;
     private PicfRole picfRole;
     private int actions;
     private String resourceDn;
     private BigDecimal resourceId;
     private BigDecimal tenantId;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;
     private Byte isDeleted;

    public PicfRolePermissions() {
    }

	
    public PicfRolePermissions(PicfRole picfRole, int actions) {
        this.picfRole = picfRole;
        this.actions = actions;
    }
    public PicfRolePermissions(PicfRole picfRole, int actions, String resourceDn, BigDecimal resourceId, BigDecimal tenantId, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted) {
       this.picfRole = picfRole;
       this.actions = actions;
       this.resourceDn = resourceDn;
       this.resourceId = resourceId;
       this.tenantId = tenantId;
       this.lastUpdatedUser = lastUpdatedUser;
       this.lastUpdatedDate = lastUpdatedDate;
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
    @JoinColumn(name="role_id", nullable=false)
    public PicfRole getPicfRole() {
        return this.picfRole;
    }
    
    public void setPicfRole(PicfRole picfRole) {
        this.picfRole = picfRole;
    }

    
    @Column(name="actions", nullable=false)
    public int getActions() {
        return this.actions;
    }
    
    public void setActions(int actions) {
        this.actions = actions;
    }

    
    @Column(name="resource_dn", length=150)
    public String getResourceDn() {
        return this.resourceDn;
    }
    
    public void setResourceDn(String resourceDn) {
        this.resourceDn = resourceDn;
    }

    
    @Column(name="resource_id", scale=0)
    public BigDecimal getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    
    @Column(name="tenant_id", scale=0)
    public BigDecimal getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(BigDecimal tenantId) {
        this.tenantId = tenantId;
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




}

