package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the docs database table.
 * 
 */
@Entity
@Table(name="docs")
@NamedQuery(name="Doc.findAll", query="SELECT d FROM Doc d")
public class Doc implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Timestamp date;
	private byte[] document;
	private String path;
	private Set<Alumni> alumnis;

	public Doc() {
	}


	@Id
	@SequenceGenerator(name="DOCS_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCS_ID_GENERATOR")
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


	public byte[] getDocument() {
		return this.document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}


	@Column(length=1024)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	//bi-directional many-to-one association to Alumni
	@OneToMany(mappedBy="doc")
	public Set<Alumni> getAlumnis() {
		return this.alumnis;
	}

	public void setAlumnis(Set<Alumni> alumnis) {
		this.alumnis = alumnis;
	}

	public Alumni addAlumni(Alumni alumni) {
		getAlumnis().add(alumni);
		alumni.setDoc(this);

		return alumni;
	}

	public Alumni removeAlumni(Alumni alumni) {
		getAlumnis().remove(alumni);
		alumni.setDoc(null);

		return alumni;
	}

}