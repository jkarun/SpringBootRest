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
 * CaseClientAddressDetails generated by hbm2java
 */
@Entity
@Table(name="case_client_address_details"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class CaseClientAddressDetails  implements java.io.Serializable {


     private Integer caseClientAddressDetailsId;
     private CaseClientMap caseClientMap;
     private String streetAddress1;
     private String streetAddress2;
     private String city;
     private String stateCd;
     private String zipCode;
     private String countryCd;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;
     private String poBoxAddress;
     private String poBoxCity;
     private String poBoxStateCd;
     private String poBoxZipCode;
     private Set<Revocable> revocables = new HashSet<Revocable>(0);

    public CaseClientAddressDetails() {
    }

	
    public CaseClientAddressDetails(char isDeletedInd, Date lstUpdtDtm) {
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public CaseClientAddressDetails(CaseClientMap caseClientMap, String streetAddress1, String streetAddress2, String city, String stateCd, String zipCode, String countryCd, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm, String poBoxAddress, String poBoxCity, String poBoxStateCd, String poBoxZipCode, Set<Revocable> revocables) {
       this.caseClientMap = caseClientMap;
       this.streetAddress1 = streetAddress1;
       this.streetAddress2 = streetAddress2;
       this.city = city;
       this.stateCd = stateCd;
       this.zipCode = zipCode;
       this.countryCd = countryCd;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
       this.poBoxAddress = poBoxAddress;
       this.poBoxCity = poBoxCity;
       this.poBoxStateCd = poBoxStateCd;
       this.poBoxZipCode = poBoxZipCode;
       this.revocables = revocables;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="case_client_address_details_id", unique=true, nullable=false)
    public Integer getCaseClientAddressDetailsId() {
        return this.caseClientAddressDetailsId;
    }
    
    public void setCaseClientAddressDetailsId(Integer caseClientAddressDetailsId) {
        this.caseClientAddressDetailsId = caseClientAddressDetailsId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_client_map_id")
    public CaseClientMap getCaseClientMap() {
        return this.caseClientMap;
    }
    
    public void setCaseClientMap(CaseClientMap caseClientMap) {
        this.caseClientMap = caseClientMap;
    }

    
    @Column(name="street_address1", length=150)
    public String getStreetAddress1() {
        return this.streetAddress1;
    }
    
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    
    @Column(name="street_address2", length=150)
    public String getStreetAddress2() {
        return this.streetAddress2;
    }
    
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    
    @Column(name="city", length=50)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state_cd", length=2)
    public String getStateCd() {
        return this.stateCd;
    }
    
    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    
    @Column(name="zip_code", length=50)
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    
    @Column(name="country_cd", length=3)
    public String getCountryCd() {
        return this.countryCd;
    }
    
    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
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

    
    @Column(name="po_box_address", length=50)
    public String getPoBoxAddress() {
        return this.poBoxAddress;
    }
    
    public void setPoBoxAddress(String poBoxAddress) {
        this.poBoxAddress = poBoxAddress;
    }

    
    @Column(name="po_box_city", length=50)
    public String getPoBoxCity() {
        return this.poBoxCity;
    }
    
    public void setPoBoxCity(String poBoxCity) {
        this.poBoxCity = poBoxCity;
    }

    
    @Column(name="po_box_state_cd", length=2)
    public String getPoBoxStateCd() {
        return this.poBoxStateCd;
    }
    
    public void setPoBoxStateCd(String poBoxStateCd) {
        this.poBoxStateCd = poBoxStateCd;
    }

    
    @Column(name="po_box_zip_code", length=50)
    public String getPoBoxZipCode() {
        return this.poBoxZipCode;
    }
    
    public void setPoBoxZipCode(String poBoxZipCode) {
        this.poBoxZipCode = poBoxZipCode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="caseClientAddressDetails")
    public Set<Revocable> getRevocables() {
        return this.revocables;
    }
    
    public void setRevocables(Set<Revocable> revocables) {
        this.revocables = revocables;
    }




}


