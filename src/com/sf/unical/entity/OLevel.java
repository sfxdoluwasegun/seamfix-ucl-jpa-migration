package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the o_levels database table.
 * 
 */
@Entity
@Table(name="o_levels")
@NamedQuery(name="OLevel.findAll", query="SELECT o FROM OLevel o")
public class OLevel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String exam;
	private String grade;
	private String subject;
	private String year;
	private Alumni alumni;

	public OLevel() {
	}


	@Id
	@SequenceGenerator(name="O_LEVELS_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="O_LEVELS_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getExam() {
		return this.exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}


	@Column(nullable=false, length=1024)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Column(nullable=false, length=1024)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Column(length=1024)
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