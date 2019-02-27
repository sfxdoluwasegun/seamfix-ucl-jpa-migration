package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the report database table.
 * 
 */
@Entity
@Table(name="report")
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private Integer height;
	private String name;
	private DisplayMode displayMode;
	private ReportType reportType;

	public Report() {
	}


	@Id
	@SequenceGenerator(name="REPORT_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPORT_ID_GENERATOR")
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


	@Column(nullable=false)
	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to DisplayMode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="display_mode_fk", nullable=false)
	public DisplayMode getDisplayMode() {
		return this.displayMode;
	}

	public void setDisplayMode(DisplayMode displayMode) {
		this.displayMode = displayMode;
	}


	//bi-directional many-to-one association to ReportType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="report_type_fk", nullable=false)
	public ReportType getReportType() {
		return this.reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

}