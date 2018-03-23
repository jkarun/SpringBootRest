package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PicfWorkspace generated by hbm2java
 */
@Entity
@Table(name="picf_workspace"
    ,schema="dbo"
    ,catalog="life_eapp"
)
public class PicfWorkspace  implements java.io.Serializable {


     private BigDecimal id;
     private String workspaceId;
     private String landingPageId;
     private String landingPageGridId;
     private BigDecimal defaultQueryId;

    public PicfWorkspace() {
    }

    public PicfWorkspace(String workspaceId, String landingPageId, String landingPageGridId, BigDecimal defaultQueryId) {
       this.workspaceId = workspaceId;
       this.landingPageId = landingPageId;
       this.landingPageGridId = landingPageGridId;
       this.defaultQueryId = defaultQueryId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="workspaceId", length=45)
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    
    @Column(name="landing_page_id", length=45)
    public String getLandingPageId() {
        return this.landingPageId;
    }
    
    public void setLandingPageId(String landingPageId) {
        this.landingPageId = landingPageId;
    }

    
    @Column(name="landing_page_grid_id", length=45)
    public String getLandingPageGridId() {
        return this.landingPageGridId;
    }
    
    public void setLandingPageGridId(String landingPageGridId) {
        this.landingPageGridId = landingPageGridId;
    }

    
    @Column(name="default_query_id", scale=0)
    public BigDecimal getDefaultQueryId() {
        return this.defaultQueryId;
    }
    
    public void setDefaultQueryId(BigDecimal defaultQueryId) {
        this.defaultQueryId = defaultQueryId;
    }




}


