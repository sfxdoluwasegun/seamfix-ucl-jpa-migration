package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.018+0100")
@StaticMetamodel(RequestChange.class)
public class RequestChange_ {
	public static volatile SingularAttribute<RequestChange, Long> id;
	public static volatile SingularAttribute<RequestChange, Boolean> acknowledged;
	public static volatile SingularAttribute<RequestChange, String> address;
	public static volatile SingularAttribute<RequestChange, Boolean> approved;
	public static volatile SingularAttribute<RequestChange, String> matricNo;
	public static volatile SingularAttribute<RequestChange, String> postcode;
	public static volatile SingularAttribute<RequestChange, Boolean> published;
	public static volatile SingularAttribute<RequestChange, String> recipient;
	public static volatile SingularAttribute<RequestChange, Timestamp> time;
	public static volatile SingularAttribute<RequestChange, Admin> admin;
	public static volatile SingularAttribute<RequestChange, RequestHistory> requestHistory;
	public static volatile SingularAttribute<RequestChange, RequestPassport> requestPassport;
}
