package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the fee_item database table.
 * 
 */
@Entity
@Table(name="fee_item")
@NamedQuery(name="FeeItem.findAll", query="SELECT f FROM FeeItem f")
public class FeeItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<FeeBreakdown> feeBreakdowns;

	public FeeItem() {
	}


	@Id
	@SequenceGenerator(name="FEE_ITEM_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FEE_ITEM_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to FeeBreakdown
	@OneToMany(mappedBy="feeItem")
	public Set<FeeBreakdown> getFeeBreakdowns() {
		return this.feeBreakdowns;
	}

	public void setFeeBreakdowns(Set<FeeBreakdown> feeBreakdowns) {
		this.feeBreakdowns = feeBreakdowns;
	}

	public FeeBreakdown addFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().add(feeBreakdown);
		feeBreakdown.setFeeItem(this);

		return feeBreakdown;
	}

	public FeeBreakdown removeFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().remove(feeBreakdown);
		feeBreakdown.setFeeItem(null);

		return feeBreakdown;
	}

}