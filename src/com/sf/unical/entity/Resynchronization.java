package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the resynchronization database table.
 * 
 */
@Entity
@Table(name="resynchronization")
@NamedQuery(name="Resynchronization.findAll", query="SELECT r FROM Resynchronization r")
public class Resynchronization implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date date;
	private String key;
	private String log;
	private byte[] pojo;
	private Boolean synched;
	private Admin admin;

	public Resynchronization() {
	}


	@Id
	@SequenceGenerator(name="RESYNCHRONIZATION_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESYNCHRONIZATION_ID_GENERATOR")
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


	@Column(nullable=false, length=1024)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}


	@Column(length=1024)
	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}


	@Column(nullable=false)
	public byte[] getPojo() {
		return this.pojo;
	}

	public void setPojo(byte[] pojo) {
		this.pojo = pojo;
	}


	@Column(nullable=false)
	public Boolean getSynched() {
		return this.synched;
	}

	public void setSynched(Boolean synched) {
		this.synched = synched;
	}


	//bi-directional many-to-one association to Admin
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_fk")
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}