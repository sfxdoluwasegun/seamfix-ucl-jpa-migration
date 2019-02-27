package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the donation_picture database table.
 * 
 */
@Entity
@Table(name="donation_picture")
@NamedQuery(name="DonationPicture.findAll", query="SELECT d FROM DonationPicture d")
public class DonationPicture implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private byte[] image;
	private Set<DonationItem> donationItems;

	public DonationPicture() {
	}


	@Id
	@SequenceGenerator(name="DONATION_PICTURE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONATION_PICTURE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	//bi-directional many-to-one association to DonationItem
	@OneToMany(mappedBy="donationPicture")
	public Set<DonationItem> getDonationItems() {
		return this.donationItems;
	}

	public void setDonationItems(Set<DonationItem> donationItems) {
		this.donationItems = donationItems;
	}

	public DonationItem addDonationItem(DonationItem donationItem) {
		getDonationItems().add(donationItem);
		donationItem.setDonationPicture(this);

		return donationItem;
	}

	public DonationItem removeDonationItem(DonationItem donationItem) {
		getDonationItems().remove(donationItem);
		donationItem.setDonationPicture(null);

		return donationItem;
	}

}