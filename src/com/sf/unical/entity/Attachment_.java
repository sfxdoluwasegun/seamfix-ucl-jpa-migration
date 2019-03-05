package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.817+0100")
@StaticMetamodel(Attachment.class)
public class Attachment_ {
	public static volatile SingularAttribute<Attachment, Long> id;
	public static volatile SingularAttribute<Attachment, String> description;
	public static volatile SingularAttribute<Attachment, byte[]> document;
	public static volatile SingularAttribute<Attachment, String> name;
	public static volatile SingularAttribute<Attachment, VerificationHistory> verificationHistory;
}
