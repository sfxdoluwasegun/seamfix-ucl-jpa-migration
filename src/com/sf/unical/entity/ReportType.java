package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the report_type database table.
 * 
 */
@Entity
@Table(name="report_type")
@NamedQuery(name="ReportType.findAll", query="SELECT r FROM ReportType r")
public class ReportType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<Report> reports;

	public ReportType() {
	}


	@Id
	@SequenceGenerator(name="REPORT_TYPE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPORT_TYPE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="reportType")
	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	public Report addReport(Report report) {
		getReports().add(report);
		report.setReportType(this);

		return report;
	}

	public Report removeReport(Report report) {
		getReports().remove(report);
		report.setReportType(null);

		return report;
	}

}