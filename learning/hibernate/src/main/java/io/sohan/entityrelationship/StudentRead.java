package io.sohan.entityrelationship;

import javax.persistence.*;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sohan2");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Student ele =em.find(Student.class,1);
//		
//		System.out.println(ele.toString());
		
		StudentIdCard ele1 = em.find(StudentIdCard.class,1);
		
		System.out.println(ele1.getStudent().getName()+" "+ele1.getCardNumber()+" "+ele1.getFirwareVersion());
		
		
	}

}
