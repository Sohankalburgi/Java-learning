package io.sohan;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sohan");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		pokemon p =entitymanager.find(pokemon.class ,"pikachu");
		System.out.println(p.toString());
		
	}

}
