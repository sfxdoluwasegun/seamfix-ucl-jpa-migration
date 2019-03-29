package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.900+0100")
@StaticMetamodel(FeeCategory.class)
public class FeeCategory_ {
	public static volatile SingularAttribute<FeeCategory, Long> id;
	public static volatile SingularAttribute<FeeCategory, String> name;
	public static volatile SetAttribute<FeeCategory, FeeBreakdown> feeBreakdowns;
	public static volatile SingularAttribute<FeeCategory, RequestType> requestType;
}
