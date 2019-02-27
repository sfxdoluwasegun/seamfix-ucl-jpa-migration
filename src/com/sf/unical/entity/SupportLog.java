package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the support_log database table.
 * 
 */
@Entity
@Table(name="support_log")
@NamedQuery(name="SupportLog.findAll", query="SELECT s FROM SupportLog s")
public class SupportLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date date;
	private String log;
	private Admin admin;
	private Alumni alumni;

	public SupportLog() {
	}


	@Id
	@SequenceGenerator(name="SUPPORT_LOG_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUPPORT_LOG_ID_GENERATOR")
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
	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
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


	//bi-directional many-to-one association to Alumni
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="alumni_fk", nullable=false)
	public Alumni getAlumni() {
		return this.alumni;
	}

	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

}