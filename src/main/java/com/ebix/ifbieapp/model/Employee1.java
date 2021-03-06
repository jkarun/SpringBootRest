package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Employee1 generated by hbm2java
 */
@Entity
@Table(name = "Employee1")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee1 implements java.io.Serializable {

	private Employee1Id id;

	public Employee1() {
	}

	public Employee1(Employee1Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empId", column = @Column(name = "empId")),
			@AttributeOverride(name = "empName", column = @Column(name = "empName", length = 50)),
			@AttributeOverride(name = "empDate", column = @Column(name = "empDate")) })
	public Employee1Id getId() {
		return this.id;
	}

	public void setId(Employee1Id id) {
		this.id = id;
	}

}
