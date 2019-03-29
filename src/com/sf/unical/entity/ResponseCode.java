package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the response_codes database table.
 * 
 */
@Entity
@Table(name="response_codes")
@NamedQuery(name="ResponseCode.findAll", query="SELECT r FROM ResponseCode r")
public class ResponseCode implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String description;
	private String vendor;

	public ResponseCode() {
	}


	@Id
	@SequenceGenerator(name="RESPONSE_CODES_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESPONSE_CODES_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Column(nullable=false, length=1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(nullable=false, length=1024)
	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}