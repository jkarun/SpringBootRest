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
 * PicfHierarchyType generated by hbm2java
 */
@Entity
@Table(name="picf_hierarchy_type"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfHierarchyType  implements java.io.Serializable {


     private BigDecimal id;
     private String name;
     private String description;
     private String code;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;
     private Byte isDeleted;
     private Set<PicfGroup> picfGroups = new HashSet<PicfGroup>(0);

    public PicfHierarchyType() {
    }

    public PicfHierarchyType(String name, String description, String code, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted, Set<PicfGroup> picfGroups) {
       this.name = name;
       this.description = description;
       this.code = code;
       this.lastUpdatedUser = lastUpdatedUser;
       this.lastUpdatedDate = lastUpdatedDate;
       this.isDeleted = isDeleted;
       this.picfGroups = picfGroups;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", length=45)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="code", length=50)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfHierarchyType")
    public Set<PicfGroup> getPicfGroups() {
        return this.picfGroups;
    }
    
    public void setPicfGroups(Set<PicfGroup> picfGroups) {
        this.picfGroups = picfGroups;
    }




}


