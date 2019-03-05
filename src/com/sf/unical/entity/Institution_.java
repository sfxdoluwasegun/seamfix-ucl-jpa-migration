package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.910+0100")
@StaticMetamodel(Institution.class)
public class Institution_ {
	public static volatile SingularAttribute<Institution, Long> id;
	public static volatile SingularAttribute<Institution, String> address;
	public static volatile SingularAttribute<Institution, String> code;
	public static volatile SingularAttribute<Institution, String> email;
	public static volatile SingularAttribute<Institution, String> name;
	public static volatile SingularAttribute<Institution, String> phone;
	public static volatile SingularAttribute<Institution, String> website;
	public static volatile SingularAttribute<Institution, Logo> logo;
}
