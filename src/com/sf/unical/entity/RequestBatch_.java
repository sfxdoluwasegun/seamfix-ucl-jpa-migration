package com.sf.unical.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:40.014+0100")
@StaticMetamodel(RequestBatch.class)
public class RequestBatch_ {
	public static volatile SingularAttribute<RequestBatch, Long> id;
	public static volatile SingularAttribute<RequestBatch, Date> date;
	public static volatile SingularAttribute<RequestBatch, Boolean> paid;
	public static volatile SingularAttribute<RequestBatch, Date> payDate;
	public static volatile SetAttribute<RequestBatch, PayHistory> payHistories;
	public static volatile SetAttribute<RequestBatch, RequestHistory> requestHistories;
}
