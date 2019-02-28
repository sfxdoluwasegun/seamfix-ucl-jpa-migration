package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the blockage database table.
 * 
 */
@Entity
@Table(name="blockage")
@NamedQuery(name="Blockage.findAll", query="SELECT b FROM Blockage b")
public class Blockage implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Timestamp date;
	private String description;
	private Boolean resolved;
	private Admin admin;
	private RequestHistory requestHistory;

	public Blockage() {
	}


	@Id
	@SequenceGenerator(name="BLOCKAGE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BLOCKAGE_ID_GENERATOR")
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
	public Boolean getResolved() {
		return this.resolved;
	}

	public void setResolved(Boolean resolved) {
		this.resolved = resolved;
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
	@JoinColumn(name="request_history_fk", nullable=false)
	public RequestHistory getRequestHistory() {
		return this.requestHistory;
	}

	public void setRequestHistory(RequestHistory requestHistory) {
		this.requestHistory = requestHistory;
	}

}