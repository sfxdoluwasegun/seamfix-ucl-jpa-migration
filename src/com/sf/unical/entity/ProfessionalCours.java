package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professional_courses database table.
 * 
 */
@Entity
@Table(name="professional_courses")
@NamedQuery(name="ProfessionalCours.findAll", query="SELECT p FROM ProfessionalCours p")
public class ProfessionalCours implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String evaluation;
	private String grade;
	private String name;
	private double score;
	private String unit;
	private ProfessionalExam professionalExam;

	public ProfessionalCours() {
	}


	@Id
	@SequenceGenerator(name="PROFESSIONAL_COURSES_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROFESSIONAL_COURSES_ID_GENERATOR")
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


	@Column(length=1024)
	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}


	@Column(length=1024)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		this.score = score;
	}


	@Column(nullable=false, length=1024)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	//bi-directional many-to-one association to ProfessionalExam
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="professional_exams_fk", nullable=false)
	public ProfessionalExam getProfessionalExam() {
		return this.professionalExam;
	}

	public void setProfessionalExam(ProfessionalExam professionalExam) {
		this.professionalExam = professionalExam;
	}

}