package io.sohan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexinitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sohan");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		pokemon p1 =entitymanager.find(pokemon.class ,"Meowth"); // fetch
		
		// to delete the row in database
		if(p1!=null)
		{
			entitytransaction.begin();
			entitymanager.remove(p1);
			entitytransaction.commit();
		}
		
	}

}
