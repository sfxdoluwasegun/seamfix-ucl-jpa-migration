package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the donation_history database table.
 * 
 */
@Entity
@Table(name="donation_history")
@NamedQuery(name="DonationHistory.findAll", query="SELECT d FROM DonationHistory d")
public class DonationHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String address;
	private double amount;
	private Timestamp date;
	private String email;
	private String mode;
	private String name;
	private String referenceNo;
	private String status;
	private DonationItem donationItem;
	private Set<SettlementTrail> settlementTrails;

	public DonationHistory() {
	}


	@Id
	@SequenceGenerator(name="DONATION_HISTORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONATION_HISTORY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(length=1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(nullable=false)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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


	@Column(nullable=false, length=1024)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	//bi-directional many-to-one association to DonationItem
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="donation_item_fk", nullable=false)
	public DonationItem getDonationItem() {
		return this.donationItem;
	}

	public void setDonationItem(DonationItem donationItem) {
		this.donationItem = donationItem;
	}


	//bi-directional many-to-one association to SettlementTrail
	@OneToMany(mappedBy="donationHistory")
	public Set<SettlementTrail> getSettlementTrails() {
		return this.settlementTrails;
	}

	public void setSettlementTrails(Set<SettlementTrail> settlementTrails) {
		this.settlementTrails = settlementTrails;
	}

	public SettlementTrail addSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().add(settlementTrail);
		settlementTrail.setDonationHistory(this);

		return settlementTrail;
	}

	public SettlementTrail removeSettlementTrail(SettlementTrail settlementTrail) {
		getSettlementTrails().remove(settlementTrail);
		settlementTrail.setDonationHistory(null);

		return settlementTrail;
	}

}