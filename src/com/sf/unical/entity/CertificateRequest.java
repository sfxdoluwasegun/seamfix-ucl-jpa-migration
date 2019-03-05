package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CertificateRequest
 *
 */
@Entity

public class CertificateRequest implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private RequestHistory requestHistory;


	public CertificateRequest() {
		super();
	}

	@Id
	@SequenceGenerator(name="CERTIFICATE_REQUEST_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CERTIFICATE_REQUEST_ID_GENERATOR")
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "request_history_fk", unique = true,  nullable = false)
	public RequestHistory getRequestHistory() {
		return requestHistory;
	}

	public void setRequestHistory(RequestHistory requestHistory) {
		this.requestHistory = requestHistory;
	}
   
}
