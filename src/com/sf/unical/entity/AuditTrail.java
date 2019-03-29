package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the audit_trail database table.
 * 
 */
@Entity
@Table(name="audit_trail")
@NamedQuery(name="AuditTrail.findAll", query="SELECT a FROM AuditTrail a")
public class AuditTrail implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String action;
	private Long actor;
	private Timestamp date;
	private String description;
	private Long source;

	public AuditTrail() {
	}


	@Id
	@SequenceGenerator(name="AUDIT_TRAIL_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUDIT_TRAIL_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}


	@Column(nullable=false)
	public Long getActor() {
		return this.actor;
	}

	public void setActor(Long actor) {
		this.actor = actor;
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
	public Long getSource() {
		return this.source;
	}

	public void setSource(Long source) {
		this.source = source;
	}

}