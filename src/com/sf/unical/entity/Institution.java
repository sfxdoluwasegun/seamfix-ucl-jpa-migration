package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the institution database table.
 * 
 */
@Entity
@Table(name="institution")
@NamedQuery(name="Institution.findAll", query="SELECT i FROM Institution i")
public class Institution implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String address;
	private String code;
	private String email;
	private String name;
	private String phone;
	private String website;
	private Logo logo;

	public Institution() {
	}


	@Id
	@SequenceGenerator(name="INSTITUTION_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSTITUTION_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(length=1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(nullable=false, length=1024)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Column(nullable=false, length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(length=1024)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(length=1024)
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}


	//bi-directional many-to-one association to Logo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="logo_fk")
	public Logo getLogo() {
		return this.logo;
	}

	public void setLogo(Logo logo) {
		this.logo = logo;
	}

}