package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the request_change database table.
 * 
 */
@Entity
@Table(name="request_change")
@NamedQuery(name="RequestChange.findAll", query="SELECT r FROM RequestChange r")
public class RequestChange implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Boolean acknowledged;
	private String address;
	private Boolean approved;
	private String matricNo;
	private String postcode;
	private Boolean published;
	private String recipient;
	private Timestamp time;
	private Admin admin;
	private RequestHistory requestHistory;
	private RequestPassport requestPassport;

	public RequestChange() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_CHANGE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_CHANGE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public Boolean getAcknowledged() {
		return this.acknowledged;
	}

	public void setAcknowledged(Boolean acknowledged) {
		this.acknowledged = acknowledged;
	}


	@Column(length=1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(nullable=false)
	public Boolean getApproved() {
		return this.approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}


	@Column(name="matric_no", length=1024)
	public String getMatricNo() {
		return this.matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}


	@Column(length=1024)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	@Column(nullable=false)
	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}


	@Column(length=1024)
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	@Column(nullable=false)
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}


	//bi-directional many-to-one association to Admin
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_fk", nullable=false)
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	//bi-directional many-to-one association to RequestHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_history_fk")
	public RequestHistory getRequestHistory() {
		return this.requestHistory;
	}

	public void setRequestHistory(RequestHistory requestHistory) {
		this.requestHistory = requestHistory;
	}


	//bi-directional many-to-one association to RequestPassport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_passport_fk")
	public RequestPassport getRequestPassport() {
		return this.requestPassport;
	}

	public void setRequestPassport(RequestPassport requestPassport) {
		this.requestPassport = requestPassport;
	}

}