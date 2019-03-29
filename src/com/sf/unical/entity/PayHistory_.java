package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.961+0100")
@StaticMetamodel(PayHistory.class)
public class PayHistory_ {
	public static volatile SingularAttribute<PayHistory, Long> id;
	public static volatile SingularAttribute<PayHistory, Double> amount;
	public static volatile SingularAttribute<PayHistory, String> approvalCode;
	public static volatile SingularAttribute<PayHistory, Timestamp> date;
	public static volatile SingularAttribute<PayHistory, String> description;
	public static volatile SingularAttribute<PayHistory, String> mode;
	public static volatile SingularAttribute<PayHistory, String> name;
	public static volatile SingularAttribute<PayHistory, String> referenceNo;
	public static volatile SingularAttribute<PayHistory, String> responseCode;
	public static volatile SingularAttribute<PayHistory, String> sessionId;
	public static volatile SingularAttribute<PayHistory, String> status;
	public static volatile SingularAttribute<PayHistory, String> switchResponse;
	public static volatile SingularAttribute<PayHistory, String> xmlResponse;
	public static volatile SingularAttribute<PayHistory, FeeBreakdown> feeBreakdown;
	public static volatile SingularAttribute<PayHistory, RequestBatch> requestBatch;
	public static volatile SingularAttribute<PayHistory, RequestPassport> requestPassport;
	public static volatile SetAttribute<PayHistory, SettlementTrail> settlementTrails;
}
