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
 * CaseClientFlatextra generated by hbm2java
 */
@Entity
@Table(name="case_client_flatextra"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseClientFlatextra  implements java.io.Serializable {


     private Integer caseClientFlextId;
     private CaseClientMap caseClientMap;
     private BigDecimal flatextraValue;
     private int flatextraYears;
     private char flatextraFlag;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public CaseClientFlatextra() {
    }

	
    public CaseClientFlatextra(CaseClientMap caseClientMap, BigDecimal flatextraValue, int flatextraYears, char flatextraFlag, char isDeletedInd, Date lstUpdtDtm) {
        this.caseClientMap = caseClientMap;
        this.flatextraValue = flatextraValue;
        this.flatextraYears = flatextraYears;
        this.flatextraFlag = flatextraFlag;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseClientFlatextra(CaseClientMap caseClientMap, BigDecimal flatextraValue, int flatextraYears, char flatextraFlag, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.caseClientMap = caseClientMap;
       this.flatextraValue = flatextraValue;
       this.flatextraYears = flatextraYears;
       this.flatextraFlag = flatextraFlag;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="case_client_flext_id", unique=true, nullable=false)
    public Integer getCaseClientFlextId() {
        return this.caseClientFlextId;
    }
    
    public void setCaseClientFlextId(Integer caseClientFlextId) {
        this.caseClientFlextId = caseClientFlextId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_client_map_id", nullable=false)
    public CaseClientMap getCaseClientMap() {
        return this.caseClientMap;
    }
    
    public void setCaseClientMap(CaseClientMap caseClientMap) {
        this.caseClientMap = caseClientMap;
    }

    
    @Column(name="flatextra_value", nullable=false, precision=18)
    public BigDecimal getFlatextraValue() {
        return this.flatextraValue;
    }
    
    public void setFlatextraValue(BigDecimal flatextraValue) {
        this.flatextraValue = flatextraValue;
    }

    
    @Column(name="flatextra_years", nullable=false)
    public int getFlatextraYears() {
        return this.flatextraYears;
    }
    
    public void setFlatextraYears(int flatextraYears) {
        this.flatextraYears = flatextraYears;
    }

    
    @Column(name="flatextra_flag", nullable=false, length=1)
    public char getFlatextraFlag() {
        return this.flatextraFlag;
    }
    
    public void setFlatextraFlag(char flatextraFlag) {
        this.flatextraFlag = flatextraFlag;
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

