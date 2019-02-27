package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the professional_exams database table.
 * 
 */
@Entity
@Table(name="professional_exams")
@NamedQuery(name="ProfessionalExam.findAll", query="SELECT p FROM ProfessionalExam p")
public class ProfessionalExam implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String asession;
	private Boolean disqualified;
	private String evaluation;
	private String grade;
	private String month;
	private String name;
	private Boolean resit;
	private String score;
	private Set<ProfessionalCours> professionalCourses;
	private Alumni alumni;

	public ProfessionalExam() {
	}


	@Id
	@SequenceGenerator(name="PROFESSIONAL_EXAMS_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROFESSIONAL_EXAMS_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getAsession() {
		return this.asession;
	}

	public void setAsession(String asession) {
		this.asession = asession;
	}


	@Column(nullable=false)
	public Boolean getDisqualified() {
		return this.disqualified;
	}

	public void setDisqualified(Boolean disqualified) {
		this.disqualified = disqualified;
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


	@Column(length=1024)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(nullable=false)
	public Boolean getResit() {
		return this.resit;
	}

	public void setResit(Boolean resit) {
		this.resit = resit;
	}


	@Column(length=1024)
	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}


	//bi-directional many-to-one association to ProfessionalCours
	@OneToMany(mappedBy="professionalExam")
	public Set<ProfessionalCours> getProfessionalCourses() {
		return this.professionalCourses;
	}

	public void setProfessionalCourses(Set<ProfessionalCours> professionalCourses) {
		this.professionalCourses = professionalCourses;
	}

	public ProfessionalCours addProfessionalCours(ProfessionalCours professionalCours) {
		getProfessionalCourses().add(professionalCours);
		professionalCours.setProfessionalExam(this);

		return professionalCours;
	}

	public ProfessionalCours removeProfessionalCours(ProfessionalCours professionalCours) {
		getProfessionalCourses().remove(professionalCours);
		professionalCours.setProfessionalExam(null);

		return professionalCours;
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