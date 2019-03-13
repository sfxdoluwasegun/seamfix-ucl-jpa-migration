package com.sf.unical.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T13:19:48.231+0100")
@StaticMetamodel(RequestHistory.class)
public class RequestHistory_ {
	public static volatile SingularAttribute<RequestHistory, Long> id;
	public static volatile SingularAttribute<RequestHistory, String> address;
	public static volatile SingularAttribute<RequestHistory, Integer> copies;
	public static volatile SingularAttribute<RequestHistory, Timestamp> date;
	public static volatile SingularAttribute<RequestHistory, Boolean> manual;
	public static volatile SingularAttribute<RequestHistory, String> name;
	public static volatile SingularAttribute<RequestHistory, String> postcode;
	public static volatile SingularAttribute<RequestHistory, Boolean> processed;
	public static volatile SingularAttribute<RequestHistory, Date> reminder;
	public static volatile SingularAttribute<RequestHistory, String> serial;
	public static volatile SingularAttribute<RequestHistory, Boolean> shipped;
	public static volatile SingularAttribute<RequestHistory, String> track;
	public static volatile SingularAttribute<RequestHistory, String> tracker;
	public static volatile SetAttribute<RequestHistory, Blockage> blockages;
	public static volatile SetAttribute<RequestHistory, RequestChange> requestChanges;
	public static volatile SingularAttribute<RequestHistory, RequestBatch> requestBatch;
	public static volatile SingularAttribute<RequestHistory, RequestPassport> requestPassport;
	public static volatile SingularAttribute<RequestHistory, RequestType> requestType;
	public static volatile SingularAttribute<RequestHistory, ShippingContinent> shippingContinent;
	public static volatile SingularAttribute<RequestHistory, ShippingMode> shippingMode;
	public static volatile SetAttribute<RequestHistory, RequestLog> requestLogs;
	public static volatile SetAttribute<RequestHistory, RequestMap> requestMaps;
	public static volatile SingularAttribute<RequestHistory, Double> bill;
	public static volatile SingularAttribute<RequestHistory, CertificateRequest> certificateRequest;
	public static volatile SingularAttribute<RequestHistory, String> emailAddress;
}
