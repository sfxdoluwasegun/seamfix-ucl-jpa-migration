package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the settlement_job database table.
 * 
 */
@Entity
@Table(name="settlement_job")
@NamedQuery(name="SettlementJob.findAll", query="SELECT s FROM SettlementJob s")
public class SettlementJob implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String creditor;
	private String gateway;
	private Timestamp schedule;
	private BigDecimal settlement;
	private Timestamp timestamp;
	private BigDecimal total;

	public SettlementJob() {
	}


	@Id
	@SequenceGenerator(name="SETTLEMENT_JOB_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SETTLEMENT_JOB_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=255)
	public String getCreditor() {
		return this.creditor;
	}

	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}


	@Column(nullable=false, length=255)
	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}


	@Column(nullable=false)
	public Timestamp getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Timestamp schedule) {
		this.schedule = schedule;
	}


	@Column(nullable=false, precision=19, scale=2)
	public BigDecimal getSettlement() {
		return this.settlement;
	}

	public void setSettlement(BigDecimal settlement) {
		this.settlement = settlement;
	}


	@Column(nullable=false)
	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}


	@Column(nullable=false, precision=19, scale=2)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}