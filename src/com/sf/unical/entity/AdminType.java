package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the admin_type database table.
 * 
 */
@Entity
@Table(name="admin_type")
@NamedQuery(name="AdminType.findAll", query="SELECT a FROM AdminType a")
public class AdminType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<Admin> admins;

	public AdminType() {
	}


	@Id
	@SequenceGenerator(name="ADMIN_TYPE_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADMIN_TYPE_ID_GENERATOR")
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


	//bi-directional many-to-one association to Admin
	@OneToMany(mappedBy="adminType")
	public Set<Admin> getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

	public Admin addAdmin(Admin admin) {
		getAdmins().add(admin);
		admin.setAdminType(this);

		return admin;
	}

	public Admin removeAdmin(Admin admin) {
		getAdmins().remove(admin);
		admin.setAdminType(null);

		return admin;
	}

}