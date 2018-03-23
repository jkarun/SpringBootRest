package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


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
 * CaseCoverage generated by hbm2java
 */
@Entity
@Table(name="case_coverage"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseCoverage  implements java.io.Serializable {


     private Integer caseCoverageId;
     private AppCase appCase;
     private Integer benefitRiderId;
     private Integer masterBenefitRiderId;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;
     private Set<CaseClientCoverage> caseClientCoverages = new HashSet<CaseClientCoverage>(0);
     private Set<CaseCoverageDetails> caseCoverageDetailses = new HashSet<CaseCoverageDetails>(0);

    public CaseCoverage() {
    }

	
    public CaseCoverage(char isDeletedInd, Date lstUpdtDtm) {
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseCoverage(AppCase appCase, Integer benefitRiderId, Integer masterBenefitRiderId, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, Set<CaseClientCoverage> caseClientCoverages, Set<CaseCoverageDetails> caseCoverageDetailses) {
       this.appCase = appCase;
       this.benefitRiderId = benefitRiderId;
       this.masterBenefitRiderId = masterBenefitRiderId;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
       this.caseClientCoverages = caseClientCoverages;
       this.caseCoverageDetailses = caseCoverageDetailses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="case_coverage_id", unique=true, nullable=false)
    public Integer getCaseCoverageId() {
        return this.caseCoverageId;
    }
    
    public void setCaseCoverageId(Integer caseCoverageId) {
        this.caseCoverageId = caseCoverageId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_id")
    public AppCase getAppCase() {
        return this.appCase;
    }
    
    public void setAppCase(AppCase appCase) {
        this.appCase = appCase;
    }

    
    @Column(name="benefit_rider_id")
    public Integer getBenefitRiderId() {
        return this.benefitRiderId;
    }
    
    public void setBenefitRiderId(Integer benefitRiderId) {
        this.benefitRiderId = benefitRiderId;
    }

    
    @Column(name="master_benefit_rider_id")
    public Integer getMasterBenefitRiderId() {
        return this.masterBenefitRiderId;
    }
    
    public void setMasterBenefitRiderId(Integer masterBenefitRiderId) {
        this.masterBenefitRiderId = masterBenefitRiderId;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="caseCoverage")
    public Set<CaseClientCoverage> getCaseClientCoverages() {
        return this.caseClientCoverages;
    }
    
    public void setCaseClientCoverages(Set<CaseClientCoverage> caseClientCoverages) {
        this.caseClientCoverages = caseClientCoverages;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="caseCoverage")
    public Set<CaseCoverageDetails> getCaseCoverageDetailses() {
        return this.caseCoverageDetailses;
    }
    
    public void setCaseCoverageDetailses(Set<CaseCoverageDetails> caseCoverageDetailses) {
        this.caseCoverageDetailses = caseCoverageDetailses;
    }




}


