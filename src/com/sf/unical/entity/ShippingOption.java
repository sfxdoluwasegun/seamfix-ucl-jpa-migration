package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shipping_options database table.
 * 
 */
@Entity
@Table(name="shipping_options")
@NamedQuery(name="ShippingOption.findAll", query="SELECT s FROM ShippingOption s")
public class ShippingOption implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private double amount;
	private String duration;
	private Boolean local;
	private Set<FeeBreakdown> feeBreakdowns;
	private ShippingContinent shippingContinent;
	private ShippingMode shippingMode;

	public ShippingOption() {
	}


	@Id
	@SequenceGenerator(name="SHIPPING_OPTIONS_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHIPPING_OPTIONS_ID_GENERATOR")
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


	@Column(nullable=false, length=1024)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}


	@Column(nullable=false)
	public Boolean getLocal() {
		return this.local;
	}

	public void setLocal(Boolean local) {
		this.local = local;
	}


	//bi-directional many-to-one association to FeeBreakdown
	@OneToMany(mappedBy="shippingOption")
	public Set<FeeBreakdown> getFeeBreakdowns() {
		return this.feeBreakdowns;
	}

	public void setFeeBreakdowns(Set<FeeBreakdown> feeBreakdowns) {
		this.feeBreakdowns = feeBreakdowns;
	}

	public FeeBreakdown addFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().add(feeBreakdown);
		feeBreakdown.setShippingOption(this);

		return feeBreakdown;
	}

	public FeeBreakdown removeFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().remove(feeBreakdown);
		feeBreakdown.setShippingOption(null);

		return feeBreakdown;
	}


	//bi-directional many-to-one association to ShippingContinent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_continent_fk", nullable=false)
	public ShippingContinent getShippingContinent() {
		return this.shippingContinent;
	}

	public void setShippingContinent(ShippingContinent shippingContinent) {
		this.shippingContinent = shippingContinent;
	}


	//bi-directional many-to-one association to ShippingMode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_mode_fk")
	public ShippingMode getShippingMode() {
		return this.shippingMode;
	}

	public void setShippingMode(ShippingMode shippingMode) {
		this.shippingMode = shippingMode;
	}

}