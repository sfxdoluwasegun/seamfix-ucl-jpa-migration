package com.sf.unical.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;


@AuditTable(schema = "audit", value = "zz_resynch_document")
@Entity
@Table(name = "resynch_document")
@NamedQueries({
		@javax.persistence.NamedQuery(name = "ResynchDocument.findAll", query = "SELECT d FROM ResynchDocument d"),
		@javax.persistence.NamedQuery(name = "ResynchDocument.findWithoutAlumni", query = "SELECT d FROM ResynchDocument d WHERE d.alumni IS NULL") })
public class ResynchDocument implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private Alumni alumni;
	private String matricNo;
	private String path;
	private Date time;

	public ResynchDocument() {
	}

	public ResynchDocument(long id, String matricNo, String path, Date time) {
		this.id = id;
		this.matricNo = matricNo;
		this.path = path;
		this.time = time;
	}

	public ResynchDocument(long id, Alumni alumni, String matricNo, String path, Date time) {
		this.id = id;
		this.alumni = alumni;
		this.matricNo = matricNo;
		this.path = path;
		this.time = time;
	}

	@Id
	@SequenceGenerator(name = "RESYNC_DOCUMENT_ID_GENERATOR", sequenceName = "HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESYNC_DOCUMENT_ID_GENERATOR")
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "alumni")
	public Alumni getAlumni() {
		return this.alumni;
	}

	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

	@Column(name = "matric_no", nullable = false, length = 1024)
	public String getMatricNo() {
		return this.matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}

	@Column(name = "path", nullable = true, length = 1024)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", nullable = false, length = 29)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
