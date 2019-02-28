package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the basis_of_admission database table.
 * 
 */
@Entity
@Table(name="basis_of_admission")
@NamedQuery(name="BasisOfAdmission.findAll", query="SELECT b FROM BasisOfAdmission b")
public class BasisOfAdmission implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String institution;
	private String qualification;
	private String year;
	private Alumni alumni;

	public BasisOfAdmission() {
	}


	@Id
	@SequenceGenerator(name="BASIS_OF_ADMISSION_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BASIS_OF_ADMISSION_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}


	@Column(nullable=false, length=1024)
	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	@Column(nullable=false, length=1024)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}


	//bi-directional many-to-one association to Alumni
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="alumni_fk", nullable=false)
	public Alumni getAlumni() {
		return this.alumni;
	}

	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

}