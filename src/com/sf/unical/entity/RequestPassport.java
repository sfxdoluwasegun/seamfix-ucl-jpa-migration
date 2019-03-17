package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the request_passport database table.
 * 
 */
@Entity
@Table(name="request_passport")
@NamedQuery(name="RequestPassport.findAll", query="SELECT r FROM RequestPassport r")
public class RequestPassport implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String course;
	private Boolean deactivated;
	private String department;
	private String email;
	private String firstname;
	private String maidenName;
	private String maritalStatus;
	private String matricNo;
	private String middleName;
	private String month;
	private String permanentAddress;
	private String phone;
	private String surname;
	private String type;
	private Boolean uploaded;
	private Boolean verified;
	private String year;
	private Set<PayHistory> payHistories;
	private Set<RequestChange> requestChanges;
	private Set<RequestHistory> requestHistories;
	private Alumni alumni;
	private Boolean clearanceStatus;

	public RequestPassport() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_PASSPORT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_PASSPORT_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(length=1024)
	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


	@Column(nullable=false)
	public Boolean getDeactivated() {
		return this.deactivated;
	}

	public void setDeactivated(Boolean deactivated) {
		this.deactivated = deactivated;
	}


	@Column(nullable=false, length=1024)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Column(nullable=false, length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(nullable=false, length=1024)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	@Column(name="maiden_name", length=1024)
	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}


	@Column(name="marital_status", nullable=false, length=1024)
	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}


	@Column(name="matric_no", nullable=false, length=1024)
	public String getMatricNo() {
		return this.matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}


	@Column(name="middle_name", length=1024)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Column(length=1024)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}


	@Column(name="permanent_address", nullable=false, length=1024)
	public String getPermanentAddress() {
		return this.permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	@Column(length=1024)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(nullable=false, length=1024)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Column(length=1024)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Column(nullable=false)
	public Boolean getUploaded() {
		return this.uploaded;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}


	@Column(nullable=false)
	public Boolean getVerified() {
		return this.verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}


	@Column(nullable=false, length=1024)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}


	//bi-directional many-to-one association to PayHistory
	@OneToMany(mappedBy="requestPassport")
	public Set<PayHistory> getPayHistories() {
		return this.payHistories;
	}

	public void setPayHistories(Set<PayHistory> payHistories) {
		this.payHistories = payHistories;
	}

	public PayHistory addPayHistory(PayHistory payHistory) {
		getPayHistories().add(payHistory);
		payHistory.setRequestPassport(this);

		return payHistory;
	}

	public PayHistory removePayHistory(PayHistory payHistory) {
		getPayHistories().remove(payHistory);
		payHistory.setRequestPassport(null);

		return payHistory;
	}


	//bi-directional many-to-one association to RequestChange
	@OneToMany(mappedBy="requestPassport")
	public Set<RequestChange> getRequestChanges() {
		return this.requestChanges;
	}

	public void setRequestChanges(Set<RequestChange> requestChanges) {
		this.requestChanges = requestChanges;
	}

	public RequestChange addRequestChange(RequestChange requestChange) {
		getRequestChanges().add(requestChange);
		requestChange.setRequestPassport(this);

		return requestChange;
	}

	public RequestChange removeRequestChange(RequestChange requestChange) {
		getRequestChanges().remove(requestChange);
		requestChange.setRequestPassport(null);

		return requestChange;
	}


	//bi-directional many-to-one association to RequestHistory
	@OneToMany(mappedBy="requestPassport")
	public Set<RequestHistory> getRequestHistories() {
		return this.requestHistories;
	}

	public void setRequestHistories(Set<RequestHistory> requestHistories) {
		this.requestHistories = requestHistories;
	}

	public RequestHistory addRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().add(requestHistory);
		requestHistory.setRequestPassport(this);

		return requestHistory;
	}

	public RequestHistory removeRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().remove(requestHistory);
		requestHistory.setRequestPassport(null);

		return requestHistory;
	}


	//bi-directional many-to-one association to Alumni
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="alumni_fk")
	public Alumni getAlumni() {
		return this.alumni;
	}

	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

	@Column()
	public Boolean getClearanceStatus() {
		return clearanceStatus;
	}


	public void setClearanceStatus(Boolean clearanceStatus) {
		this.clearanceStatus = clearanceStatus;
	}

}