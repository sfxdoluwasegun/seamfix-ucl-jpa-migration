package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the diploma_courses database table.
 * 
 */
@Entity
@Table(name="diploma_courses")
@NamedQuery(name="DiplomaCours.findAll", query="SELECT d FROM DiplomaCours d")
public class DiplomaCours implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String grade;
	private String name;
	private Long year;
	private Alumni alumni;

	public DiplomaCours() {
	}


	@Id
	@SequenceGenerator(name="DIPLOMA_COURSES_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIPLOMA_COURSES_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
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


	public Long getYear() {
		return this.year;
	}

	public void setYear(Long year) {
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