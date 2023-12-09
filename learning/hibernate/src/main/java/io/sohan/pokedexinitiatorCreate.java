package io.sohan;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class pokedexinitiatorCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pokemon p1 = new pokemon();
		p1.setName("pikachu");
		p1.setType("Electric");
		p1.setPower("thunderBoult");
		p1.setLevel(56);
		p1.setColor(Color.Yellow);
		
		pokemon p2 = new pokemon();
		p2.setName("charizod");
		p2.setPower("Flame throw");
		p2.setType("Fire");
		p2.setLevel(100);
		p2.setColor(Color.Orange);
	
		
		pokemon p3 = new pokemon();
		p3.setName("Meowth");
		p3.setPower("Scratch");
		p3.setType("CAT");
		p3.setLevel(50);
		p3.setColor(Color.Peach);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sohan");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(p1);
		entitymanager.persist(p2);
		entitymanager.persist(p3);
		entitytransaction.commit();
		
		
		
	}

}
