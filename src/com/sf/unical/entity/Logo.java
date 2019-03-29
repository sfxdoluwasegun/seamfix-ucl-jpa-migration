package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the logo database table.
 * 
 */
@Entity
@Table(name="logo")
@NamedQuery(name="Logo.findAll", query="SELECT l FROM Logo l")
public class Logo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private byte[] image;
	private Set<Institution> institutions;

	public Logo() {
	}


	@Id
	@SequenceGenerator(name="LOGO_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOGO_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	//bi-directional many-to-one association to Institution
	@OneToMany(mappedBy="logo")
	public Set<Institution> getInstitutions() {
		return this.institutions;
	}

	public void setInstitutions(Set<Institution> institutions) {
		this.institutions = institutions;
	}

	public Institution addInstitution(Institution institution) {
		getInstitutions().add(institution);
		institution.setLogo(this);

		return institution;
	}

	public Institution removeInstitution(Institution institution) {
		getInstitutions().remove(institution);
		institution.setLogo(null);

		return institution;
	}

}