package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.966+0100")
@StaticMetamodel(ProfessionalCours.class)
public class ProfessionalCours_ {
	public static volatile SingularAttribute<ProfessionalCours, Long> id;
	public static volatile SingularAttribute<ProfessionalCours, String> code;
	public static volatile SingularAttribute<ProfessionalCours, String> evaluation;
	public static volatile SingularAttribute<ProfessionalCours, String> grade;
	public static volatile SingularAttribute<ProfessionalCours, String> name;
	public static volatile SingularAttribute<ProfessionalCours, String> unit;
	public static volatile SingularAttribute<ProfessionalCours, ProfessionalExam> professionalExam;
	public static volatile SingularAttribute<ProfessionalCours, Double> score;
}
