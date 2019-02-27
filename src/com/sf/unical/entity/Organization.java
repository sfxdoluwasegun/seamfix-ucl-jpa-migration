package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
@Table(name="organization")
@NamedQuery(name="Organization.findAll", query="SELECT o FROM Organization o")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String address;
	private String city;
	private String designation;
	private String email;
	private String name;
	private String officer;
	private String phone;
	private String zip;
	private Country country;
	private ShippingContinent shippingContinent;
	private Set<VerificationHistory> verificationHistories;

	public Organization() {
	}


	@Id
	@SequenceGenerator(name="ORGANIZATION_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORGANIZATION_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(nullable=false, length=1024)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Column(nullable=false, length=1024)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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


	@Column(nullable=false, length=1024)
	public String getOfficer() {
		return this.officer;
	}

	public void setOfficer(String officer) {
		this.officer = officer;
	}


	@Column(length=1024)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(length=1024)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	//bi-directional many-to-one association to Country
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_fk", nullable=false)
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	//bi-directional many-to-one association to ShippingContinent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_continent_fk", nullable=false)
	public ShippingContinent getShippingContinent() {
		return this.shippingContinent;
	}

	public void setShippingContinent(ShippingContinent shippingContinent) {
		this.shippingContinent = shippingContinent;
	}


	//bi-directional many-to-one association to VerificationHistory
	@OneToMany(mappedBy="organization")
	public Set<VerificationHistory> getVerificationHistories() {
		return this.verificationHistories;
	}

	public void setVerificationHistories(Set<VerificationHistory> verificationHistories) {
		this.verificationHistories = verificationHistories;
	}

	public VerificationHistory addVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().add(verificationHistory);
		verificationHistory.setOrganization(this);

		return verificationHistory;
	}

	public VerificationHistory removeVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().remove(verificationHistory);
		verificationHistory.setOrganization(null);

		return verificationHistory;
	}

}