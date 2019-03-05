package com.sf.unical.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.235+0100")
@StaticMetamodel(SupportLog.class)
public class SupportLog_ {
	public static volatile SingularAttribute<SupportLog, Long> id;
	public static volatile SingularAttribute<SupportLog, Date> date;
	public static volatile SingularAttribute<SupportLog, String> log;
	public static volatile SingularAttribute<SupportLog, Admin> admin;
	public static volatile SingularAttribute<SupportLog, Alumni> alumni;
}
