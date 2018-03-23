package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PicfSequencer generated by hbm2java
 */
@Entity
@Table(name="picf_sequencer"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfSequencer  implements java.io.Serializable {


     private BigDecimal id;
     private String name;
     private BigDecimal curValue;
     private String activePrefix;
     private int increment;
     private BigDecimal lastUpdatedUser;
     private Date lastUpdatedDate;
     private Byte isDeleted;

    public PicfSequencer() {
    }

	
    public PicfSequencer(String name, BigDecimal curValue, int increment) {
        this.name = name;
        this.curValue = curValue;
        this.increment = increment;
    }
    public PicfSequencer(String name, BigDecimal curValue, String activePrefix, int increment, BigDecimal lastUpdatedUser, Date lastUpdatedDate, Byte isDeleted) {
       this.name = name;
       this.curValue = curValue;
       this.activePrefix = activePrefix;
       this.increment = increment;
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

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="cur_value", nullable=false, scale=0)
    public BigDecimal getCurValue() {
        return this.curValue;
    }
    
    public void setCurValue(BigDecimal curValue) {
        this.curValue = curValue;
    }

    
    @Column(name="active_prefix", length=10)
    public String getActivePrefix() {
        return this.activePrefix;
    }
    
    public void setActivePrefix(String activePrefix) {
        this.activePrefix = activePrefix;
    }

    
    @Column(name="increment", nullable=false)
    public int getIncrement() {
        return this.increment;
    }
    
    public void setIncrement(int increment) {
        this.increment = increment;
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

