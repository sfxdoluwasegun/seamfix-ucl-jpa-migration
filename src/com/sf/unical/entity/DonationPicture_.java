package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.890+0100")
@StaticMetamodel(DonationPicture.class)
public class DonationPicture_ {
	public static volatile SingularAttribute<DonationPicture, Long> id;
	public static volatile SingularAttribute<DonationPicture, byte[]> image;
	public static volatile SetAttribute<DonationPicture, DonationItem> donationItems;
}
