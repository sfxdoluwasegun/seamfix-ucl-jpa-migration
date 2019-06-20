package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-21T10:56:12.321+0100")
@StaticMetamodel(Organization.class)
public class Organization_ {
	public static volatile SingularAttribute<Organization, Long> id;
	public static volatile SingularAttribute<Organization, String> address;
	public static volatile SingularAttribute<Organization, String> city;
	public static volatile SingularAttribute<Organization, String> designation;
	public static volatile SingularAttribute<Organization, String> email;
	public static volatile SingularAttribute<Organization, String> name;
	public static volatile SingularAttribute<Organization, String> officer;
	public static volatile SingularAttribute<Organization, String> phone;
	public static volatile SingularAttribute<Organization, String> zip;
	public static volatile SingularAttribute<Organization, Country> country;
	public static volatile SingularAttribute<Organization, ShippingContinent> shippingContinent;
	public static volatile SetAttribute<Organization, VerificationHistory> verificationHistories;
	public static volatile SingularAttribute<Organization, String> verificationRequestStatus;
	public static volatile SingularAttribute<Organization, char[]> password;
	public static volatile SingularAttribute<Organization, Boolean> alternativeVerificationBody;
	public static volatile SingularAttribute<Organization, Boolean> lastPasswordResetCode;
}
