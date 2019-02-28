package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shipping_mode database table.
 * 
 */
@Entity
@Table(name="shipping_mode")
@NamedQuery(name="ShippingMode.findAll", query="SELECT s FROM ShippingMode s")
public class ShippingMode implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private String email;
	private Boolean local;
	private String name;
	private String tracer;
	private Set<RequestHistory> requestHistories;
	private Set<ShippingOption> shippingOptions;

	public ShippingMode() {
	}


	@Id
	@SequenceGenerator(name="SHIPPING_MODE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHIPPING_MODE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false, length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(nullable=false)
	public Boolean getLocal() {
		return this.local;
	}

	public void setLocal(Boolean local) {
		this.local = local;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(nullable=false, length=1024)
	public String getTracer() {
		return this.tracer;
	}

	public void setTracer(String tracer) {
		this.tracer = tracer;
	}


	//bi-directional many-to-one association to RequestHistory
	@OneToMany(mappedBy="shippingMode")
	public Set<RequestHistory> getRequestHistories() {
		return this.requestHistories;
	}

	public void setRequestHistories(Set<RequestHistory> requestHistories) {
		this.requestHistories = requestHistories;
	}

	public RequestHistory addRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().add(requestHistory);
		requestHistory.setShippingMode(this);

		return requestHistory;
	}

	public RequestHistory removeRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().remove(requestHistory);
		requestHistory.setShippingMode(null);

		return requestHistory;
	}


	//bi-directional many-to-one association to ShippingOption
	@OneToMany(mappedBy="shippingMode")
	public Set<ShippingOption> getShippingOptions() {
		return this.shippingOptions;
	}

	public void setShippingOptions(Set<ShippingOption> shippingOptions) {
		this.shippingOptions = shippingOptions;
	}

	public ShippingOption addShippingOption(ShippingOption shippingOption) {
		getShippingOptions().add(shippingOption);
		shippingOption.setShippingMode(this);

		return shippingOption;
	}

	public ShippingOption removeShippingOption(ShippingOption shippingOption) {
		getShippingOptions().remove(shippingOption);
		shippingOption.setShippingMode(null);

		return shippingOption;
	}

}