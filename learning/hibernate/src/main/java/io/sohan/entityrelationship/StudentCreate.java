package io.sohan.entityrelationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class StudentCreate{

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Sohan");
		s1.setRollNO(1);
		
		
		Student s2 = new Student();
		s2.setName("Naruto");
		s2.setRollNO(2);
		StudentIdCard c1 = new StudentIdCard();
		c1.setFirwareVersion("1.0.1");
		
		StudentIdCard c2 = new StudentIdCard();
		c2.setFirwareVersion("1.0.2");
		
		Course cc1 = new Course();
		cc1.setCourseName("Java");
		
		Course cc2 = new Course();
		cc2.setCourseName("DBMS");
		
		
		// used to map the data set of the bwt the two tables 
		//from student to Idcard class
		s1.setcard(c1);
		s2.setcard(c2);
		
		// used to map the data set of the bwt the two tables 
		//from  Idcard class to student class
		c1.setStudent(s1);
		c2.setStudent(s2);
		
		
		
		s1.setCourseList(List.of(cc1,cc2));
		s2.setCourseList(List.of(cc1));		
		
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("sohan2");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(s1);
		entitymanager.persist(s2);
		entitymanager.persist(c1);
		entitymanager.persist(c2);
		entitymanager.persist(cc1);
		entitymanager.persist(cc2);
		entitytransaction.commit();
		
		
	}
}
