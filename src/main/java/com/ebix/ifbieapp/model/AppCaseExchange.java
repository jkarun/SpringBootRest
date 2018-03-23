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
 * AppCaseExchange generated by hbm2java
 */
@Entity
@Table(name="app_case_exchange"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class AppCaseExchange  implements java.io.Serializable {


     private Integer appCaseExchangeId;
     private AppCase appCase;
     private String partExchange;
     private String exchangePolicyNumber;
     private String existingAmount;
     private String riderType;
     private Character partialExchangeInd;
     private Character balanceInforceInd;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public AppCaseExchange() {
    }

	
    public AppCaseExchange(AppCase appCase, char isDeletedInd, Date lstUpdtDtm) {
        this.appCase = appCase;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public AppCaseExchange(AppCase appCase, String partExchange, String exchangePolicyNumber, String existingAmount, String riderType, Character partialExchangeInd, Character balanceInforceInd, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.appCase = appCase;
       this.partExchange = partExchange;
       this.exchangePolicyNumber = exchangePolicyNumber;
       this.existingAmount = existingAmount;
       this.riderType = riderType;
       this.partialExchangeInd = partialExchangeInd;
       this.balanceInforceInd = balanceInforceInd;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="app_case_exchange_id", unique=true, nullable=false)
    public Integer getAppCaseExchangeId() {
        return this.appCaseExchangeId;
    }
    
    public void setAppCaseExchangeId(Integer appCaseExchangeId) {
        this.appCaseExchangeId = appCaseExchangeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_id", nullable=false)
    public AppCase getAppCase() {
        return this.appCase;
    }
    
    public void setAppCase(AppCase appCase) {
        this.appCase = appCase;
    }

    
    @Column(name="part_exchange", length=10)
    public String getPartExchange() {
        return this.partExchange;
    }
    
    public void setPartExchange(String partExchange) {
        this.partExchange = partExchange;
    }

    
    @Column(name="exchange_policy_number", length=100)
    public String getExchangePolicyNumber() {
        return this.exchangePolicyNumber;
    }
    
    public void setExchangePolicyNumber(String exchangePolicyNumber) {
        this.exchangePolicyNumber = exchangePolicyNumber;
    }

    
    @Column(name="existing_amount", length=100)
    public String getExistingAmount() {
        return this.existingAmount;
    }
    
    public void setExistingAmount(String existingAmount) {
        this.existingAmount = existingAmount;
    }

    
    @Column(name="rider_type", length=20)
    public String getRiderType() {
        return this.riderType;
    }
    
    public void setRiderType(String riderType) {
        this.riderType = riderType;
    }

    
    @Column(name="partial_exchange_ind", length=1)
    public Character getPartialExchangeInd() {
        return this.partialExchangeInd;
    }
    
    public void setPartialExchangeInd(Character partialExchangeInd) {
        this.partialExchangeInd = partialExchangeInd;
    }

    
    @Column(name="balance_inforce_ind", length=1)
    public Character getBalanceInforceInd() {
        return this.balanceInforceInd;
    }
    
    public void setBalanceInforceInd(Character balanceInforceInd) {
        this.balanceInforceInd = balanceInforceInd;
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


