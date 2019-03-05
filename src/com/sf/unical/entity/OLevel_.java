package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.945+0100")
@StaticMetamodel(OLevel.class)
public class OLevel_ {
	public static volatile SingularAttribute<OLevel, Long> id;
	public static volatile SingularAttribute<OLevel, String> exam;
	public static volatile SingularAttribute<OLevel, String> grade;
	public static volatile SingularAttribute<OLevel, String> subject;
	public static volatile SingularAttribute<OLevel, String> year;
	public static volatile SingularAttribute<OLevel, Alumni> alumni;
}
