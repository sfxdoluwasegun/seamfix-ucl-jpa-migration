package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.202+0100")
@StaticMetamodel(SettlementTrail.class)
public class SettlementTrail_ {
	public static volatile SingularAttribute<SettlementTrail, Long> id;
	public static volatile SingularAttribute<SettlementTrail, String> accountNo;
	public static volatile SingularAttribute<SettlementTrail, Double> amount;
	public static volatile SingularAttribute<SettlementTrail, String> bank;
	public static volatile SingularAttribute<SettlementTrail, String> creditor;
	public static volatile SingularAttribute<SettlementTrail, DonationHistory> donationHistory;
	public static volatile SingularAttribute<SettlementTrail, PayHistory> payHistory;
	public static volatile SingularAttribute<SettlementTrail, VerificationBatch> verificationBatch;
	public static volatile SingularAttribute<SettlementTrail, VerificationHistory> verificationHistory;
	public static volatile SingularAttribute<SettlementTrail, Double> proficiencyAmount;
}
