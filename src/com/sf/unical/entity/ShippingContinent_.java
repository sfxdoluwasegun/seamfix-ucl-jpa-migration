package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-21T10:56:12.457+0100")
@StaticMetamodel(ShippingContinent.class)
public class ShippingContinent_ {
	public static volatile SingularAttribute<ShippingContinent, Long> id;
	public static volatile SingularAttribute<ShippingContinent, String> name;
	public static volatile SetAttribute<ShippingContinent, Organization> organizations;
	public static volatile SetAttribute<ShippingContinent, RequestHistory> requestHistories;
	public static volatile SetAttribute<ShippingContinent, ShippingOption> shippingOptions;
	public static volatile SetAttribute<ShippingContinent, Country> countries;
}
