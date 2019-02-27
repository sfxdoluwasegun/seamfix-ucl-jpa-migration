package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the signed_document database table.
 * 
 */
@Entity
@Table(name="signed_document")
@NamedQuery(name="SignedDocument.findAll", query="SELECT s FROM SignedDocument s")
public class SignedDocument implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Timestamp date;
	private String description;
	private byte[] document;
	private String ext;
	private String name;
	private VerificationTag verificationTag;

	public SignedDocument() {
	}


	@Id
	@SequenceGenerator(name="SIGNED_DOCUMENT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SIGNED_DOCUMENT_ID_GENERATOR")
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


	@Column(length=1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false)
	public byte[] getDocument() {
		return this.document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}


	@Column(length=1024)
	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}


	@Column(length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to VerificationTag
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="verification_tag_fk")
	public VerificationTag getVerificationTag() {
		return this.verificationTag;
	}

	public void setVerificationTag(VerificationTag verificationTag) {
		this.verificationTag = verificationTag;
	}

}