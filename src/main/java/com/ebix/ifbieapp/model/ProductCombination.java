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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ProductCombination generated by hbm2java
 */
@Entity
@Table(name="product_combination"
    ,schema="dbo"
    ,catalog="life_eapp"
    , uniqueConstraints = @UniqueConstraint(columnNames={"appln_case_type_cd", "state_cd", "company_id", "prod_typ_cd", "case_typ_cd", "prod_id", "plan_id", "case_role_cd"}) 
)
public class ProductCombination  implements java.io.Serializable {


     private Integer id;
     private String applnCaseTypeCd;
     private String stateCd;
     private Integer companyId;
     private String prodTypCd;
     private String caseTypCd;
     private Integer prodId;
     private Integer planId;
     private String caseRoleCd;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;
     private Set<DynaUiMapping> dynaUiMappings = new HashSet<DynaUiMapping>(0);

    public ProductCombination() {
    }

	
    public ProductCombination(char isDeletedInd, Date lstUpdtDtm) {
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public ProductCombination(String applnCaseTypeCd, String stateCd, Integer companyId, String prodTypCd, String caseTypCd, Integer prodId, Integer planId, String caseRoleCd, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, Set<DynaUiMapping> dynaUiMappings) {
       this.applnCaseTypeCd = applnCaseTypeCd;
       this.stateCd = stateCd;
       this.companyId = companyId;
       this.prodTypCd = prodTypCd;
       this.caseTypCd = caseTypCd;
       this.prodId = prodId;
       this.planId = planId;
       this.caseRoleCd = caseRoleCd;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
       this.dynaUiMappings = dynaUiMappings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="appln_case_type_cd", length=20)
    public String getApplnCaseTypeCd() {
        return this.applnCaseTypeCd;
    }
    
    public void setApplnCaseTypeCd(String applnCaseTypeCd) {
        this.applnCaseTypeCd = applnCaseTypeCd;
    }

    
    @Column(name="state_cd", length=2)
    public String getStateCd() {
        return this.stateCd;
    }
    
    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    
    @Column(name="company_id")
    public Integer getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="prod_typ_cd", length=8)
    public String getProdTypCd() {
        return this.prodTypCd;
    }
    
    public void setProdTypCd(String prodTypCd) {
        this.prodTypCd = prodTypCd;
    }

    
    @Column(name="case_typ_cd", length=10)
    public String getCaseTypCd() {
        return this.caseTypCd;
    }
    
    public void setCaseTypCd(String caseTypCd) {
        this.caseTypCd = caseTypCd;
    }

    
    @Column(name="prod_id")
    public Integer getProdId() {
        return this.prodId;
    }
    
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    
    @Column(name="plan_id")
    public Integer getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    
    @Column(name="case_role_cd", length=8)
    public String getCaseRoleCd() {
        return this.caseRoleCd;
    }
    
    public void setCaseRoleCd(String caseRoleCd) {
        this.caseRoleCd = caseRoleCd;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="productCombination")
    public Set<DynaUiMapping> getDynaUiMappings() {
        return this.dynaUiMappings;
    }
    
    public void setDynaUiMappings(Set<DynaUiMapping> dynaUiMappings) {
        this.dynaUiMappings = dynaUiMappings;
    }




}


