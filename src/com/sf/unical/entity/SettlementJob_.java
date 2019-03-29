package com.sf.unical.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.194+0100")
@StaticMetamodel(SettlementJob.class)
public class SettlementJob_ {
	public static volatile SingularAttribute<SettlementJob, Long> id;
	public static volatile SingularAttribute<SettlementJob, String> creditor;
	public static volatile SingularAttribute<SettlementJob, String> gateway;
	public static volatile SingularAttribute<SettlementJob, Timestamp> schedule;
	public static volatile SingularAttribute<SettlementJob, BigDecimal> settlement;
	public static volatile SingularAttribute<SettlementJob, Timestamp> timestamp;
	public static volatile SingularAttribute<SettlementJob, BigDecimal> total;
}
