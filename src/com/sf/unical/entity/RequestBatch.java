package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the request_batch database table.
 * 
 */
@Entity
@Table(name="request_batch")
@NamedQuery(name="RequestBatch.findAll", query="SELECT r FROM RequestBatch r")
public class RequestBatch implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date date;
	private Boolean paid;
	private Date payDate;
	private Set<PayHistory> payHistories;
	private Set<RequestHistory> requestHistories;

	public RequestBatch() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_BATCH_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_BATCH_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@Column(nullable=false)
	public Boolean getPaid() {
		return this.paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="pay_date")
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}


	//bi-directional many-to-one association to PayHistory
	@OneToMany(mappedBy="requestBatch")
	public Set<PayHistory> getPayHistories() {
		return this.payHistories;
	}

	public void setPayHistories(Set<PayHistory> payHistories) {
		this.payHistories = payHistories;
	}

	public PayHistory addPayHistory(PayHistory payHistory) {
		getPayHistories().add(payHistory);
		payHistory.setRequestBatch(this);

		return payHistory;
	}

	public PayHistory removePayHistory(PayHistory payHistory) {
		getPayHistories().remove(payHistory);
		payHistory.setRequestBatch(null);

		return payHistory;
	}


	//bi-directional many-to-one association to RequestHistory
	@OneToMany(mappedBy="requestBatch")
	public Set<RequestHistory> getRequestHistories() {
		return this.requestHistories;
	}

	public void setRequestHistories(Set<RequestHistory> requestHistories) {
		this.requestHistories = requestHistories;
	}

	public RequestHistory addRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().add(requestHistory);
		requestHistory.setRequestBatch(this);

		return requestHistory;
	}

	public RequestHistory removeRequestHistory(RequestHistory requestHistory) {
		getRequestHistories().remove(requestHistory);
		requestHistory.setRequestBatch(null);

		return requestHistory;
	}

}