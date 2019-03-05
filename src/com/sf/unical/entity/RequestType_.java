package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.143+0100")
@StaticMetamodel(RequestType.class)
public class RequestType_ {
	public static volatile SingularAttribute<RequestType, Long> id;
	public static volatile SingularAttribute<RequestType, String> name;
	public static volatile SetAttribute<RequestType, FeeCategory> feeCategories;
	public static volatile SetAttribute<RequestType, RequestHistory> requestHistories;
}
