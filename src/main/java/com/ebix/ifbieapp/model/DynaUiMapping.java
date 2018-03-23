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
import javax.persistence.UniqueConstraint;

/**
 * DynaUiMapping generated by hbm2java
 */
@Entity
@Table(name="dyna_ui_mapping"
    ,schema="dbo"
    ,catalog="life_eapp"
    , uniqueConstraints = @UniqueConstraint(columnNames={"screen_id", "ui_element_id", "product_combination_id"}) 
)
public class DynaUiMapping  implements java.io.Serializable {


     private Integer id;
     private DynaUiElements dynaUiElements;
     private DynaUiScreen dynaUiScreen;
     private ProductCombination productCombination;
     private char visibleInd;
     private char mandatoryInd;
     private char editableInd;
     private String defaultValueTxt;
     private char isDeletedInd;
     private String lstUpdtUserId;
     private Date lstUpdtDtm;

    public DynaUiMapping() {
    }

	
    public DynaUiMapping(DynaUiElements dynaUiElements, DynaUiScreen dynaUiScreen, ProductCombination productCombination, char visibleInd, char mandatoryInd, char editableInd, char isDeletedInd, Date lstUpdtDtm) {
        this.dynaUiElements = dynaUiElements;
        this.dynaUiScreen = dynaUiScreen;
        this.productCombination = productCombination;
        this.visibleInd = visibleInd;
        this.mandatoryInd = mandatoryInd;
        this.editableInd = editableInd;
        this.isDeletedInd = isDeletedInd;
        this.lstUpdtDtm = lstUpdtDtm;
    }
    public DynaUiMapping(DynaUiElements dynaUiElements, DynaUiScreen dynaUiScreen, ProductCombination productCombination, char visibleInd, char mandatoryInd, char editableInd, String defaultValueTxt, char isDeletedInd, String lstUpdtUserId, Date lstUpdtDtm) {
       this.dynaUiElements = dynaUiElements;
       this.dynaUiScreen = dynaUiScreen;
       this.productCombination = productCombination;
       this.visibleInd = visibleInd;
       this.mandatoryInd = mandatoryInd;
       this.editableInd = editableInd;
       this.defaultValueTxt = defaultValueTxt;
       this.isDeletedInd = isDeletedInd;
       this.lstUpdtUserId = lstUpdtUserId;
       this.lstUpdtDtm = lstUpdtDtm;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ui_element_id", nullable=false)
    public DynaUiElements getDynaUiElements() {
        return this.dynaUiElements;
    }
    
    public void setDynaUiElements(DynaUiElements dynaUiElements) {
        this.dynaUiElements = dynaUiElements;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="screen_id", nullable=false)
    public DynaUiScreen getDynaUiScreen() {
        return this.dynaUiScreen;
    }
    
    public void setDynaUiScreen(DynaUiScreen dynaUiScreen) {
        this.dynaUiScreen = dynaUiScreen;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_combination_id", nullable=false)
    public ProductCombination getProductCombination() {
        return this.productCombination;
    }
    
    public void setProductCombination(ProductCombination productCombination) {
        this.productCombination = productCombination;
    }

    
    @Column(name="visible_ind", nullable=false, length=1)
    public char getVisibleInd() {
        return this.visibleInd;
    }
    
    public void setVisibleInd(char visibleInd) {
        this.visibleInd = visibleInd;
    }

    
    @Column(name="mandatory_ind", nullable=false, length=1)
    public char getMandatoryInd() {
        return this.mandatoryInd;
    }
    
    public void setMandatoryInd(char mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
    }

    
    @Column(name="editable_ind", nullable=false, length=1)
    public char getEditableInd() {
        return this.editableInd;
    }
    
    public void setEditableInd(char editableInd) {
        this.editableInd = editableInd;
    }

    
    @Column(name="default_value_txt", length=50)
    public String getDefaultValueTxt() {
        return this.defaultValueTxt;
    }
    
    public void setDefaultValueTxt(String defaultValueTxt) {
        this.defaultValueTxt = defaultValueTxt;
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

