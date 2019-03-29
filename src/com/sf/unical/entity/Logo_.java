package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.939+0100")
@StaticMetamodel(Logo.class)
public class Logo_ {
	public static volatile SingularAttribute<Logo, Long> id;
	public static volatile SingularAttribute<Logo, byte[]> image;
	public static volatile SetAttribute<Logo, Institution> institutions;
}
