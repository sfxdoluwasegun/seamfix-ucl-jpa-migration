package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.004+0100")
@StaticMetamodel(Report.class)
public class Report_ {
	public static volatile SingularAttribute<Report, Long> id;
	public static volatile SingularAttribute<Report, String> code;
	public static volatile SingularAttribute<Report, Integer> height;
	public static volatile SingularAttribute<Report, String> name;
	public static volatile SingularAttribute<Report, DisplayMode> displayMode;
	public static volatile SingularAttribute<Report, ReportType> reportType;
}
