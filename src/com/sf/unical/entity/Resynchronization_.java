package com.sf.unical.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.170+0100")
@StaticMetamodel(Resynchronization.class)
public class Resynchronization_ {
	public static volatile SingularAttribute<Resynchronization, Long> id;
	public static volatile SingularAttribute<Resynchronization, Date> date;
	public static volatile SingularAttribute<Resynchronization, String> key;
	public static volatile SingularAttribute<Resynchronization, String> log;
	public static volatile SingularAttribute<Resynchronization, byte[]> pojo;
	public static volatile SingularAttribute<Resynchronization, Boolean> synched;
	public static volatile SingularAttribute<Resynchronization, Admin> admin;
}
