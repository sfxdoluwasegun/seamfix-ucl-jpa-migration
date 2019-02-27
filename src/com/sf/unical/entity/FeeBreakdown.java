package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the fee_breakdown database table.
 * 
 */
@Entity
@Table(name="fee_breakdown")
@NamedQuery(name="FeeBreakdown.findAll", query="SELECT f FROM FeeBreakdown f")
public class FeeBreakdown implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private double amount;
	private FeeCategory feeCategory;
	private FeeItem feeItem;
	private ShippingOption shippingOption;
	private Set<PayHistory> payHistories;

	public FeeBreakdown() {
	}


	@Id
	@SequenceGenerator(name="FEE_BREAKDOWN_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FEE_BREAKDOWN_ID_GENERATOR")
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


	//bi-directional many-to-one association to FeeCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fee_category_fk", nullable=false)
	public FeeCategory getFeeCategory() {
		return this.feeCategory;
	}

	public void setFeeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
	}


	//bi-directional many-to-one association to FeeItem
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fee_item_fk", nullable=false)
	public FeeItem getFeeItem() {
		return this.feeItem;
	}

	public void setFeeItem(FeeItem feeItem) {
		this.feeItem = feeItem;
	}


	//bi-directional many-to-one association to ShippingOption
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shipping_options_fk")
	public ShippingOption getShippingOption() {
		return this.shippingOption;
	}

	public void setShippingOption(ShippingOption shippingOption) {
		this.shippingOption = shippingOption;
	}


	//bi-directional many-to-one association to PayHistory
	@OneToMany(mappedBy="feeBreakdown")
	public Set<PayHistory> getPayHistories() {
		return this.payHistories;
	}

	public void setPayHistories(Set<PayHistory> payHistories) {
		this.payHistories = payHistories;
	}

	public PayHistory addPayHistory(PayHistory payHistory) {
		getPayHistories().add(payHistory);
		payHistory.setFeeBreakdown(this);

		return payHistory;
	}

	public PayHistory removePayHistory(PayHistory payHistory) {
		getPayHistories().remove(payHistory);
		payHistory.setFeeBreakdown(null);

		return payHistory;
	}

}