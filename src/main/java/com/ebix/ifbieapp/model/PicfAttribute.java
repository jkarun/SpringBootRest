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
 * PicfAttribute generated by hbm2java
 */
@Entity
@Table(name="picf_attribute"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfAttribute  implements java.io.Serializable {


     private BigDecimal id;
     private PicfAttributeSet picfAttributeSet;
     private String attrName;
     private String attrDisplayName;
     private String attrDesc;
     private String attrDataType;
     private String attrDefaultValue;
     private String attrFieldType;
     private String attrMaskType;
     private String attrMinLength;
     private String attrMaxLength;
     private Date attrMinDate;
     private Date attrMaxDate;
     private String comboType;
     private String entityName;
     private String keyPropertyName;
     private String valuePropertyName;
     private Character readOnlyIndicator;
     private Character visibleIndicator;
     private BigDecimal tenantId;
     private Date lastUpdatedDate;
     private BigDecimal lastUpdatedUser;
     private Byte isDeleted;
     private Set<PicfAcrofields> picfAcrofieldses = new HashSet<PicfAcrofields>(0);
     private Set<PicfAttributeValue> picfAttributeValues = new HashSet<PicfAttributeValue>(0);
     private Set<PicfAttrkvpair> picfAttrkvpairs = new HashSet<PicfAttrkvpair>(0);

    public PicfAttribute() {
    }

    public PicfAttribute(PicfAttributeSet picfAttributeSet, String attrName, String attrDisplayName, String attrDesc, String attrDataType, String attrDefaultValue, String attrFieldType, String attrMaskType, String attrMinLength, String attrMaxLength, Date attrMinDate, Date attrMaxDate, String comboType, String entityName, String keyPropertyName, String valuePropertyName, Character readOnlyIndicator, Character visibleIndicator, BigDecimal tenantId, Date lastUpdatedDate, BigDecimal lastUpdatedUser, Byte isDeleted, Set<PicfAcrofields> picfAcrofieldses, Set<PicfAttributeValue> picfAttributeValues, Set<PicfAttrkvpair> picfAttrkvpairs) {
       this.picfAttributeSet = picfAttributeSet;
       this.attrName = attrName;
       this.attrDisplayName = attrDisplayName;
       this.attrDesc = attrDesc;
       this.attrDataType = attrDataType;
       this.attrDefaultValue = attrDefaultValue;
       this.attrFieldType = attrFieldType;
       this.attrMaskType = attrMaskType;
       this.attrMinLength = attrMinLength;
       this.attrMaxLength = attrMaxLength;
       this.attrMinDate = attrMinDate;
       this.attrMaxDate = attrMaxDate;
       this.comboType = comboType;
       this.entityName = entityName;
       this.keyPropertyName = keyPropertyName;
       this.valuePropertyName = valuePropertyName;
       this.readOnlyIndicator = readOnlyIndicator;
       this.visibleIndicator = visibleIndicator;
       this.tenantId = tenantId;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedUser = lastUpdatedUser;
       this.isDeleted = isDeleted;
       this.picfAcrofieldses = picfAcrofieldses;
       this.picfAttributeValues = picfAttributeValues;
       this.picfAttrkvpairs = picfAttrkvpairs;
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
    @JoinColumn(name="attrSetId")
    public PicfAttributeSet getPicfAttributeSet() {
        return this.picfAttributeSet;
    }
    
    public void setPicfAttributeSet(PicfAttributeSet picfAttributeSet) {
        this.picfAttributeSet = picfAttributeSet;
    }

    
    @Column(name="attrName", length=30)
    public String getAttrName() {
        return this.attrName;
    }
    
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    
    @Column(name="attrDisplayName", length=30)
    public String getAttrDisplayName() {
        return this.attrDisplayName;
    }
    
    public void setAttrDisplayName(String attrDisplayName) {
        this.attrDisplayName = attrDisplayName;
    }

    
    @Column(name="attrDesc", length=250)
    public String getAttrDesc() {
        return this.attrDesc;
    }
    
    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    
    @Column(name="attrDataType", length=30)
    public String getAttrDataType() {
        return this.attrDataType;
    }
    
    public void setAttrDataType(String attrDataType) {
        this.attrDataType = attrDataType;
    }

    
    @Column(name="attrDefaultValue", length=30)
    public String getAttrDefaultValue() {
        return this.attrDefaultValue;
    }
    
    public void setAttrDefaultValue(String attrDefaultValue) {
        this.attrDefaultValue = attrDefaultValue;
    }

    
    @Column(name="attrFieldType", length=30)
    public String getAttrFieldType() {
        return this.attrFieldType;
    }
    
    public void setAttrFieldType(String attrFieldType) {
        this.attrFieldType = attrFieldType;
    }

    
    @Column(name="attrMaskType", length=30)
    public String getAttrMaskType() {
        return this.attrMaskType;
    }
    
    public void setAttrMaskType(String attrMaskType) {
        this.attrMaskType = attrMaskType;
    }

    
    @Column(name="attrMinLength", length=100)
    public String getAttrMinLength() {
        return this.attrMinLength;
    }
    
    public void setAttrMinLength(String attrMinLength) {
        this.attrMinLength = attrMinLength;
    }

    
    @Column(name="attrMaxLength", length=100)
    public String getAttrMaxLength() {
        return this.attrMaxLength;
    }
    
    public void setAttrMaxLength(String attrMaxLength) {
        this.attrMaxLength = attrMaxLength;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="attrMinDate", length=23)
    public Date getAttrMinDate() {
        return this.attrMinDate;
    }
    
    public void setAttrMinDate(Date attrMinDate) {
        this.attrMinDate = attrMinDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="attrMaxDate", length=23)
    public Date getAttrMaxDate() {
        return this.attrMaxDate;
    }
    
    public void setAttrMaxDate(Date attrMaxDate) {
        this.attrMaxDate = attrMaxDate;
    }

    
    @Column(name="comboType", length=10)
    public String getComboType() {
        return this.comboType;
    }
    
    public void setComboType(String comboType) {
        this.comboType = comboType;
    }

    
    @Column(name="entityName")
    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    
    @Column(name="keyPropertyName")
    public String getKeyPropertyName() {
        return this.keyPropertyName;
    }
    
    public void setKeyPropertyName(String keyPropertyName) {
        this.keyPropertyName = keyPropertyName;
    }

    
    @Column(name="valuePropertyName")
    public String getValuePropertyName() {
        return this.valuePropertyName;
    }
    
    public void setValuePropertyName(String valuePropertyName) {
        this.valuePropertyName = valuePropertyName;
    }

    
    @Column(name="readOnlyIndicator", length=1)
    public Character getReadOnlyIndicator() {
        return this.readOnlyIndicator;
    }
    
    public void setReadOnlyIndicator(Character readOnlyIndicator) {
        this.readOnlyIndicator = readOnlyIndicator;
    }

    
    @Column(name="visibleIndicator", length=1)
    public Character getVisibleIndicator() {
        return this.visibleIndicator;
    }
    
    public void setVisibleIndicator(Character visibleIndicator) {
        this.visibleIndicator = visibleIndicator;
    }

    
    @Column(name="tenant_id", scale=0)
    public BigDecimal getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(BigDecimal tenantId) {
        this.tenantId = tenantId;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfAttribute")
    public Set<PicfAcrofields> getPicfAcrofieldses() {
        return this.picfAcrofieldses;
    }
    
    public void setPicfAcrofieldses(Set<PicfAcrofields> picfAcrofieldses) {
        this.picfAcrofieldses = picfAcrofieldses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfAttribute")
    public Set<PicfAttributeValue> getPicfAttributeValues() {
        return this.picfAttributeValues;
    }
    
    public void setPicfAttributeValues(Set<PicfAttributeValue> picfAttributeValues) {
        this.picfAttributeValues = picfAttributeValues;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="picfAttribute")
    public Set<PicfAttrkvpair> getPicfAttrkvpairs() {
        return this.picfAttrkvpairs;
    }
    
    public void setPicfAttrkvpairs(Set<PicfAttrkvpair> picfAttrkvpairs) {
        this.picfAttrkvpairs = picfAttrkvpairs;
    }




}

