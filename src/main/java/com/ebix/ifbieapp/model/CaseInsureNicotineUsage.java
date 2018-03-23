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
 * CaseInsureNicotineUsage generated by hbm2java
 */
@Entity
@Table(name="case_insure_nicotine_usage"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseInsureNicotineUsage  implements java.io.Serializable {


     private Integer caseInsureNicotineUsageId;
     private CaseClientMap caseClientMap;
     private Character nicotineUseInd;
     private String nicotineTypeCd;
     private String nicotineTypeOther;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;
     private String nicotineLastUsedDate;
     private Character nicotinePastAndQuitInd;

    public CaseInsureNicotineUsage() {
    }

	
    public CaseInsureNicotineUsage(char isDeletedInd, Date lstUpdtDtm) {
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseInsureNicotineUsage(CaseClientMap caseClientMap, Character nicotineUseInd, String nicotineTypeCd, String nicotineTypeOther, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, String nicotineLastUsedDate, Character nicotinePastAndQuitInd) {
       this.caseClientMap = caseClientMap;
       this.nicotineUseInd = nicotineUseInd;
       this.nicotineTypeCd = nicotineTypeCd;
       this.nicotineTypeOther = nicotineTypeOther;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
       this.nicotineLastUsedDate = nicotineLastUsedDate;
       this.nicotinePastAndQuitInd = nicotinePastAndQuitInd;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="case_insure_nicotine_usage_id", unique=true, nullable=false)
    public Integer getCaseInsureNicotineUsageId() {
        return this.caseInsureNicotineUsageId;
    }
    
    public void setCaseInsureNicotineUsageId(Integer caseInsureNicotineUsageId) {
        this.caseInsureNicotineUsageId = caseInsureNicotineUsageId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_client_map_id")
    public CaseClientMap getCaseClientMap() {
        return this.caseClientMap;
    }
    
    public void setCaseClientMap(CaseClientMap caseClientMap) {
        this.caseClientMap = caseClientMap;
    }

    
    @Column(name="nicotine_use_ind", length=1)
    public Character getNicotineUseInd() {
        return this.nicotineUseInd;
    }
    
    public void setNicotineUseInd(Character nicotineUseInd) {
        this.nicotineUseInd = nicotineUseInd;
    }

    
    @Column(name="nicotine_type_cd", length=8)
    public String getNicotineTypeCd() {
        return this.nicotineTypeCd;
    }
    
    public void setNicotineTypeCd(String nicotineTypeCd) {
        this.nicotineTypeCd = nicotineTypeCd;
    }

    
    @Column(name="nicotine_type_other", length=50)
    public String getNicotineTypeOther() {
        return this.nicotineTypeOther;
    }
    
    public void setNicotineTypeOther(String nicotineTypeOther) {
        this.nicotineTypeOther = nicotineTypeOther;
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

    
    @Column(name="nicotine_last_used_date", length=50)
    public String getNicotineLastUsedDate() {
        return this.nicotineLastUsedDate;
    }
    
    public void setNicotineLastUsedDate(String nicotineLastUsedDate) {
        this.nicotineLastUsedDate = nicotineLastUsedDate;
    }

    
    @Column(name="nicotine_past_and_quit_ind", length=1)
    public Character getNicotinePastAndQuitInd() {
        return this.nicotinePastAndQuitInd;
    }
    
    public void setNicotinePastAndQuitInd(Character nicotinePastAndQuitInd) {
        this.nicotinePastAndQuitInd = nicotinePastAndQuitInd;
    }




}

