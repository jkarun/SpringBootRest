package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


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
 * CaseBeneficiaryStakeholderMap generated by hbm2java
 */
@Entity
@Table(name="case_beneficiary_stakeholder_map"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseBeneficiaryStakeholderMap  implements java.io.Serializable {


     private Integer beneficiaryMapId;
     private CaseClientMap caseClientMapByCaseBeneficiaryId;
     private CaseClientMap caseClientMapByCaseClientMapId;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public CaseBeneficiaryStakeholderMap() {
    }

	
    public CaseBeneficiaryStakeholderMap(CaseClientMap caseClientMapByCaseBeneficiaryId, CaseClientMap caseClientMapByCaseClientMapId, char isDeletedInd, Date lstUpdtDtm) {
        this.caseClientMapByCaseBeneficiaryId = caseClientMapByCaseBeneficiaryId;
        this.caseClientMapByCaseClientMapId = caseClientMapByCaseClientMapId;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseBeneficiaryStakeholderMap(CaseClientMap caseClientMapByCaseBeneficiaryId, CaseClientMap caseClientMapByCaseClientMapId, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.caseClientMapByCaseBeneficiaryId = caseClientMapByCaseBeneficiaryId;
       this.caseClientMapByCaseClientMapId = caseClientMapByCaseClientMapId;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="beneficiary_map_id", unique=true, nullable=false)
    public Integer getBeneficiaryMapId() {
        return this.beneficiaryMapId;
    }
    
    public void setBeneficiaryMapId(Integer beneficiaryMapId) {
        this.beneficiaryMapId = beneficiaryMapId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_beneficiary_id", nullable=false)
    public CaseClientMap getCaseClientMapByCaseBeneficiaryId() {
        return this.caseClientMapByCaseBeneficiaryId;
    }
    
    public void setCaseClientMapByCaseBeneficiaryId(CaseClientMap caseClientMapByCaseBeneficiaryId) {
        this.caseClientMapByCaseBeneficiaryId = caseClientMapByCaseBeneficiaryId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_client_map_id", nullable=false)
    public CaseClientMap getCaseClientMapByCaseClientMapId() {
        return this.caseClientMapByCaseClientMapId;
    }
    
    public void setCaseClientMapByCaseClientMapId(CaseClientMap caseClientMapByCaseClientMapId) {
        this.caseClientMapByCaseClientMapId = caseClientMapByCaseClientMapId;
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


