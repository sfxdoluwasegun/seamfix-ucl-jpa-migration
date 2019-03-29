package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.875+0100")
@StaticMetamodel(Doc.class)
public class Doc_ {
	public static volatile SingularAttribute<Doc, Long> id;
	public static volatile SingularAttribute<Doc, Timestamp> date;
	public static volatile SingularAttribute<Doc, String> path;
	public static volatile SetAttribute<Doc, Alumni> alumnis;
	public static volatile SingularAttribute<Doc, byte[]> document;
}
