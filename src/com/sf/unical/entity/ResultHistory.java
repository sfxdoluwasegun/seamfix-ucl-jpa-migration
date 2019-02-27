package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the result_history database table.
 * 
 */
@Entity
@Table(name="result_history")
@NamedQuery(name="ResultHistory.findAll", query="SELECT r FROM ResultHistory r")
public class ResultHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String asession;
	private String code;
	private String contact;
	private String course;
	private String flag;
	private String grade;
	private String level;
	private String month;
	private String number;
	private double point;
	private Boolean probation;
	private String program;
	private String semesterMode;
	private String semesterType;
	private String studentType;
	private Boolean supplementary;
	private String unit;
	private Alumni alumni;

	public ResultHistory() {
	}


	@Id
	@SequenceGenerator(name="RESULT_HISTORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESULT_HISTORY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(length=1024)
	public String getAsession() {
		return this.asession;
	}

	public void setAsession(String asession) {
		this.asession = asession;
	}


	@Column(nullable=false, length=1024)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Column(length=1024)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


	@Column(nullable=false, length=1024)
	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


	@Column(length=1024)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}


	@Column(length=1024)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Column(length=1024)
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}


	@Column(length=1024)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}


	@Column(nullable=false, length=1024)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public double getPoint() {
		return this.point;
	}

	public void setPoint(double point) {
		this.point = point;
	}


	public Boolean getProbation() {
		return this.probation;
	}

	public void setProbation(Boolean probation) {
		this.probation = probation;
	}


	@Column(length=1024)
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}


	@Column(name="semester_mode", length=1024)
	public String getSemesterMode() {
		return this.semesterMode;
	}

	public void setSemesterMode(String semesterMode) {
		this.semesterMode = semesterMode;
	}


	@Column(name="semester_type", length=1024)
	public String getSemesterType() {
		return this.semesterType;
	}

	public void setSemesterType(String semesterType) {
		this.semesterType = semesterType;
	}


	@Column(name="student_type", nullable=false, length=1024)
	public String getStudentType() {
		return this.studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}


	@Column(nullable=false)
	public Boolean getSupplementary() {
		return this.supplementary;
	}

	public void setSupplementary(Boolean supplementary) {
		this.supplementary = supplementary;
	}


	@Column(nullable=false, length=1024)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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