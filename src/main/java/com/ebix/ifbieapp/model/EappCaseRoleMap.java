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
 * EappCaseRoleMap generated by hbm2java
 */
@Entity
@Table(name="eapp_case_role_map"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class EappCaseRoleMap  implements java.io.Serializable {


     private int mapId;
     private Integer eappCaseRoleId;
     private Integer companyId;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public EappCaseRoleMap() {
    }

	
    public EappCaseRoleMap(int mapId, char isDeletedInd, Date lstUpdtDtm) {
        this.mapId = mapId;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public EappCaseRoleMap(int mapId, Integer eappCaseRoleId, Integer companyId, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.mapId = mapId;
       this.eappCaseRoleId = eappCaseRoleId;
       this.companyId = companyId;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id 

    
    @Column(name="map_id", unique=true, nullable=false)
    public int getMapId() {
        return this.mapId;
    }
    
    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    
    @Column(name="eapp_case_role_id")
    public Integer getEappCaseRoleId() {
        return this.eappCaseRoleId;
    }
    
    public void setEappCaseRoleId(Integer eappCaseRoleId) {
        this.eappCaseRoleId = eappCaseRoleId;
    }

    
    @Column(name="company_id")
    public Integer getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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


