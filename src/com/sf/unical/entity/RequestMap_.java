package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.075+0100")
@StaticMetamodel(RequestMap.class)
public class RequestMap_ {
	public static volatile SingularAttribute<RequestMap, Long> id;
	public static volatile SingularAttribute<RequestMap, Timestamp> date;
	public static volatile SingularAttribute<RequestMap, String> name;
	public static volatile SingularAttribute<RequestMap, Admin> admin;
	public static volatile SingularAttribute<RequestMap, RequestHistory> requestHistory;
}
