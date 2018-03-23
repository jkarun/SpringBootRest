package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SiProperty generated by hbm2java
 */
@Entity
@Table(name="si_property"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class SiProperty  implements java.io.Serializable {


     private SiPropertyId id;
     private String propVluTxt;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public SiProperty() {
    }

	
    public SiProperty(SiPropertyId id, char isDeletedInd, Date lstUpdtDtm) {
        this.id = id;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public SiProperty(SiPropertyId id, String propVluTxt, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.id = id;
       this.propVluTxt = propVluTxt;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="propCatCd", column=@Column(name="prop_cat_cd", nullable=false, length=50) ), 
        @AttributeOverride(name="propNm", column=@Column(name="prop_nm", nullable=false, length=50) ) } )
    public SiPropertyId getId() {
        return this.id;
    }
    
    public void setId(SiPropertyId id) {
        this.id = id;
    }

    
    @Column(name="prop_vlu_txt", length=500)
    public String getPropVluTxt() {
        return this.propVluTxt;
    }
    
    public void setPropVluTxt(String propVluTxt) {
        this.propVluTxt = propVluTxt;
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

