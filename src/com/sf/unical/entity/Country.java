package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@Table(name="country")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String name;
	private Set<Organization> organizations;
	private ShippingContinent shippingContinent;

	public Country() {
	}

	public Country(Long id, String code, String name, Set<Organization> organizations,
			ShippingContinent shippingContinent) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.organizations = organizations;
		this.setShippingContinent(shippingContinent);
	}



	@Id
	@SequenceGenerator(name="COUNTRY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COUNTRY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Organization
	@OneToMany(mappedBy="country")
	public Set<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(Set<Organization> organizations) {
		this.organizations = organizations;
	}

	public Organization addOrganization(Organization organization) {
		getOrganizations().add(organization);
		organization.setCountry(this);

		return organization;
	}

	public Organization removeOrganization(Organization organization) {
		getOrganizations().remove(organization);
		organization.setCountry(null);

		return organization;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shippingcontinent")
	public ShippingContinent getShippingContinent() {
		return shippingContinent;
	}

	public void setShippingContinent(ShippingContinent shippingContinent) {
		this.shippingContinent = shippingContinent;
	}

}