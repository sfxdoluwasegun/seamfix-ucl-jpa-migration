package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.847+0100")
@StaticMetamodel(Blockage.class)
public class Blockage_ {
	public static volatile SingularAttribute<Blockage, Long> id;
	public static volatile SingularAttribute<Blockage, Timestamp> date;
	public static volatile SingularAttribute<Blockage, String> description;
	public static volatile SingularAttribute<Blockage, Boolean> resolved;
	public static volatile SingularAttribute<Blockage, Admin> admin;
	public static volatile SingularAttribute<Blockage, RequestHistory> requestHistory;
}
