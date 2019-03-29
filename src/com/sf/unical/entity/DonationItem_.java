package com.sf.unical.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.885+0100")
@StaticMetamodel(DonationItem.class)
public class DonationItem_ {
	public static volatile SingularAttribute<DonationItem, Long> id;
	public static volatile SingularAttribute<DonationItem, Double> amount;
	public static volatile SingularAttribute<DonationItem, Timestamp> created;
	public static volatile SingularAttribute<DonationItem, Boolean> deactivated;
	public static volatile SingularAttribute<DonationItem, Boolean> defaultItem;
	public static volatile SingularAttribute<DonationItem, String> description;
	public static volatile SingularAttribute<DonationItem, Boolean> expired;
	public static volatile SingularAttribute<DonationItem, Date> expriy;
	public static volatile SingularAttribute<DonationItem, String> name;
	public static volatile SingularAttribute<DonationItem, Integer> priority;
	public static volatile SetAttribute<DonationItem, DonationHistory> donationHistories;
	public static volatile SingularAttribute<DonationItem, DonationPicture> donationPicture;
}
