package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the settlement_trail database table.
 * 
 */
@Entity
@Table(name="settlement_trail")
@NamedQuery(name="SettlementTrail.findAll", query="SELECT s FROM SettlementTrail s")
public class SettlementTrail implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String accountNo;
	private double amount;
	private String bank;
	private String creditor;
	private DonationHistory donationHistory;
	private PayHistory payHistory;
	private VerificationBatch verificationBatch;
	private VerificationHistory verificationHistory;

	public SettlementTrail() {
	}


	@Id
	@SequenceGenerator(name="SETTLEMENT_TRAIL_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SETTLEMENT_TRAIL_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(name="account_no", nullable=false, length=1024)
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	@Column(nullable=false)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Column(nullable=false, length=1024)
	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}


	@Column(nullable=false, length=1024)
	public String getCreditor() {
		return this.creditor;
	}

	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}


	//bi-directional many-to-one association to DonationHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="donation_history_fk")
	public DonationHistory getDonationHistory() {
		return this.donationHistory;
	}

	public void setDonationHistory(DonationHistory donationHistory) {
		this.donationHistory = donationHistory;
	}


	//bi-directional many-to-one association to PayHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pay_history_fk")
	public PayHistory getPayHistory() {
		return this.payHistory;
	}

	public void setPayHistory(PayHistory payHistory) {
		this.payHistory = payHistory;
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


	//bi-directional many-to-one association to VerificationHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="verification_history_fk")
	public VerificationHistory getVerificationHistory() {
		return this.verificationHistory;
	}

	public void setVerificationHistory(VerificationHistory verificationHistory) {
		this.verificationHistory = verificationHistory;
	}

}