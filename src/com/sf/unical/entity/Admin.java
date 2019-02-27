package com.sf.unical.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@Table(name="admin")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String campus;
	private String email;
	private String firstname;
	private String middleName;
	private Long orbitaId;
	private String surname;
	private String type;
	private String username;
	private AdminType adminType;
	private Set<Role> roles;
	private Set<Blockage> blockages;
	private Set<RequestChange> requestChanges;
	private Set<RequestMap> requestMaps;
	private Set<Resynchronization> resynchronizations;
	private Set<SupportLog> supportLogs;
	private Set<VerificationTag> verificationTags;

	public Admin() {
	}


	@Id
	@SequenceGenerator(name="ADMIN_ID_GENERATOR", sequenceName="HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADMIN_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(nullable=false, length=1024)
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}


	@Column(length=1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(length=1024)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	@Column(name="middle_name", length=1024)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Column(name="orbita_id", nullable=false)
	public Long getOrbitaId() {
		return this.orbitaId;
	}

	public void setOrbitaId(Long orbitaId) {
		this.orbitaId = orbitaId;
	}


	@Column(length=1024)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Column(length=1024)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Column(nullable=false, length=1024)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	//bi-directional many-to-one association to AdminType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_type_fk", nullable=false)
	public AdminType getAdminType() {
		return this.adminType;
	}

	public void setAdminType(AdminType adminType) {
		this.adminType = adminType;
	}


	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="admins")
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	//bi-directional many-to-one association to Blockage
	@OneToMany(mappedBy="admin")
	public Set<Blockage> getBlockages() {
		return this.blockages;
	}

	public void setBlockages(Set<Blockage> blockages) {
		this.blockages = blockages;
	}

	public Blockage addBlockage(Blockage blockage) {
		getBlockages().add(blockage);
		blockage.setAdmin(this);

		return blockage;
	}

	public Blockage removeBlockage(Blockage blockage) {
		getBlockages().remove(blockage);
		blockage.setAdmin(null);

		return blockage;
	}


	//bi-directional many-to-one association to RequestChange
	@OneToMany(mappedBy="admin")
	public Set<RequestChange> getRequestChanges() {
		return this.requestChanges;
	}

	public void setRequestChanges(Set<RequestChange> requestChanges) {
		this.requestChanges = requestChanges;
	}

	public RequestChange addRequestChange(RequestChange requestChange) {
		getRequestChanges().add(requestChange);
		requestChange.setAdmin(this);

		return requestChange;
	}

	public RequestChange removeRequestChange(RequestChange requestChange) {
		getRequestChanges().remove(requestChange);
		requestChange.setAdmin(null);

		return requestChange;
	}


	//bi-directional many-to-one association to RequestMap
	@OneToMany(mappedBy="admin")
	public Set<RequestMap> getRequestMaps() {
		return this.requestMaps;
	}

	public void setRequestMaps(Set<RequestMap> requestMaps) {
		this.requestMaps = requestMaps;
	}

	public RequestMap addRequestMap(RequestMap requestMap) {
		getRequestMaps().add(requestMap);
		requestMap.setAdmin(this);

		return requestMap;
	}

	public RequestMap removeRequestMap(RequestMap requestMap) {
		getRequestMaps().remove(requestMap);
		requestMap.setAdmin(null);

		return requestMap;
	}


	//bi-directional many-to-one association to Resynchronization
	@OneToMany(mappedBy="admin")
	public Set<Resynchronization> getResynchronizations() {
		return this.resynchronizations;
	}

	public void setResynchronizations(Set<Resynchronization> resynchronizations) {
		this.resynchronizations = resynchronizations;
	}

	public Resynchronization addResynchronization(Resynchronization resynchronization) {
		getResynchronizations().add(resynchronization);
		resynchronization.setAdmin(this);

		return resynchronization;
	}

	public Resynchronization removeResynchronization(Resynchronization resynchronization) {
		getResynchronizations().remove(resynchronization);
		resynchronization.setAdmin(null);

		return resynchronization;
	}


	//bi-directional many-to-one association to SupportLog
	@OneToMany(mappedBy="admin")
	public Set<SupportLog> getSupportLogs() {
		return this.supportLogs;
	}

	public void setSupportLogs(Set<SupportLog> supportLogs) {
		this.supportLogs = supportLogs;
	}

	public SupportLog addSupportLog(SupportLog supportLog) {
		getSupportLogs().add(supportLog);
		supportLog.setAdmin(this);

		return supportLog;
	}

	public SupportLog removeSupportLog(SupportLog supportLog) {
		getSupportLogs().remove(supportLog);
		supportLog.setAdmin(null);

		return supportLog;
	}


	//bi-directional many-to-one association to VerificationTag
	@OneToMany(mappedBy="admin")
	public Set<VerificationTag> getVerificationTags() {
		return this.verificationTags;
	}

	public void setVerificationTags(Set<VerificationTag> verificationTags) {
		this.verificationTags = verificationTags;
	}

	public VerificationTag addVerificationTag(VerificationTag verificationTag) {
		getVerificationTags().add(verificationTag);
		verificationTag.setAdmin(this);

		return verificationTag;
	}

	public VerificationTag removeVerificationTag(VerificationTag verificationTag) {
		getVerificationTags().remove(verificationTag);
		verificationTag.setAdmin(null);

		return verificationTag;
	}

}