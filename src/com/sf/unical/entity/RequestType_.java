package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-11T21:04:51.025+0100")
@StaticMetamodel(RequestType.class)
public class RequestType_ {
	public static volatile SingularAttribute<RequestType, Long> id;
	public static volatile SingularAttribute<RequestType, String> name;
	public static volatile SetAttribute<RequestType, FeeCategory> feeCategories;
	public static volatile SetAttribute<RequestType, RequestHistory> requestHistories;
	public static volatile SingularAttribute<RequestType, Boolean> isDefault;
}
