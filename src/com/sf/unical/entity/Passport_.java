package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.955+0100")
@StaticMetamodel(Passport.class)
public class Passport_ {
	public static volatile SingularAttribute<Passport, Long> id;
	public static volatile SingularAttribute<Passport, byte[]> image;
	public static volatile SetAttribute<Passport, Alumni> alumnis;
}
