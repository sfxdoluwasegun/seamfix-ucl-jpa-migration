package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.395+0100")
@StaticMetamodel(Admin.class)
public class Admin_ {
	public static volatile SingularAttribute<Admin, Long> id;
	public static volatile SingularAttribute<Admin, String> campus;
	public static volatile SingularAttribute<Admin, String> email;
	public static volatile SingularAttribute<Admin, String> firstname;
	public static volatile SingularAttribute<Admin, String> middleName;
	public static volatile SingularAttribute<Admin, Long> orbitaId;
	public static volatile SingularAttribute<Admin, String> surname;
	public static volatile SingularAttribute<Admin, String> type;
	public static volatile SingularAttribute<Admin, String> username;
	public static volatile SingularAttribute<Admin, AdminType> adminType;
	public static volatile SetAttribute<Admin, Role> roles;
	public static volatile SetAttribute<Admin, Blockage> blockages;
	public static volatile SetAttribute<Admin, RequestChange> requestChanges;
	public static volatile SetAttribute<Admin, RequestMap> requestMaps;
	public static volatile SetAttribute<Admin, Resynchronization> resynchronizations;
	public static volatile SetAttribute<Admin, SupportLog> supportLogs;
	public static volatile SetAttribute<Admin, VerificationTag> verificationTags;
}
