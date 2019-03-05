package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.861+0100")
@StaticMetamodel(DiplomaCours.class)
public class DiplomaCours_ {
	public static volatile SingularAttribute<DiplomaCours, Long> id;
	public static volatile SingularAttribute<DiplomaCours, String> grade;
	public static volatile SingularAttribute<DiplomaCours, String> name;
	public static volatile SingularAttribute<DiplomaCours, Alumni> alumni;
	public static volatile SingularAttribute<DiplomaCours, Long> year;
}
