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
 * Usertable generated by hbm2java
 */
@Entity
@Table(name = "usertable")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usertable implements java.io.Serializable {

	private int id;
	private String fistName;
	private String lastName;
	private String city;
	private Set<Combtwo> combtwos = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_1 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_2 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_3 = new HashSet<Combtwo>(0);
	private Set<Combtwo> combtwos_4 = new HashSet<Combtwo>(0);

	public Usertable() {
	}

	public Usertable(int id, String fistName) {
		this.id = id;
		this.fistName = fistName;
	}

	public Usertable(int id, String fistName, String lastName, String city, Set<Combtwo> combtwos,
			Set<Combtwo> combtwos_1, Set<Combtwo> combtwos_2, Set<Combtwo> combtwos_3, Set<Combtwo> combtwos_4) {
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.city = city;
		this.combtwos = combtwos;
		this.combtwos_1 = combtwos_1;
		this.combtwos_2 = combtwos_2;
		this.combtwos_3 = combtwos_3;
		this.combtwos_4 = combtwos_4;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "fist_name", nullable = false, length = 50)
	public String getFistName() {
		return this.fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	@Column(name = "last_name", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "city", length = 100)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertable")
	public Set<Combtwo> getCombtwos() {
		return this.combtwos;
	}

	public void setCombtwos(Set<Combtwo> combtwos) {
		this.combtwos = combtwos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertable")
	public Set<Combtwo> getCombtwos_1() {
		return this.combtwos_1;
	}

	public void setCombtwos_1(Set<Combtwo> combtwos_1) {
		this.combtwos_1 = combtwos_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertable")
	public Set<Combtwo> getCombtwos_2() {
		return this.combtwos_2;
	}

	public void setCombtwos_2(Set<Combtwo> combtwos_2) {
		this.combtwos_2 = combtwos_2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertable")
	public Set<Combtwo> getCombtwos_3() {
		return this.combtwos_3;
	}

	public void setCombtwos_3(Set<Combtwo> combtwos_3) {
		this.combtwos_3 = combtwos_3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertable")
	public Set<Combtwo> getCombtwos_4() {
		return this.combtwos_4;
	}

	public void setCombtwos_4(Set<Combtwo> combtwos_4) {
		this.combtwos_4 = combtwos_4;
	}

}
