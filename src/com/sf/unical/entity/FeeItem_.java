package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.906+0100")
@StaticMetamodel(FeeItem.class)
public class FeeItem_ {
	public static volatile SingularAttribute<FeeItem, Long> id;
	public static volatile SingularAttribute<FeeItem, String> name;
	public static volatile SetAttribute<FeeItem, FeeBreakdown> feeBreakdowns;
}
