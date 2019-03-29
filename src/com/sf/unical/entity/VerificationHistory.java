package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the verification_history database table.
 * 
 */
@Entity
@Table(name="verification_history")
@NamedQuery(name="VerificationHistory.findAll", query="SELECT v FROM VerificationHistory v")
public class VerificationHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String approvalCode;
	private String comment;
	private Timestamp date;
	private String department;
	private String firstname;
	private String maidenName;
	private String matricNo;
	private String middleName;
	private String mode;
	private String passcode;
	private String certificateRegNo;
	private Timestamp payDate;
	private String phone;
	private String referenceNo;
	private boolean referred;
	private String responseCode;
	private String sessionId;
	private String surname;
	private String switchResponse;
	private String uniqueId;
	private String xmlResponse;
	private String zip;
	private Set<Attachment> attachments;
	private Set<SettlementTrail> settlementTrails;
	private Alumni alumni;
	private Organization organization;
	private VerificationBatch verificationBatch;
	private Set<VerificationTag> verificationTags;
	private String verificationRequestMode;

	public VerificationHistory() {
	}


	@Id
	@SequenceGenerator(name="VERIFICATION_HISTORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VERIFICATION_HISTORY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(name="approval_code", length=1024)
	public String getApprovalCode() {
		return this.approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}


	@Column(length=2147483647)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(nullable=false, length=1024)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}


	@Column(nullable=false, length=1024)
	public String getPasscode() {
		return this.passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}


	@Column(name="pay_date")
	public Timestamp getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}


	@Column(length=1024)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(name="reference_no", length=1024)
	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}


	@Column(nullable=false)
	public boolean getReferred() {
		return this.referred;
	}

	public void setReferred(boolean referred) {
		this.referred = referred;
	}


	@Column(name="response_code", length=1024)
	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}


	@Column(name="session_id", length=1024)
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	@Column(nullable=false, length=1024)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Column(name="switch_response", length=1024)
	public String getSwitchResponse() {
		return this.switchResponse;
	}

	public void setSwitchResponse(String switchResponse) {
		this.switchResponse = switchResponse;
	}


	@Column(name="unique_id", length=1024)
	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}


	@Column(name="xml_response", length=1024)
	public String getXmlResponse() {
		return this.xmlResponse;
	}

	public void setXmlResponse(String xmlResponse) {
		this.xmlResponse = xmlResponse;
	}


	@Column(length=1024)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	//bi-directional many-to-one association to Attachment
	@OneToMany(mappedBy="verificationHistory", cascade=CascadeType.ALL)
	public Set<Attachment> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(Set<Attachment> attachments) {
		this.attachments = attachments;
	}

	public void addAttachment(Attachment attachment) {
		
		if (this.attachments == null)
			this.attachments = new HashSet<>();
		
		attachment.setVerificationHistory(this);
		this.attachments.add(attachment);
	}

	public Attachment removeAttachment(Attachment attachment) {
		getAttachments().remove(attachment);
		attachment.setVerificationHistory(null);

		return attachment;
	}


	//bi-directional many-to-one association to SettlementTrail
	@OneToMany(mappedBy="verificationHistory")
	public Set<SettlementTrail> getSettlementTrails() {
		return this.settlementTrails;
	}

	public void setSettlementTrails(Set<SettlementTrail> settlementTrails) {
		this.settlementTrails = settlementTrails;
	}

	public SettlementTrail addSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().add(settlementTrail);
		settlementTrail.setVerificationHistory(this);

		return settlementTrail;
	}

	public SettlementTrail removeSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().remove(settlementTrail);
		settlementTrail.setVerificationHistory(null);

		return settlementTrail;
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


	//bi-directional many-to-one association to Organization
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="organization_fk", nullable=false)
	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}


	//bi-directional many-to-one association to VerificationBatch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="verification_batch_fk")
	public VerificationBatch getVerificationBatch() {
		return this.verificationBatch;
	}

	public void setVerificationBatch(VerificationBatch verificationBatch) {
		this.verificationBatch = verificationBatch;
	}


	//bi-directional many-to-one association to VerificationTag
	@OneToMany(mappedBy="verificationHistory")
	public Set<VerificationTag> getVerificationTags() {
		return this.verificationTags;
	}

	public void setVerificationTags(Set<VerificationTag> verificationTags) {
		this.verificationTags = verificationTags;
	}

	public VerificationTag addVerificationTag(VerificationTag verificationTag) {
		getVerificationTags().add(verificationTag);
		verificationTag.setVerificationHistory(this);

		return verificationTag;
	}

	public VerificationTag removeVerificationTag(VerificationTag verificationTag) {
		getVerificationTags().remove(verificationTag);
		verificationTag.setVerificationHistory(null);

		return verificationTag;
	}

	@Column(name = "certificate_id", length = 1024)
	public String getCertificateRegNo() {
		return certificateRegNo;
	}


	public void setCertificateRegNo(String certificateRegNo) {
		this.certificateRegNo = certificateRegNo;
	}

	@Column(name="verification_request_mode")
	public String getVerificationRequestMode() {
		return verificationRequestMode;
	}


	public void setVerificationRequestMode(String verificationRequestMode) {
		this.verificationRequestMode = verificationRequestMode;
	}

}