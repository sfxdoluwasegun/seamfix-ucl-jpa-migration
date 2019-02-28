package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the pay_history database table.
 * 
 */
@Entity
@Table(name="pay_history")
@NamedQuery(name="PayHistory.findAll", query="SELECT p FROM PayHistory p")
public class PayHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private double amount;
	private String approvalCode;
	private Timestamp date;
	private String description;
	private String mode;
	private String name;
	private String referenceNo;
	private String responseCode;
	private String sessionId;
	private String status;
	private String switchResponse;
	private String xmlResponse;
	private FeeBreakdown feeBreakdown;
	private RequestBatch requestBatch;
	private RequestPassport requestPassport;
	private Set<SettlementTrail> settlementTrails;

	public PayHistory() {
	}


	@Id
	@SequenceGenerator(name="PAY_HISTORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAY_HISTORY_ID_GENERATOR")
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
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false, length=1024)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="reference_no", nullable=false, length=1024)
	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
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
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="switch_response", length=1024)
	public String getSwitchResponse() {
		return this.switchResponse;
	}

	public void setSwitchResponse(String switchResponse) {
		this.switchResponse = switchResponse;
	}


	@Column(name="xml_response", length=1024)
	public String getXmlResponse() {
		return this.xmlResponse;
	}

	public void setXmlResponse(String xmlResponse) {
		this.xmlResponse = xmlResponse;
	}


	//bi-directional many-to-one association to FeeBreakdown
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fee_breakdown_fk", nullable=false)
	public FeeBreakdown getFeeBreakdown() {
		return this.feeBreakdown;
	}

	public void setFeeBreakdown(FeeBreakdown feeBreakdown) {
		this.feeBreakdown = feeBreakdown;
	}


	//bi-directional many-to-one association to RequestBatch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_batch_fk", nullable=false)
	public RequestBatch getRequestBatch() {
		return this.requestBatch;
	}

	public void setRequestBatch(RequestBatch requestBatch) {
		this.requestBatch = requestBatch;
	}


	//bi-directional many-to-one association to RequestPassport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_passport_fk", nullable=false)
	public RequestPassport getRequestPassport() {
		return this.requestPassport;
	}

	public void setRequestPassport(RequestPassport requestPassport) {
		this.requestPassport = requestPassport;
	}


	//bi-directional many-to-one association to SettlementTrail
	@OneToMany(mappedBy="payHistory")
	public Set<SettlementTrail> getSettlementTrails() {
		return this.settlementTrails;
	}

	public void setSettlementTrails(Set<SettlementTrail> settlementTrails) {
		this.settlementTrails = settlementTrails;
	}

	public SettlementTrail addSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().add(settlementTrail);
		settlementTrail.setPayHistory(this);

		return settlementTrail;
	}

	public SettlementTrail removeSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().remove(settlementTrail);
		settlementTrail.setPayHistory(null);

		return settlementTrail;
	}

}