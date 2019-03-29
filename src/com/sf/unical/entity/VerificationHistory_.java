package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T13:05:57.663+0100")
@StaticMetamodel(VerificationHistory.class)
public class VerificationHistory_ {
	public static volatile SingularAttribute<VerificationHistory, Long> id;
	public static volatile SingularAttribute<VerificationHistory, String> approvalCode;
	public static volatile SingularAttribute<VerificationHistory, String> comment;
	public static volatile SingularAttribute<VerificationHistory, Timestamp> date;
	public static volatile SingularAttribute<VerificationHistory, String> department;
	public static volatile SingularAttribute<VerificationHistory, String> firstname;
	public static volatile SingularAttribute<VerificationHistory, String> maidenName;
	public static volatile SingularAttribute<VerificationHistory, String> matricNo;
	public static volatile SingularAttribute<VerificationHistory, String> middleName;
	public static volatile SingularAttribute<VerificationHistory, String> mode;
	public static volatile SingularAttribute<VerificationHistory, String> passcode;
	public static volatile SingularAttribute<VerificationHistory, Timestamp> payDate;
	public static volatile SingularAttribute<VerificationHistory, String> phone;
	public static volatile SingularAttribute<VerificationHistory, String> referenceNo;
	public static volatile SingularAttribute<VerificationHistory, Boolean> referred;
	public static volatile SingularAttribute<VerificationHistory, String> responseCode;
	public static volatile SingularAttribute<VerificationHistory, String> sessionId;
	public static volatile SingularAttribute<VerificationHistory, String> surname;
	public static volatile SingularAttribute<VerificationHistory, String> switchResponse;
	public static volatile SingularAttribute<VerificationHistory, String> uniqueId;
	public static volatile SingularAttribute<VerificationHistory, String> xmlResponse;
	public static volatile SingularAttribute<VerificationHistory, String> zip;
	public static volatile SetAttribute<VerificationHistory, Attachment> attachments;
	public static volatile SetAttribute<VerificationHistory, SettlementTrail> settlementTrails;
	public static volatile SingularAttribute<VerificationHistory, Alumni> alumni;
	public static volatile SingularAttribute<VerificationHistory, Organization> organization;
	public static volatile SingularAttribute<VerificationHistory, VerificationBatch> verificationBatch;
	public static volatile SetAttribute<VerificationHistory, VerificationTag> verificationTags;
	public static volatile SingularAttribute<VerificationHistory, String> certificateRegNo;
	public static volatile SingularAttribute<VerificationHistory, String> verificationRequestMode;
}
