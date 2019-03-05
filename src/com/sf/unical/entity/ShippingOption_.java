package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.225+0100")
@StaticMetamodel(ShippingOption.class)
public class ShippingOption_ {
	public static volatile SingularAttribute<ShippingOption, Long> id;
	public static volatile SingularAttribute<ShippingOption, Double> amount;
	public static volatile SingularAttribute<ShippingOption, String> duration;
	public static volatile SingularAttribute<ShippingOption, Boolean> local;
	public static volatile SetAttribute<ShippingOption, FeeBreakdown> feeBreakdowns;
	public static volatile SingularAttribute<ShippingOption, ShippingContinent> shippingContinent;
	public static volatile SingularAttribute<ShippingOption, ShippingMode> shippingMode;
}
