package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the attachments database table.
 * 
 */
@Entity
@Table(name="attachments")
@NamedQuery(name="Attachment.findAll", query="SELECT a FROM Attachment a")
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private byte[] document;
	private String name;
	private VerificationHistory verificationHistory;

	public Attachment() {
	}


	@Id
	@SequenceGenerator(name="ATTACHMENTS_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATTACHMENTS_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to VerificationHistory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="verification_history_fk", nullable=false)
	public VerificationHistory getVerificationHistory() {
		return this.verificationHistory;
	}

	public void setVerificationHistory(VerificationHistory verificationHistory) {
		this.verificationHistory = verificationHistory;
	}

}