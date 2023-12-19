package com.example.MarvelSuperheroSpringbootCrud.springcrud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarvelSuperheroSpringbootCrud.models.Characters;
import com.example.MarvelSuperheroSpringbootCrud.springcrud.repositories.Superherocharactersrepository;

// the annotation service and annotation component are almost same
@Service
public class CRUDservice {
	
	// the service layer is controlled by repository layer(JPA layer) so dependency of JPA layer is injected using 
	//Autowired annotations
	@Autowired
	Superherocharactersrepository superherocharacterrespository;
	
	// this create the character
	public void createSuperhero(Characters character)
	{
		superherocharacterrespository.save(character);
	}
	
	// get is use to take entire object
	public Characters Readsuperherobyid(int val)
	{
		return superherocharacterrespository.findById(val).get();
	}
	
	// this is to update the db
	public void updateherobyId(Characters superhero,int val) {
		Characters superherotobeUpdate = Readsuperherobyid(val);
		superherotobeUpdate.setHumanName(superhero.getHumanName());
		createSuperhero(superherotobeUpdate);
	}

	public void deletesuperhero(int id) {
		// TODO Auto-generated method stub
		superherocharacterrespository.delete(Readsuperherobyid(id));
	}
}
