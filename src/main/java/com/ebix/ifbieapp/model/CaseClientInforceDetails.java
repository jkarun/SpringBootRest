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
 * CaseClientInforceDetails generated by hbm2java
 */
@Entity
@Table(name="case_client_inforce_details"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseClientInforceDetails  implements java.io.Serializable {


     private Integer caseClientInforceDetailsId;
     private CaseClientMap caseClientMap;
     private Character hasOtherPoliciesInforceInd;
     private Character replaceInd;
     private Integer numberOfPoliciesInforce;
     private Character adbInforceInd;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;
     private String adbAmt;
     private Character haveOtherLifeInd;
     private BigDecimal amountInforce;

    public CaseClientInforceDetails() {
    }

	
    public CaseClientInforceDetails(char isDeletedInd, Date lstUpdtDtm) {
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseClientInforceDetails(CaseClientMap caseClientMap, Character hasOtherPoliciesInforceInd, Character replaceInd, Integer numberOfPoliciesInforce, Character adbInforceInd, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, String adbAmt, Character haveOtherLifeInd, BigDecimal amountInforce) {
       this.caseClientMap = caseClientMap;
       this.hasOtherPoliciesInforceInd = hasOtherPoliciesInforceInd;
       this.replaceInd = replaceInd;
       this.numberOfPoliciesInforce = numberOfPoliciesInforce;
       this.adbInforceInd = adbInforceInd;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
       this.adbAmt = adbAmt;
       this.haveOtherLifeInd = haveOtherLifeInd;
       this.amountInforce = amountInforce;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="case_client_inforce_details_id", unique=true, nullable=false)
    public Integer getCaseClientInforceDetailsId() {
        return this.caseClientInforceDetailsId;
    }
    
    public void setCaseClientInforceDetailsId(Integer caseClientInforceDetailsId) {
        this.caseClientInforceDetailsId = caseClientInforceDetailsId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_client_map_id")
    public CaseClientMap getCaseClientMap() {
        return this.caseClientMap;
    }
    
    public void setCaseClientMap(CaseClientMap caseClientMap) {
        this.caseClientMap = caseClientMap;
    }

    
    @Column(name="has_other_policies_inforce_ind", length=1)
    public Character getHasOtherPoliciesInforceInd() {
        return this.hasOtherPoliciesInforceInd;
    }
    
    public void setHasOtherPoliciesInforceInd(Character hasOtherPoliciesInforceInd) {
        this.hasOtherPoliciesInforceInd = hasOtherPoliciesInforceInd;
    }

    
    @Column(name="replace_ind", length=1)
    public Character getReplaceInd() {
        return this.replaceInd;
    }
    
    public void setReplaceInd(Character replaceInd) {
        this.replaceInd = replaceInd;
    }

    
    @Column(name="number_of_policies_inforce")
    public Integer getNumberOfPoliciesInforce() {
        return this.numberOfPoliciesInforce;
    }
    
    public void setNumberOfPoliciesInforce(Integer numberOfPoliciesInforce) {
        this.numberOfPoliciesInforce = numberOfPoliciesInforce;
    }

    
    @Column(name="adb_inforce_ind", length=1)
    public Character getAdbInforceInd() {
        return this.adbInforceInd;
    }
    
    public void setAdbInforceInd(Character adbInforceInd) {
        this.adbInforceInd = adbInforceInd;
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

    
    @Column(name="adb_amt", length=50)
    public String getAdbAmt() {
        return this.adbAmt;
    }
    
    public void setAdbAmt(String adbAmt) {
        this.adbAmt = adbAmt;
    }

    
    @Column(name="have_other_life_ind", length=1)
    public Character getHaveOtherLifeInd() {
        return this.haveOtherLifeInd;
    }
    
    public void setHaveOtherLifeInd(Character haveOtherLifeInd) {
        this.haveOtherLifeInd = haveOtherLifeInd;
    }

    
    @Column(name="amount_inforce", precision=15)
    public BigDecimal getAmountInforce() {
        return this.amountInforce;
    }
    
    public void setAmountInforce(BigDecimal amountInforce) {
        this.amountInforce = amountInforce;
    }




}

