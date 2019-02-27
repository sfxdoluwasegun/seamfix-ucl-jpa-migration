package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the donation_item database table.
 * 
 */
@Entity
@Table(name="donation_item")
@NamedQuery(name="DonationItem.findAll", query="SELECT d FROM DonationItem d")
public class DonationItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private double amount;
	private Timestamp created;
	private Boolean deactivated;
	private Boolean defaultItem;
	private String description;
	private Boolean expired;
	private Date expriy;
	private String name;
	private Integer priority;
	private Set<DonationHistory> donationHistories;
	private DonationPicture donationPicture;

	public DonationItem() {
	}


	@Id
	@SequenceGenerator(name="DONATION_ITEM_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONATION_ITEM_ID_GENERATOR")
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


	@Column(nullable=false)
	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	@Column(nullable=false)
	public Boolean getDeactivated() {
		return this.deactivated;
	}

	public void setDeactivated(Boolean deactivated) {
		this.deactivated = deactivated;
	}


	@Column(name="default_item", nullable=false)
	public Boolean getDefaultItem() {
		return this.defaultItem;
	}

	public void setDefaultItem(Boolean defaultItem) {
		this.defaultItem = defaultItem;
	}


	@Column(length=1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false)
	public Boolean getExpired() {
		return this.expired;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}


	@Temporal(TemporalType.DATE)
	public Date getExpriy() {
		return this.expriy;
	}

	public void setExpriy(Date expriy) {
		this.expriy = expriy;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(nullable=false)
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}


	//bi-directional many-to-one association to DonationHistory
	@OneToMany(mappedBy="donationItem")
	public Set<DonationHistory> getDonationHistories() {
		return this.donationHistories;
	}

	public void setDonationHistories(Set<DonationHistory> donationHistories) {
		this.donationHistories = donationHistories;
	}

	public DonationHistory addDonationHistory(DonationHistory donationHistory) {
		getDonationHistories().add(donationHistory);
		donationHistory.setDonationItem(this);

		return donationHistory;
	}

	public DonationHistory removeDonationHistory(DonationHistory donationHistory) {
		getDonationHistories().remove(donationHistory);
		donationHistory.setDonationItem(null);

		return donationHistory;
	}


	//bi-directional many-to-one association to DonationPicture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="donation_picture_fk")
	public DonationPicture getDonationPicture() {
		return this.donationPicture;
	}

	public void setDonationPicture(DonationPicture donationPicture) {
		this.donationPicture = donationPicture;
	}

}