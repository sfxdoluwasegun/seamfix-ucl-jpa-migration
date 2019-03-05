package com.sf.unical.hibenv;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T15:56:36.632+0100")
@StaticMetamodel(UserRevEntity.class)
public class UserRevEntity_ {
	public static volatile SingularAttribute<UserRevEntity, Integer> pk;
	public static volatile SingularAttribute<UserRevEntity, Date> timestamp;
	public static volatile SingularAttribute<UserRevEntity, Long> userid;
	public static volatile SingularAttribute<UserRevEntity, String> ipaddress;
}
