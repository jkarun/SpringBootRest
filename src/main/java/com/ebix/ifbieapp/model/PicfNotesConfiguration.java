package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ebix.ifbieapp.util.CustomJacksonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * PicfNotesConfiguration generated by hbm2java
 */
@Entity
@Table(name = "picf_notes_configuration")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicfNotesConfiguration implements java.io.Serializable {

	private BigDecimal id;
	private String pageName;
	private String description;
	private byte showCategory;
	private String category;
	private byte showSubCategory;
	private String subCategory;
	private byte showAccessTypes;
	private String accessTypes;
	private String defaultAccessType;
	private String noteLabel;
	private Integer noteWidth;
	private byte showAttachments;
	private byte showGridEditButton;
	private byte showSubCategoryFilter;
	private BigDecimal lastUpdatedUser;
	private Date lastUpdatedDate;
	private Byte isDeleted;

	public PicfNotesConfiguration() {
	}

	public PicfNotesConfiguration(String pageName, byte showCategory, byte showSubCategory, byte showAccessTypes,
			String noteLabel, byte showAttachments, byte showGridEditButton, byte showSubCategoryFilter) {
		this.pageName = pageName;
		this.showCategory = showCategory;
		this.showSubCategory = showSubCategory;
		this.showAccessTypes = showAccessTypes;
		this.noteLabel = noteLabel;
		this.showAttachments = showAttachments;
		this.showGridEditButton = showGridEditButton;
		this.showSubCategoryFilter = showSubCategoryFilter;
	}

	public PicfNotesConfiguration(String pageName, String description, byte showCategory, String category,
			byte showSubCategory, String subCategory, byte showAccessTypes, String accessTypes,
			String defaultAccessType, String noteLabel, Integer noteWidth, byte showAttachments,
			byte showGridEditButton, byte showSubCategoryFilter, BigDecimal lastUpdatedUser, Date lastUpdatedDate,
			Byte isDeleted) {
		this.pageName = pageName;
		this.description = description;
		this.showCategory = showCategory;
		this.category = category;
		this.showSubCategory = showSubCategory;
		this.subCategory = subCategory;
		this.showAccessTypes = showAccessTypes;
		this.accessTypes = accessTypes;
		this.defaultAccessType = defaultAccessType;
		this.noteLabel = noteLabel;
		this.noteWidth = noteWidth;
		this.showAttachments = showAttachments;
		this.showGridEditButton = showGridEditButton;
		this.showSubCategoryFilter = showSubCategoryFilter;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastUpdatedDate = lastUpdatedDate;
		this.isDeleted = isDeleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "page_name", nullable = false, length = 50)
	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Column(name = "description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "show_category", nullable = false)
	public byte getShowCategory() {
		return this.showCategory;
	}

	public void setShowCategory(byte showCategory) {
		this.showCategory = showCategory;
	}

	@Column(name = "category", length = 50)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "show_sub_category", nullable = false)
	public byte getShowSubCategory() {
		return this.showSubCategory;
	}

	public void setShowSubCategory(byte showSubCategory) {
		this.showSubCategory = showSubCategory;
	}

	@Column(name = "sub_category", length = 50)
	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Column(name = "show_access_types", nullable = false)
	public byte getShowAccessTypes() {
		return this.showAccessTypes;
	}

	public void setShowAccessTypes(byte showAccessTypes) {
		this.showAccessTypes = showAccessTypes;
	}

	@Column(name = "access_types", length = 50)
	public String getAccessTypes() {
		return this.accessTypes;
	}

	public void setAccessTypes(String accessTypes) {
		this.accessTypes = accessTypes;
	}

	@Column(name = "default_access_type", length = 50)
	public String getDefaultAccessType() {
		return this.defaultAccessType;
	}

	public void setDefaultAccessType(String defaultAccessType) {
		this.defaultAccessType = defaultAccessType;
	}

	@Column(name = "note_label", nullable = false, length = 50)
	public String getNoteLabel() {
		return this.noteLabel;
	}

	public void setNoteLabel(String noteLabel) {
		this.noteLabel = noteLabel;
	}

	@Column(name = "note_width")
	public Integer getNoteWidth() {
		return this.noteWidth;
	}

	public void setNoteWidth(Integer noteWidth) {
		this.noteWidth = noteWidth;
	}

	@Column(name = "show_attachments", nullable = false)
	public byte getShowAttachments() {
		return this.showAttachments;
	}

	public void setShowAttachments(byte showAttachments) {
		this.showAttachments = showAttachments;
	}

	@Column(name = "show_grid_edit_button", nullable = false)
	public byte getShowGridEditButton() {
		return this.showGridEditButton;
	}

	public void setShowGridEditButton(byte showGridEditButton) {
		this.showGridEditButton = showGridEditButton;
	}

	@Column(name = "show_sub_category_filter", nullable = false)
	public byte getShowSubCategoryFilter() {
		return this.showSubCategoryFilter;
	}

	public void setShowSubCategoryFilter(byte showSubCategoryFilter) {
		this.showSubCategoryFilter = showSubCategoryFilter;
	}

	@Column(name = "last_updated_user", scale = 0)
	public BigDecimal getLastUpdatedUser() {
		return this.lastUpdatedUser;
	}

	public void setLastUpdatedUser(BigDecimal lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	@JsonSerialize(using = CustomJacksonDateSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_date", length = 23)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

}
