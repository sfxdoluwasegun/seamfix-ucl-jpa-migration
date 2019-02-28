package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the verification_batch database table.
 * 
 */
@Entity
@Table(name="verification_batch")
@NamedQuery(name="VerificationBatch.findAll", query="SELECT v FROM VerificationBatch v")
public class VerificationBatch implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private double amount;
	private String approvalCode;
	private Timestamp date;
	private String mode;
	private String referenceNo;
	private String respcode;
	private String sessionId;
	private String status;
	private String switchresp;
	private String xmlresp;
	private Set<SettlementTrail> settlementTrails;
	private Set<VerificationHistory> verificationHistories;

	public VerificationBatch() {
	}


	@Id
	@SequenceGenerator(name="VERIFICATION_BATCH_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VERIFICATION_BATCH_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Column(name="approval_code", length=1024)
	public String getApprovalCode() {
		return this.approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(nullable=false, length=1024)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}


	@Column(name="reference_no", nullable=false, length=1024)
	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}


	@Column(length=1024)
	public String getRespcode() {
		return this.respcode;
	}

	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}


	@Column(name="session_id", length=1024)
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	@Column(nullable=false, length=1024)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(length=1024)
	public String getSwitchresp() {
		return this.switchresp;
	}

	public void setSwitchresp(String switchresp) {
		this.switchresp = switchresp;
	}


	@Column(length=1024)
	public String getXmlresp() {
		return this.xmlresp;
	}

	public void setXmlresp(String xmlresp) {
		this.xmlresp = xmlresp;
	}


	//bi-directional many-to-one association to SettlementTrail
	@OneToMany(mappedBy="verificationBatch")
	public Set<SettlementTrail> getSettlementTrails() {
		return this.settlementTrails;
	}

	public void setSettlementTrails(Set<SettlementTrail> settlementTrails) {
		this.settlementTrails = settlementTrails;
	}

	public SettlementTrail addSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().add(settlementTrail);
		settlementTrail.setVerificationBatch(this);

		return settlementTrail;
	}

	public SettlementTrail removeSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().remove(settlementTrail);
		settlementTrail.setVerificationBatch(null);

		return settlementTrail;
	}


	//bi-directional many-to-one association to VerificationHistory
	@OneToMany(mappedBy="verificationBatch")
	public Set<VerificationHistory> getVerificationHistories() {
		return this.verificationHistories;
	}

	public void setVerificationHistories(Set<VerificationHistory> verificationHistories) {
		this.verificationHistories = verificationHistories;
	}

	public VerificationHistory addVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().add(verificationHistory);
		verificationHistory.setVerificationBatch(this);

		return verificationHistory;
	}

	public VerificationHistory removeVerificationHistory(VerificationHistory verificationHistory) {
		getVerificationHistories().remove(verificationHistory);
		verificationHistory.setVerificationBatch(null);

		return verificationHistory;
	}

}