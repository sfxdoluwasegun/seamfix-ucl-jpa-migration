package com.sf.unical.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "proficiency_request")
public class ProficiencyRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private boolean standAlone;
	private String emailAddress;
	private boolean treated;
	private Double bill;
	private RequestHistory requestHistory;
	
	public ProficiencyRequest() {
	}

	public ProficiencyRequest(long id, boolean standAlone, String emailAddress, Double bill, RequestHistory requestHistory, String disapprovalReason) {
		this.id = id;
		this.standAlone = standAlone;
		this.emailAddress = emailAddress;
		this.bill = bill;
		this.requestHistory = requestHistory;
	}

	@Id
	@SequenceGenerator(name="PROFICIENCY_REQUEST_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROFICIENCY_REQUEST_ID_GENERATOR")
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "standalone")
	public boolean getStandAlone() {
		return standAlone;
	}

	public void setStandAlone(boolean isStandAlone) {
		this.standAlone = isStandAlone;
	}

	@Column(name = "email_address", nullable = true, length = 1024)
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "treated")
	public boolean getTreated() {
		return treated;
	}

	public void setTreated(boolean treated) {
		this.treated = treated;
	}

	@Column(name = "bill", precision = 17, scale = 17)
	public Double getBill() {
		return bill;
	}

	public void setBill(Double bill) {
		this.bill = bill;
	}

	public void setRequestHistory(RequestHistory requestHistory){
		this.requestHistory = requestHistory;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "request_history_fk", unique = true,  nullable = false)
	public RequestHistory getRequestHistory() {
		return requestHistory;
	}
	
	
}

