package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.896+0100")
@StaticMetamodel(FeeBreakdown.class)
public class FeeBreakdown_ {
	public static volatile SingularAttribute<FeeBreakdown, Long> id;
	public static volatile SingularAttribute<FeeBreakdown, Double> amount;
	public static volatile SingularAttribute<FeeBreakdown, FeeCategory> feeCategory;
	public static volatile SingularAttribute<FeeBreakdown, FeeItem> feeItem;
	public static volatile SingularAttribute<FeeBreakdown, ShippingOption> shippingOption;
	public static volatile SetAttribute<FeeBreakdown, PayHistory> payHistories;
}
