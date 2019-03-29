package com.sf.unical.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-05T11:40:39.998+0100")
@StaticMetamodel(ProfessionalExam.class)
public class ProfessionalExam_ {
	public static volatile SingularAttribute<ProfessionalExam, Long> id;
	public static volatile SingularAttribute<ProfessionalExam, String> asession;
	public static volatile SingularAttribute<ProfessionalExam, Boolean> disqualified;
	public static volatile SingularAttribute<ProfessionalExam, String> evaluation;
	public static volatile SingularAttribute<ProfessionalExam, String> grade;
	public static volatile SingularAttribute<ProfessionalExam, String> month;
	public static volatile SingularAttribute<ProfessionalExam, String> name;
	public static volatile SingularAttribute<ProfessionalExam, Boolean> resit;
	public static volatile SingularAttribute<ProfessionalExam, String> score;
	public static volatile SetAttribute<ProfessionalExam, ProfessionalCours> professionalCourses;
	public static volatile SingularAttribute<ProfessionalExam, Alumni> alumni;
}
