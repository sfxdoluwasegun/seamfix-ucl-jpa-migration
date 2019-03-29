package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.879+0100")
@StaticMetamodel(DonationHistory.class)
public class DonationHistory_ {
	public static volatile SingularAttribute<DonationHistory, Long> id;
	public static volatile SingularAttribute<DonationHistory, String> address;
	public static volatile SingularAttribute<DonationHistory, Double> amount;
	public static volatile SingularAttribute<DonationHistory, Timestamp> date;
	public static volatile SingularAttribute<DonationHistory, String> email;
	public static volatile SingularAttribute<DonationHistory, String> mode;
	public static volatile SingularAttribute<DonationHistory, String> name;
	public static volatile SingularAttribute<DonationHistory, String> referenceNo;
	public static volatile SingularAttribute<DonationHistory, String> status;
	public static volatile SingularAttribute<DonationHistory, DonationItem> donationItem;
	public static volatile SetAttribute<DonationHistory, SettlementTrail> settlementTrails;
}
