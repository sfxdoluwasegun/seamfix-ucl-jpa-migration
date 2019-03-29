package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the shipping_continent database table.
 * 
 */
@Entity
@Table(name="shipping_continent")
@NamedQuery(name="ShippingContinent.findAll", query="SELECT s FROM ShippingContinent s")
public class ShippingContinent implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<Organization> organizations;
	private Set<RequestHistory> requestHistories;
	private Set<ShippingOption> shippingOptions;
	private Set<Country> countries = new HashSet<Country>(0);


	public ShippingContinent() {
	}
	
	public ShippingContinent(Long id, String name, Set<Organization> organizations,
			Set<RequestHistory> requestHistories, Set<ShippingOption> shippingOptions, Set<Country> countries) {
		super();
		this.id = id;
		this.name = name;
		this.organizations = organizations;
		this.requestHistories = requestHistories;
		this.shippingOptions = shippingOptions;
		this.countries = countries;
	}

	@Id
	@SequenceGenerator(name="SHIPPING_CONTINENT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHIPPING_CONTINENT_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Organization
	@OneToMany(mappedBy="shippingContinent")
	public Set<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(Set<Organization> organizations) {
		this.organizations = organizations;
	}

	public Organization addOrganization(Organization organization) {
		getOrganizations().add(organization);
		organization.setShippingContinent(this);

		return organization;
	}

	public Organization removeOrganization(Organization organization) {
		getOrganizations().remove(organization);
		organization.setShippingContinent(null);

		return organization;
	}


	//bi-directional many-to-one association to RequestHistory
	@OneToMany(mappedBy="shippingContinent")
	public Set<RequestHistory> getRequestHistories() {
		return this.requestHistories;
	}

	public void setRequestHistories(Set<RequestHistory> requestHistories) {
		this.requestHistories = requestHistories;
	}

	public RequestHistory addRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().add(requestHistory);
		requestHistory.setShippingContinent(this);

		return requestHistory;
	}

	public RequestHistory removeRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().remove(requestHistory);
		requestHistory.setShippingContinent(null);

		return requestHistory;
	}


	//bi-directional many-to-one association to ShippingOption
	@OneToMany(mappedBy="shippingContinent")
	public Set<ShippingOption> getShippingOptions() {
		return this.shippingOptions;
	}

	public void setShippingOptions(Set<ShippingOption> shippingOptions) {
		this.shippingOptions = shippingOptions;
	}

	public ShippingOption addShippingOption(ShippingOption shippingOption) {
		getShippingOptions().add(shippingOption);
		shippingOption.setShippingContinent(this);

		return shippingOption;
	}

	public ShippingOption removeShippingOption(ShippingOption shippingOption) {
		getShippingOptions().remove(shippingOption);
		shippingOption.setShippingContinent(null);

		return shippingOption;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "shippingContinent")
	public Set<Country> getCountries() {
		return countries;
	}



	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Country addCountry(Country country) {
		getCountries().add(country);
		country.setShippingContinent(this);

		return country;
	}

	public Country removeCountry(Country country) {
		getCountries().remove(country);
		country.setShippingContinent(null);

		return country;
	}
}