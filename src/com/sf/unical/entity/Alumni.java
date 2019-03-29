package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the alumni database table.
 * 
 */
@Entity
@Table(name="alumni")
@NamedQuery(name="Alumni.findAll", query="SELECT a FROM Alumni a")
public class Alumni implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String admissionSession;
	private Boolean archive;
	private String campus;
	private String department;
	private Boolean digitized;
	private String dob;
	private String email;
	private String faculty;
	private String firstname;
	private String graduationDate;
	private String guardian;
	private String guardianAddress;
	private String lga;
	private String matricNo;
	private Boolean mbbs;
	private String middleName;
	private String nationality;
	private Long orbitaId;
	private Boolean pharmacy;
	private String pob;
	private String program;
	private String remarks;
	private String sex;
	private String state;
	private String studentType;
	private String surname;
	private Timestamp synchDate;
	private String tokenSecret;
	private String transfers;
	private String twitterToken;
	private String validator;
	private Boolean veterinary;
	private Doc doc;
	private Passport passport;
	private Result result;
	private Set<BasisOfAdmission> basisOfAdmissions;
	private Set<DiplomaCours> diplomaCourses;
	private Set<OLevel> OLevels;
	private Set<ProfessionalExam> professionalExams;
	private Set<RequestPassport> requestPassports;
	private Set<ResultHistory> resultHistories;
	private Set<SupportLog> supportLogs;
	private Set<VerificationHistory> verificationHistories;

	public Alumni() {
	}


	@Id
	@SequenceGenerator(name="ALUMNI_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ALUMNI_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(name="admission_session", length=1024)
	public String getAdmissionSession() {
		return this.admissionSession;
	}

	public void setAdmissionSession(String admissionSession) {
		this.admissionSession = admissionSession;
	}


	@Column(nullable=false)
	public Boolean getArchive() {
		return this.archive;
	}

	public void setArchive(Boolean archive) {
		this.archive = archive;
	}


	@Column(nullable=false, length=1024)
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}


	@Column(length=1024)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Column(nullable=false)
	public Boolean getDigitized() {
		return this.digitized;
	}

	public void setDigitized(Boolean digitized) {
		this.digitized = digitized;
	}


	@Column(length=1024)
	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	@Column(length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(length=1024)
	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	@Column(length=1024)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	@Column(name="graduation_date", length=1024)
	public String getGraduationDate() {
		return this.graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}


	@Column(length=1024)
	public String getGuardian() {
		return this.guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}


	@Column(name="guardian_address", length=1024)
	public String getGuardianAddress() {
		return this.guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}


	@Column(length=1024)
	public String getLga() {
		return this.lga;
	}

	public void setLga(String lga) {
		this.lga = lga;
	}


	@Column(name="matric_no", nullable=false, length=1024)
	public String getMatricNo() {
		return this.matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}


	@Column(nullable=false)
	public Boolean getMbbs() {
		return this.mbbs;
	}

	public void setMbbs(Boolean mbbs) {
		this.mbbs = mbbs;
	}


	@Column(name="middle_name", length=1024)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Column(length=1024)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	@Column(name="orbita_id", nullable=false)
	public Long getOrbitaId() {
		return this.orbitaId;
	}

	public void setOrbitaId(Long orbitaId) {
		this.orbitaId = orbitaId;
	}


	@Column(nullable=false)
	public Boolean getPharmacy() {
		return this.pharmacy;
	}

	public void setPharmacy(Boolean pharmacy) {
		this.pharmacy = pharmacy;
	}


	@Column(length=1024)
	public String getPob() {
		return this.pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}


	@Column(length=1024)
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}


	@Column(length=1024)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Column(length=1024)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	@Column(length=1024)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	@Column(name="student_type", length=1024)
	public String getStudentType() {
		return this.studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}


	@Column(length=1024)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Column(name="synch_date")
	public Timestamp getSynchDate() {
		return this.synchDate;
	}

	public void setSynchDate(Timestamp synchDate) {
		this.synchDate = synchDate;
	}


	@Column(name="token_secret", length=1024)
	public String getTokenSecret() {
		return this.tokenSecret;
	}

	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}


	@Column(length=1024)
	public String getTransfers() {
		return this.transfers;
	}

	public void setTransfers(String transfers) {
		this.transfers = transfers;
	}


	@Column(name="twitter_token", length=1024)
	public String getTwitterToken() {
		return this.twitterToken;
	}

	public void setTwitterToken(String twitterToken) {
		this.twitterToken = twitterToken;
	}


	@Column(length=1024)
	public String getValidator() {
		return this.validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}


	@Column(nullable=false)
	public Boolean getVeterinary() {
		return this.veterinary;
	}

	public void setVeterinary(Boolean veterinary) {
		this.veterinary = veterinary;
	}


	//bi-directional many-to-one association to Doc
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="docs_fk")
	public Doc getDoc() {
		return this.doc;
	}

	public void setDoc(Doc doc) {
		this.doc = doc;
	}


	//bi-directional many-to-one association to Passport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="passport_fk")
	public Passport getPassport() {
		return this.passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	//bi-directional many-to-one association to Result
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="result_fk")
	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}


	//bi-directional many-to-one association to BasisOfAdmission
	@OneToMany(mappedBy="alumni")
	public Set<BasisOfAdmission> getBasisOfAdmissions() {
		return this.basisOfAdmissions;
	}

	public void setBasisOfAdmissions(Set<BasisOfAdmission> basisOfAdmissions) {
		this.basisOfAdmissions = basisOfAdmissions;
	}

	public BasisOfAdmission addBasisOfAdmission(BasisOfAdmission basisOfAdmission) {
		getBasisOfAdmissions().add(basisOfAdmission);
		basisOfAdmission.setAlumni(this);

		return basisOfAdmission;
	}

	public BasisOfAdmission removeBasisOfAdmission(BasisOfAdmission basisOfAdmission) {
		getBasisOfAdmissions().remove(basisOfAdmission);
		basisOfAdmission.setAlumni(null);

		return basisOfAdmission;
	}


	//bi-directional many-to-one association to DiplomaCours
	@OneToMany(mappedBy="alumni")
	public Set<DiplomaCours> getDiplomaCourses() {
		return this.diplomaCourses;
	}

	public void setDiplomaCourses(Set<DiplomaCours> diplomaCourses) {
		this.diplomaCourses = diplomaCourses;
	}

	public DiplomaCours addDiplomaCours(DiplomaCours diplomaCours) {
		getDiplomaCourses().add(diplomaCours);
		diplomaCours.setAlumni(this);

		return diplomaCours;
	}

	public DiplomaCours removeDiplomaCours(DiplomaCours diplomaCours) {
		getDiplomaCourses().remove(diplomaCours);
		diplomaCours.setAlumni(null);

		return diplomaCours;
	}


	//bi-directional many-to-one association to OLevel
	@OneToMany(mappedBy="alumni")
	public Set<OLevel> getOLevels() {
		return this.OLevels;
	}

	public void setOLevels(Set<OLevel> OLevels) {
		this.OLevels = OLevels;
	}

	public OLevel addOLevel(OLevel OLevel) {
		getOLevels().add(OLevel);
		OLevel.setAlumni(this);

		return OLevel;
	}

	public OLevel removeOLevel(OLevel OLevel) {
		getOLevels().remove(OLevel);
		OLevel.setAlumni(null);

		return OLevel;
	}


	//bi-directional many-to-one association to ProfessionalExam
	@OneToMany(mappedBy="alumni")
	public Set<ProfessionalExam> getProfessionalExams() {
		return this.professionalExams;
	}

	public void setProfessionalExams(Set<ProfessionalExam> professionalExams) {
		this.professionalExams = professionalExams;
	}

	public ProfessionalExam addProfessionalExam(ProfessionalExam professionalExam) {
		getProfessionalExams().add(professionalExam);
		professionalExam.setAlumni(this);

		return professionalExam;
	}

	public ProfessionalExam removeProfessionalExam(ProfessionalExam professionalExam) {
		getProfessionalExams().remove(professionalExam);
		professionalExam.setAlumni(null);

		return professionalExam;
	}


	//bi-directional many-to-one association to RequestPassport
	@OneToMany(mappedBy="alumni")
	public Set<RequestPassport> getRequestPassports() {
		return this.requestPassports;
	}

	public void setRequestPassports(Set<RequestPassport> requestPassports) {
		this.requestPassports = requestPassports;
	}

	public RequestPassport addRequestPassport(RequestPassport requestPassport) {
		getRequestPassports().add(requestPassport);
		requestPassport.setAlumni(this);

		return requestPassport;
	}

	public RequestPassport removeRequestPassport(RequestPassport requestPassport) {
		getRequestPassports().remove(requestPassport);
		requestPassport.setAlumni(null);

		return requestPassport;
	}


	//bi-directional many-to-one association to ResultHistory
	@OneToMany(mappedBy="alumni")
	public Set<ResultHistory> getResultHistories() {
		return this.resultHistories;
	}

	public void setResultHistories(Set<ResultHistory> resultHistories) {
		this.resultHistories = resultHistories;
	}

	public ResultHistory addResultHistory(ResultHistory resultHistory) {
		getResultHistories().add(resultHistory);
		resultHistory.setAlumni(this);

		return resultHistory;
	}

	public ResultHistory removeResultHistory(ResultHistory resultHistory) {
		getResultHistories().remove(resultHistory);
		resultHistory.setAlumni(null);

		return resultHistory;
	}


	//bi-directional many-to-one association to SupportLog
	@OneToMany(mappedBy="alumni")
	public Set<SupportLog> getSupportLogs() {
		return this.supportLogs;
	}

	public void setSupportLogs(Set<SupportLog> supportLogs) {
		this.supportLogs = supportLogs;
	}

	public SupportLog addSupportLog(SupportLog supportLog) {
		getSupportLogs().add(supportLog);
		supportLog.setAlumni(this);

		return supportLog;
	}

	public SupportLog removeSupportLog(SupportLog supportLog) {
		getSupportLogs().remove(supportLog);
		supportLog.setAlumni(null);

		return supportLog;
	}


	//bi-directional many-to-one association to VerificationHistory
	@OneToMany(mappedBy="alumni")
	public Set<VerificationHistory> getVerificationHistories() {
		return this.verificationHistories;
	}

	public void setVerificationHistories(Set<VerificationHistory> verificationHistories) {
		this.verificationHistories = verificationHistories;
	}

	public VerificationHistory addVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().add(verificationHistory);
		verificationHistory.setAlumni(this);

		return verificationHistory;
	}

	public VerificationHistory removeVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().remove(verificationHistory);
		verificationHistory.setAlumni(null);

		return verificationHistory;
	}

}