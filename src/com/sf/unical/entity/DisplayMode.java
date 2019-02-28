package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the display_mode database table.
 * 
 */
@Entity
@Table(name="display_mode")
@NamedQuery(name="DisplayMode.findAll", query="SELECT d FROM DisplayMode d")
public class DisplayMode implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<Report> reports;

	public DisplayMode() {
	}


	@Id
	@SequenceGenerator(name="DISPLAY_MODE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DISPLAY_MODE_ID_GENERATOR")
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
	@OneToMany(mappedBy="displayMode")
	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	public Report addReport(Report report) {
		getReports().add(report);
		report.setDisplayMode(this);

		return report;
	}

	public Report removeReport(Report report) {
		getReports().remove(report);
		report.setDisplayMode(null);

		return report;
	}

}