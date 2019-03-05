package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.009+0100")
@StaticMetamodel(ReportType.class)
public class ReportType_ {
	public static volatile SingularAttribute<ReportType, Long> id;
	public static volatile SingularAttribute<ReportType, String> name;
	public static volatile SetAttribute<ReportType, Report> reports;
}
