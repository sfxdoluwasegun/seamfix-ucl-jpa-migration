package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the passport database table.
 * 
 */
@Entity
@Table(name="passport")
@NamedQuery(name="Passport.findAll", query="SELECT p FROM Passport p")
public class Passport implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private byte[] image;
	private Set<Alumni> alumnis;

	public Passport() {
	}


	@Id
	@SequenceGenerator(name="PASSPORT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PASSPORT_ID_GENERATOR")
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


	//bi-directional many-to-one association to Alumni
	@OneToMany(mappedBy="passport")
	public Set<Alumni> getAlumnis() {
		return this.alumnis;
	}

	public void setAlumnis(Set<Alumni> alumnis) {
		this.alumnis = alumnis;
	}

	public Alumni addAlumni(Alumni alumni) {
		getAlumnis().add(alumni);
		alumni.setPassport(this);

		return alumni;
	}

	public Alumni removeAlumni(Alumni alumni) {
		getAlumnis().remove(alumni);
		alumni.setPassport(null);

		return alumni;
	}

}