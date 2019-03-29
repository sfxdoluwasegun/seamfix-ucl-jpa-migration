package com.sf.unical.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.801+0100")
@StaticMetamodel(Alumni.class)
public class Alumni_ {
	public static volatile SingularAttribute<Alumni, Long> id;
	public static volatile SingularAttribute<Alumni, String> admissionSession;
	public static volatile SingularAttribute<Alumni, Boolean> archive;
	public static volatile SingularAttribute<Alumni, String> campus;
	public static volatile SingularAttribute<Alumni, String> department;
	public static volatile SingularAttribute<Alumni, Boolean> digitized;
	public static volatile SingularAttribute<Alumni, String> dob;
	public static volatile SingularAttribute<Alumni, String> email;
	public static volatile SingularAttribute<Alumni, String> faculty;
	public static volatile SingularAttribute<Alumni, String> firstname;
	public static volatile SingularAttribute<Alumni, String> graduationDate;
	public static volatile SingularAttribute<Alumni, String> guardian;
	public static volatile SingularAttribute<Alumni, String> guardianAddress;
	public static volatile SingularAttribute<Alumni, String> lga;
	public static volatile SingularAttribute<Alumni, String> matricNo;
	public static volatile SingularAttribute<Alumni, Boolean> mbbs;
	public static volatile SingularAttribute<Alumni, String> middleName;
	public static volatile SingularAttribute<Alumni, String> nationality;
	public static volatile SingularAttribute<Alumni, Long> orbitaId;
	public static volatile SingularAttribute<Alumni, Boolean> pharmacy;
	public static volatile SingularAttribute<Alumni, String> pob;
	public static volatile SingularAttribute<Alumni, String> program;
	public static volatile SingularAttribute<Alumni, String> remarks;
	public static volatile SingularAttribute<Alumni, String> sex;
	public static volatile SingularAttribute<Alumni, String> state;
	public static volatile SingularAttribute<Alumni, String> studentType;
	public static volatile SingularAttribute<Alumni, String> surname;
	public static volatile SingularAttribute<Alumni, Timestamp> synchDate;
	public static volatile SingularAttribute<Alumni, String> tokenSecret;
	public static volatile SingularAttribute<Alumni, String> transfers;
	public static volatile SingularAttribute<Alumni, String> twitterToken;
	public static volatile SingularAttribute<Alumni, String> validator;
	public static volatile SingularAttribute<Alumni, Boolean> veterinary;
	public static volatile SingularAttribute<Alumni, Doc> doc;
	public static volatile SingularAttribute<Alumni, Passport> passport;
	public static volatile SingularAttribute<Alumni, Result> result;
	public static volatile SetAttribute<Alumni, BasisOfAdmission> basisOfAdmissions;
	public static volatile SetAttribute<Alumni, DiplomaCours> diplomaCourses;
	public static volatile SetAttribute<Alumni, OLevel> OLevels;
	public static volatile SetAttribute<Alumni, ProfessionalExam> professionalExams;
	public static volatile SetAttribute<Alumni, RequestPassport> requestPassports;
	public static volatile SetAttribute<Alumni, ResultHistory> resultHistories;
	public static volatile SetAttribute<Alumni, SupportLog> supportLogs;
	public static volatile SetAttribute<Alumni, VerificationHistory> verificationHistories;
}
