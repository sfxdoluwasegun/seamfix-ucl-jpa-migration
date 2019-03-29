package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the verification_tag database table.
 * 
 */
@Entity
@Table(name="verification_tag")
@NamedQuery(name="VerificationTag.findAll", query="SELECT v FROM VerificationTag v")
public class VerificationTag implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private boolean authentic;
	private String comment;
	private boolean completed;
	private Timestamp date;
	private String degree;
	private String department;
	private Timestamp dispatched;
	private String fullname;
	private String graduation;
	private boolean posted;
	private String sex;
	private String type;
	private Set<SignedDocument> signedDocuments;
	private Admin admin;
	private VerificationHistory verificationHistory;

	public VerificationTag() {
	}


	@Id
	@SequenceGenerator(name="VERIFICATION_TAG_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VERIFICATION_TAG_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public boolean getAuthentic() {
		return this.authentic;
	}

	public void setAuthentic(boolean authentic) {
		this.authentic = authentic;
	}


	@Column(length=1024)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	@Column(nullable=false)
	public boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(length=1024)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}


	@Column(length=1024)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public Timestamp getDispatched() {
		return this.dispatched;
	}

	public void setDispatched(Timestamp dispatched) {
		this.dispatched = dispatched;
	}


	@Column(length=1024)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	@Column(length=1024)
	public String getGraduation() {
		return this.graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}


	@Column(nullable=false)
	public boolean getPosted() {
		return this.posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
	}


	@Column(length=1024)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	@Column(length=1024)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	//bi-directional many-to-one association to SignedDocument
	@OneToMany(mappedBy="verificationTag")
	public Set<SignedDocument> getSignedDocuments() {
		return this.signedDocuments;
	}

	public void setSignedDocuments(Set<SignedDocument> signedDocuments) {
		this.signedDocuments = signedDocuments;
	}

	public SignedDocument addSignedDocument(SignedDocument signedDocument) {
		getSignedDocuments().add(signedDocument);
		signedDocument.setVerificationTag(this);

		return signedDocument;
	}

	public SignedDocument removeSignedDocument(SignedDocument signedDocument) {
		getSignedDocuments().remove(signedDocument);
		signedDocument.setVerificationTag(null);

		return signedDocument;
	}


	//bi-directional many-to-one association to Admin
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_fk", nullable=false)
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	//bi-directional many-to-one association to VerificationHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="verification_history_fk", nullable=false)
	public VerificationHistory getVerificationHistory() {
		return this.verificationHistory;
	}

	public void setVerificationHistory(VerificationHistory verificationHistory) {
		this.verificationHistory = verificationHistory;
	}

}