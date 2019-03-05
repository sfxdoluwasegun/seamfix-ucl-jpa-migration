package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.250+0100")
@StaticMetamodel(VerificationTag.class)
public class VerificationTag_ {
	public static volatile SingularAttribute<VerificationTag, Long> id;
	public static volatile SingularAttribute<VerificationTag, Boolean> authentic;
	public static volatile SingularAttribute<VerificationTag, String> comment;
	public static volatile SingularAttribute<VerificationTag, Boolean> completed;
	public static volatile SingularAttribute<VerificationTag, Timestamp> date;
	public static volatile SingularAttribute<VerificationTag, String> degree;
	public static volatile SingularAttribute<VerificationTag, String> department;
	public static volatile SingularAttribute<VerificationTag, String> fullname;
	public static volatile SingularAttribute<VerificationTag, String> graduation;
	public static volatile SingularAttribute<VerificationTag, Boolean> posted;
	public static volatile SingularAttribute<VerificationTag, String> sex;
	public static volatile SingularAttribute<VerificationTag, String> type;
	public static volatile SetAttribute<VerificationTag, SignedDocument> signedDocuments;
	public static volatile SingularAttribute<VerificationTag, Admin> admin;
	public static volatile SingularAttribute<VerificationTag, VerificationHistory> verificationHistory;
	public static volatile SingularAttribute<VerificationTag, Timestamp> dispatched;
}
