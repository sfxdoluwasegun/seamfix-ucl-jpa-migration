package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-12T12:15:55.200+0100")
@StaticMetamodel(ProficiencyRequest.class)
public class ProficiencyRequest_ {
	public static volatile SingularAttribute<ProficiencyRequest, Long> id;
	public static volatile SingularAttribute<ProficiencyRequest, Boolean> standAlone;
	public static volatile SingularAttribute<ProficiencyRequest, String> emailAddress;
	public static volatile SingularAttribute<ProficiencyRequest, Boolean> treated;
	public static volatile SingularAttribute<ProficiencyRequest, Double> bill;
	public static volatile SingularAttribute<ProficiencyRequest, RequestHistory> requestHistory;
}
