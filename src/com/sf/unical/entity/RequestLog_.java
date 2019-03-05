package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.031+0100")
@StaticMetamodel(RequestLog.class)
public class RequestLog_ {
	public static volatile SingularAttribute<RequestLog, Long> id;
	public static volatile SingularAttribute<RequestLog, Timestamp> date;
	public static volatile SingularAttribute<RequestLog, String> description;
	public static volatile SingularAttribute<RequestLog, Boolean> shipped;
	public static volatile SingularAttribute<RequestLog, String> status;
	public static volatile SingularAttribute<RequestLog, RequestHistory> requestHistory;
}
