package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.156+0100")
@StaticMetamodel(Result.class)
public class Result_ {
	public static volatile SingularAttribute<Result, Long> id;
	public static volatile SingularAttribute<Result, String> degree;
	public static volatile SingularAttribute<Result, String> degreeClass;
	public static volatile SingularAttribute<Result, String> distinctions;
	public static volatile SingularAttribute<Result, Double> firstArchiveCgpa;
	public static volatile SingularAttribute<Result, Double> secondArchiveCgpa;
	public static volatile SingularAttribute<Result, Double> totalUnitsOfferred;
	public static volatile SetAttribute<Result, Alumni> alumnis;
	public static volatile SingularAttribute<Result, Double> cgpa;
	public static volatile SingularAttribute<Result, Double> fgpa;
	public static volatile SingularAttribute<Result, Double> wgpa;
}
