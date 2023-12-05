package io.sohan;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class pokemoninitator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pokemon p1 = new pokemon();
		p1.setName("pikachu");
		p1.setType("Electric");
		p1.setPower("thunderBoult");
		p1.setId(1);
		p1.setLevel(56);
		
		pokemon p2 = new pokemon();
		p2.setName("charizod");
		p2.setPower("Flame throw");
		p2.setType("Fire");
		p2.setLevel(100);
		p2.setId(2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sohan");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(p1);
		entitymanager.persist(p2);
		entitytransaction.commit();
		
		
		
	}

}
