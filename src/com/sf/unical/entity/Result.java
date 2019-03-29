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
	private double cgpa;
	private String degree;
	private String degreeClass;
	private String distinctions;
	private double fgpa;
	private double firstArchiveCgpa;
	private double secondArchiveCgpa;
	private double totalUnitsOfferred;
	private double wgpa;
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


	public double getCgpa() {
		return this.cgpa;
	}

	public void setCgpa(double cgpa) {
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


	public double getFgpa() {
		return this.fgpa;
	}

	public void setFgpa(double fgpa) {
		this.fgpa = fgpa;
	}


	@Column(name="first_archive_cgpa")
	public double getFirstArchiveCgpa() {
		return this.firstArchiveCgpa;
	}

	public void setFirstArchiveCgpa(double firstArchiveCgpa) {
		this.firstArchiveCgpa = firstArchiveCgpa;
	}


	@Column(name="second_archive_cgpa")
	public double getSecondArchiveCgpa() {
		return this.secondArchiveCgpa;
	}

	public void setSecondArchiveCgpa(double secondArchiveCgpa) {
		this.secondArchiveCgpa = secondArchiveCgpa;
	}


	@Column(name="total_units_offerred")
	public double getTotalUnitsOfferred() {
		return this.totalUnitsOfferred;
	}

	public void setTotalUnitsOfferred(double totalUnitsOfferred) {
		this.totalUnitsOfferred = totalUnitsOfferred;
	}


	public double getWgpa() {
		return this.wgpa;
	}

	public void setWgpa(double wgpa) {
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