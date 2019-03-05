package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.239+0100")
@StaticMetamodel(VerificationBatch.class)
public class VerificationBatch_ {
	public static volatile SingularAttribute<VerificationBatch, Long> id;
	public static volatile SingularAttribute<VerificationBatch, Double> amount;
	public static volatile SingularAttribute<VerificationBatch, String> approvalCode;
	public static volatile SingularAttribute<VerificationBatch, Timestamp> date;
	public static volatile SingularAttribute<VerificationBatch, String> mode;
	public static volatile SingularAttribute<VerificationBatch, String> referenceNo;
	public static volatile SingularAttribute<VerificationBatch, String> respcode;
	public static volatile SingularAttribute<VerificationBatch, String> sessionId;
	public static volatile SingularAttribute<VerificationBatch, String> status;
	public static volatile SingularAttribute<VerificationBatch, String> switchresp;
	public static volatile SingularAttribute<VerificationBatch, String> xmlresp;
	public static volatile SetAttribute<VerificationBatch, SettlementTrail> settlementTrails;
	public static volatile SetAttribute<VerificationBatch, VerificationHistory> verificationHistories;
}
