package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T13:05:57.520+0100")
@StaticMetamodel(Country.class)
public class Country_ {
	public static volatile SingularAttribute<Country, Long> id;
	public static volatile SingularAttribute<Country, String> code;
	public static volatile SingularAttribute<Country, String> name;
	public static volatile SetAttribute<Country, Organization> organizations;
}
