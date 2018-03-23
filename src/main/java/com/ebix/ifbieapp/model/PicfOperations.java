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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PicfOperations generated by hbm2java
 */
@Entity
@Table(name="picf_operations"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfOperations  implements java.io.Serializable {


     private BigDecimal id;
     private String operation;
     private String operationDesc;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;
     private Byte isDeleted;
     private int actionWeight;
     private Set<PicfResourceActions> picfResourceActionses = new HashSet<PicfResourceActions>(0);

    public PicfOperations() {
    }

	
    public PicfOperations(String operation, int actionWeight) {
        this.operation = operation;
        this.actionWeight = actionWeight;
    }
    public PicfOperations(String operation, String operationDesc, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted, int actionWeight, Set<PicfResourceActions> picfResourceActionses) {
       this.operation = operation;
       this.operationDesc = operationDesc;
       this.lastUpdatedUser = lastUpdatedUser;
       this.lastUpdatedDate = lastUpdatedDate;
       this.isDeleted = isDeleted;
       this.actionWeight = actionWeight;
       this.picfResourceActionses = picfResourceActionses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="operation", nullable=false, length=20)
    public String getOperation() {
        return this.operation;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }

    
    @Column(name="operation_desc", length=20)
    public String getOperationDesc() {
        return this.operationDesc;
    }
    
    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc;
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

    
    @Column(name="action_weight", nullable=false)
    public int getActionWeight() {
        return this.actionWeight;
    }
    
    public void setActionWeight(int actionWeight) {
        this.actionWeight = actionWeight;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfOperations")
    public Set<PicfResourceActions> getPicfResourceActionses() {
        return this.picfResourceActionses;
    }
    
    public void setPicfResourceActionses(Set<PicfResourceActions> picfResourceActionses) {
        this.picfResourceActionses = picfResourceActionses;
    }




}

