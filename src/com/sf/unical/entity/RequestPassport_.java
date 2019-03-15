package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-15T00:06:46.088+0100")
@StaticMetamodel(RequestPassport.class)
public class RequestPassport_ {
	public static volatile SingularAttribute<RequestPassport, Long> id;
	public static volatile SingularAttribute<RequestPassport, String> course;
	public static volatile SingularAttribute<RequestPassport, Boolean> deactivated;
	public static volatile SingularAttribute<RequestPassport, String> department;
	public static volatile SingularAttribute<RequestPassport, String> email;
	public static volatile SingularAttribute<RequestPassport, String> firstname;
	public static volatile SingularAttribute<RequestPassport, String> maidenName;
	public static volatile SingularAttribute<RequestPassport, String> maritalStatus;
	public static volatile SingularAttribute<RequestPassport, String> matricNo;
	public static volatile SingularAttribute<RequestPassport, String> middleName;
	public static volatile SingularAttribute<RequestPassport, String> month;
	public static volatile SingularAttribute<RequestPassport, String> permanentAddress;
	public static volatile SingularAttribute<RequestPassport, String> phone;
	public static volatile SingularAttribute<RequestPassport, String> surname;
	public static volatile SingularAttribute<RequestPassport, String> type;
	public static volatile SingularAttribute<RequestPassport, Boolean> uploaded;
	public static volatile SingularAttribute<RequestPassport, Boolean> verified;
	public static volatile SingularAttribute<RequestPassport, String> year;
	public static volatile SetAttribute<RequestPassport, PayHistory> payHistories;
	public static volatile SetAttribute<RequestPassport, RequestChange> requestChanges;
	public static volatile SetAttribute<RequestPassport, RequestHistory> requestHistories;
	public static volatile SingularAttribute<RequestPassport, Alumni> alumni;
	public static volatile SingularAttribute<RequestPassport, Boolean> clearanceStatus;
}
