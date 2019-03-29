package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.790+0100")
@StaticMetamodel(AdminType.class)
public class AdminType_ {
	public static volatile SingularAttribute<AdminType, Long> id;
	public static volatile SingularAttribute<AdminType, String> name;
	public static volatile SetAttribute<AdminType, Admin> admins;
}
