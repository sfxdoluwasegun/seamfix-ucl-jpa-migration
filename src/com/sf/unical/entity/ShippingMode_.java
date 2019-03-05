package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.217+0100")
@StaticMetamodel(ShippingMode.class)
public class ShippingMode_ {
	public static volatile SingularAttribute<ShippingMode, Long> id;
	public static volatile SingularAttribute<ShippingMode, String> description;
	public static volatile SingularAttribute<ShippingMode, String> email;
	public static volatile SingularAttribute<ShippingMode, Boolean> local;
	public static volatile SingularAttribute<ShippingMode, String> name;
	public static volatile SingularAttribute<ShippingMode, String> tracer;
	public static volatile SetAttribute<ShippingMode, RequestHistory> requestHistories;
	public static volatile SetAttribute<ShippingMode, ShippingOption> shippingOptions;
}
