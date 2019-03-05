package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.829+0100")
@StaticMetamodel(AuditTrail.class)
public class AuditTrail_ {
	public static volatile SingularAttribute<AuditTrail, Long> id;
	public static volatile SingularAttribute<AuditTrail, String> action;
	public static volatile SingularAttribute<AuditTrail, Long> actor;
	public static volatile SingularAttribute<AuditTrail, Timestamp> date;
	public static volatile SingularAttribute<AuditTrail, String> description;
	public static volatile SingularAttribute<AuditTrail, Long> source;
}
