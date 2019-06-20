package com.sf.unical.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-21T10:56:12.434+0100")
@StaticMetamodel(ResynchDocument.class)
public class ResynchDocument_ {
	public static volatile SingularAttribute<ResynchDocument, Long> id;
	public static volatile SingularAttribute<ResynchDocument, Alumni> alumni;
	public static volatile SingularAttribute<ResynchDocument, String> matricNo;
	public static volatile SingularAttribute<ResynchDocument, String> path;
	public static volatile SingularAttribute<ResynchDocument, Date> time;
}
