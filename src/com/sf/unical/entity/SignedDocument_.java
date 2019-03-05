package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.230+0100")
@StaticMetamodel(SignedDocument.class)
public class SignedDocument_ {
	public static volatile SingularAttribute<SignedDocument, Long> id;
	public static volatile SingularAttribute<SignedDocument, Timestamp> date;
	public static volatile SingularAttribute<SignedDocument, String> description;
	public static volatile SingularAttribute<SignedDocument, byte[]> document;
	public static volatile SingularAttribute<SignedDocument, String> ext;
	public static volatile SingularAttribute<SignedDocument, String> name;
	public static volatile SingularAttribute<SignedDocument, VerificationTag> verificationTag;
}
