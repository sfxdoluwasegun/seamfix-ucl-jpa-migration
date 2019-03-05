package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.838+0100")
@StaticMetamodel(BasisOfAdmission.class)
public class BasisOfAdmission_ {
	public static volatile SingularAttribute<BasisOfAdmission, Long> id;
	public static volatile SingularAttribute<BasisOfAdmission, String> institution;
	public static volatile SingularAttribute<BasisOfAdmission, String> qualification;
	public static volatile SingularAttribute<BasisOfAdmission, String> year;
	public static volatile SingularAttribute<BasisOfAdmission, Alumni> alumni;
}
