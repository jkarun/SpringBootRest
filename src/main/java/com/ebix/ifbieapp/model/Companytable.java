package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Companytable generated by hbm2java
 */
@Entity
@Table(name = "companytable")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Companytable implements java.io.Serializable {

	private int compId;
	private String compName;
	private String location;
	private Set<Combtwo> combtwos = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_1 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_2 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_3 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_4 = new HashSet<Combtwo>(0);

	public Companytable() {
	}

	public Companytable(int compId, String compName) {
		this.compId = compId;
		this.compName = compName;
	}

	public Companytable(int compId, String compName, String location, Set<Combtwo> combtwos, Set<Combtwo> combtwos_1,
			Set<Combtwo> combtwos_2, Set<Combtwo> combtwos_3, Set<Combtwo> combtwos_4) {
		this.compId = compId;
		this.compName = compName;
		this.location = location;
		this.combtwos = combtwos;
		this.combtwos_1 = combtwos_1;
		this.combtwos_2 = combtwos_2;
		this.combtwos_3 = combtwos_3;
		this.combtwos_4 = combtwos_4;
	}

	@Id

	@Column(name = "comp_id", unique = true, nullable = false)
	public int getCompId() {
		return this.compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	@Column(name = "comp_name", nullable = false, length = 50)
	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Column(name = "location", length = 100)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companytable")
	public Set<Combtwo> getCombtwos() {
		return this.combtwos;
	}

	public void setCombtwos(Set<Combtwo> combtwos) {
		this.combtwos = combtwos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companytable")
	public Set<Combtwo> getCombtwos_1() {
		return this.combtwos_1;
	}

	public void setCombtwos_1(Set<Combtwo> combtwos_1) {
		this.combtwos_1 = combtwos_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companytable")
	public Set<Combtwo> getCombtwos_2() {
		return this.combtwos_2;
	}

	public void setCombtwos_2(Set<Combtwo> combtwos_2) {
		this.combtwos_2 = combtwos_2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companytable")
	public Set<Combtwo> getCombtwos_3() {
		return this.combtwos_3;
	}

	public void setCombtwos_3(Set<Combtwo> combtwos_3) {
		this.combtwos_3 = combtwos_3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companytable")
	public Set<Combtwo> getCombtwos_4() {
		return this.combtwos_4;
	}

	public void setCombtwos_4(Set<Combtwo> combtwos_4) {
		this.combtwos_4 = combtwos_4;
	}

}
