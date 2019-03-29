package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the fee_category database table.
 * 
 */
@Entity
@Table(name="fee_category")
@NamedQuery(name="FeeCategory.findAll", query="SELECT f FROM FeeCategory f")
public class FeeCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<FeeBreakdown> feeBreakdowns;
	private RequestType requestType;

	public FeeCategory() {
	}


	@Id
	@SequenceGenerator(name="FEE_CATEGORY_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FEE_CATEGORY_ID_GENERATOR")
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
	@OneToMany(mappedBy="feeCategory")
	public Set<FeeBreakdown> getFeeBreakdowns() {
		return this.feeBreakdowns;
	}

	public void setFeeBreakdowns(Set<FeeBreakdown> feeBreakdowns) {
		this.feeBreakdowns = feeBreakdowns;
	}

	public FeeBreakdown addFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().add(feeBreakdown);
		feeBreakdown.setFeeCategory(this);

		return feeBreakdown;
	}

	public FeeBreakdown removeFeeBreakdown(FeeBreakdown feeBreakdown) {
		getFeeBreakdowns().remove(feeBreakdown);
		feeBreakdown.setFeeCategory(null);

		return feeBreakdown;
	}


	//bi-directional many-to-one association to RequestType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_type_fk", nullable=false)
	public RequestType getRequestType() {
		return this.requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

}