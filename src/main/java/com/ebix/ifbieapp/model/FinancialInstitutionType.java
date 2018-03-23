package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FinancialInstitutionType generated by hbm2java
 */
@Entity
@Table(name="financial_institution_type"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class FinancialInstitutionType  implements java.io.Serializable {


     private int financialInstitutionTypeId;
     private String financialInstitutionTypeDesc;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public FinancialInstitutionType() {
    }

	
    public FinancialInstitutionType(int financialInstitutionTypeId, char isDeletedInd, Date lstUpdtDtm) {
        this.financialInstitutionTypeId = financialInstitutionTypeId;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public FinancialInstitutionType(int financialInstitutionTypeId, String financialInstitutionTypeDesc, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.financialInstitutionTypeId = financialInstitutionTypeId;
       this.financialInstitutionTypeDesc = financialInstitutionTypeDesc;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id 

    
    @Column(name="financial_institution_type_id", unique=true, nullable=false)
    public int getFinancialInstitutionTypeId() {
        return this.financialInstitutionTypeId;
    }
    
    public void setFinancialInstitutionTypeId(int financialInstitutionTypeId) {
        this.financialInstitutionTypeId = financialInstitutionTypeId;
    }

    
    @Column(name="financial_institution_type_desc", length=50)
    public String getFinancialInstitutionTypeDesc() {
        return this.financialInstitutionTypeDesc;
    }
    
    public void setFinancialInstitutionTypeDesc(String financialInstitutionTypeDesc) {
        this.financialInstitutionTypeDesc = financialInstitutionTypeDesc;
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

