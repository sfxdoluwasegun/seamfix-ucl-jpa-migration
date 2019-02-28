package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the request_log database table.
 * 
 */
@Entity
@Table(name="request_log")
@NamedQuery(name="RequestLog.findAll", query="SELECT r FROM RequestLog r")
public class RequestLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Timestamp date;
	private String description;
	private Boolean shipped;
	private String status;
	private RequestHistory requestHistory;

	public RequestLog() {
	}


	@Id
	@SequenceGenerator(name="REQUEST_LOG_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQUEST_LOG_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	@Column(nullable=false, length=1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false)
	public Boolean getShipped() {
		return this.shipped;
	}

	public void setShipped(Boolean shipped) {
		this.shipped = shipped;
	}


	@Column(nullable=false, length=1024)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	//bi-directional many-to-one association to RequestHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="request_history_fk", nullable=false)
	public RequestHistory getRequestHistory() {
		return this.requestHistory;
	}

	public void setRequestHistory(RequestHistory requestHistory) {
		this.requestHistory = requestHistory;
	}

}