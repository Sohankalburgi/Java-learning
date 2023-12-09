package io.sohan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sohan");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		pokemon p =entitymanager.find(pokemon.class ,"pikachu");
		
		
		System.out.println(p.toString());
		
		if(p!=null)
		{
			p.setPower("Agility");
			
			entitytransaction.begin();
			entitymanager.persist(p);
			entitytransaction.commit();
		}
		else {
			System.out.println("ENTRY DOESN'T EXISTS");
		}
	}

}
