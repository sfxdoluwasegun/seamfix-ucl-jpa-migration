package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-11T21:06:48.265+0100")
@StaticMetamodel(CertificateRequest.class)
public class CertificateRequest_ {
	public static volatile SingularAttribute<CertificateRequest, Long> id;
	public static volatile SingularAttribute<CertificateRequest, RequestHistory> requestHistory;
	public static volatile SingularAttribute<CertificateRequest, String> graduatingYear;
	public static volatile SingularAttribute<CertificateRequest, String> degreeClass;
}
