package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.163+0100")
@StaticMetamodel(ResultHistory.class)
public class ResultHistory_ {
	public static volatile SingularAttribute<ResultHistory, Long> id;
	public static volatile SingularAttribute<ResultHistory, String> asession;
	public static volatile SingularAttribute<ResultHistory, String> code;
	public static volatile SingularAttribute<ResultHistory, String> contact;
	public static volatile SingularAttribute<ResultHistory, String> course;
	public static volatile SingularAttribute<ResultHistory, String> flag;
	public static volatile SingularAttribute<ResultHistory, String> grade;
	public static volatile SingularAttribute<ResultHistory, String> level;
	public static volatile SingularAttribute<ResultHistory, String> month;
	public static volatile SingularAttribute<ResultHistory, String> number;
	public static volatile SingularAttribute<ResultHistory, String> program;
	public static volatile SingularAttribute<ResultHistory, String> semesterMode;
	public static volatile SingularAttribute<ResultHistory, String> semesterType;
	public static volatile SingularAttribute<ResultHistory, String> studentType;
	public static volatile SingularAttribute<ResultHistory, Boolean> supplementary;
	public static volatile SingularAttribute<ResultHistory, String> unit;
	public static volatile SingularAttribute<ResultHistory, Alumni> alumni;
	public static volatile SingularAttribute<ResultHistory, Double> point;
	public static volatile SingularAttribute<ResultHistory, Boolean> probation;
}
