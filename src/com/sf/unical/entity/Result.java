package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the result database table.
 * 
 */
@Entity
@Table(name="result")
@NamedQuery(name="Result.findAll", query="SELECT r FROM Result r")
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Double cgpa;
	private String degree;
	private String degreeClass;
	private String distinctions;
	private Double fgpa;
	private Double firstArchiveCgpa;
	private Double secondArchiveCgpa;
	private Double totalUnitsOfferred;
	private Double wgpa;
	private Set<Alumni> alumnis;

	public Result() {
	}


	@Id
	@SequenceGenerator(name="RESULT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESULT_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Double getCgpa() {
		return this.cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}


	@Column(nullable=false, length=1024)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}


	@Column(name="degree_class", length=1024)
	public String getDegreeClass() {
		return this.degreeClass;
	}

	public void setDegreeClass(String degreeClass) {
		this.degreeClass = degreeClass;
	}


	@Column(length=1024)
	public String getDistinctions() {
		return this.distinctions;
	}

	public void setDistinctions(String distinctions) {
		this.distinctions = distinctions;
	}


	public Double getFgpa() {
		return this.fgpa;
	}

	public void setFgpa(Double fgpa) {
		this.fgpa = fgpa;
	}


	@Column(name="first_archive_cgpa")
	public Double getFirstArchiveCgpa() {
		return this.firstArchiveCgpa;
	}

	public void setFirstArchiveCgpa(Double firstArchiveCgpa) {
		this.firstArchiveCgpa = firstArchiveCgpa;
	}


	@Column(name="second_archive_cgpa")
	public Double getSecondArchiveCgpa() {
		return this.secondArchiveCgpa;
	}

	public void setSecondArchiveCgpa(Double secondArchiveCgpa) {
		this.secondArchiveCgpa = secondArchiveCgpa;
	}


	@Column(name="total_units_offerred")
	public Double getTotalUnitsOfferred() {
		return this.totalUnitsOfferred;
	}

	public void setTotalUnitsOfferred(Double totalUnitsOfferred) {
		this.totalUnitsOfferred = totalUnitsOfferred;
	}


	public Double getWgpa() {
		return this.wgpa;
	}

	public void setWgpa(Double wgpa) {
		this.wgpa = wgpa;
	}


	//bi-directional many-to-one association to Alumni
	@OneToMany(mappedBy="result")
	public Set<Alumni> getAlumnis() {
		return this.alumnis;
	}

	public void setAlumnis(Set<Alumni> alumnis) {
		this.alumnis = alumnis;
	}

	public Alumni addAlumni(Alumni alumni) {
		getAlumnis().add(alumni);
		alumni.setResult(this);

		return alumni;
	}

	public Alumni removeAlumni(Alumni alumni) {
		getAlumnis().remove(alumni);
		alumni.setResult(null);

		return alumni;
	}

}