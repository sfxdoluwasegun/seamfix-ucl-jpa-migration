package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the request_type database table.
 * 
 */
@Entity
@Table(name="request_type")
@NamedQuery(name="RequestType.findAll", query="SELECT r FROM RequestType r")
public class RequestType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<FeeCategory> feeCategories;
	private Set<RequestHistory> requestHistories;
	
	private Boolean isDefault;

	public RequestType() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_TYPE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_TYPE_ID_GENERATOR")
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


	//bi-directional many-to-one association to FeeCategory
	@OneToMany(mappedBy="requestType")
	public Set<FeeCategory> getFeeCategories() {
		return this.feeCategories;
	}

	public void setFeeCategories(Set<FeeCategory> feeCategories) {
		this.feeCategories = feeCategories;
	}

	public FeeCategory addFeeCategory(FeeCategory feeCategory) {
		getFeeCategories().add(feeCategory);
		feeCategory.setRequestType(this);

		return feeCategory;
	}

	public FeeCategory removeFeeCategory(FeeCategory feeCategory) {
		getFeeCategories().remove(feeCategory);
		feeCategory.setRequestType(null);

		return feeCategory;
	}


	//bi-directional many-to-one association to RequestHistory
	@OneToMany(mappedBy="requestType")
	public Set<RequestHistory> getRequestHistories() {
		return this.requestHistories;
	}

	public void setRequestHistories(Set<RequestHistory> requestHistories) {
		this.requestHistories = requestHistories;
	}

	public RequestHistory addRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().add(requestHistory);
		requestHistory.setRequestType(this);

		return requestHistory;
	}

	public RequestHistory removeRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().remove(requestHistory);
		requestHistory.setRequestType(null);

		return requestHistory;
	}

	@Column(nullable=true)
	public Boolean getIsDefault() {
		return isDefault;
	}


	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

}