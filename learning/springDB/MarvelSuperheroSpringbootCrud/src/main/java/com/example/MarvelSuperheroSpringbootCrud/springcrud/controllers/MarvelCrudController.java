package com.example.MarvelSuperheroSpringbootCrud.springcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MarvelSuperheroSpringbootCrud.models.Characters;
import com.example.MarvelSuperheroSpringbootCrud.springcrud.services.CRUDservice;

// controller is used to call the API
@RestController
public class MarvelCrudController {
	
	//CRUD
	// Create API endpoint - POST
	
	@Autowired
	CRUDservice crudservice; 
	
	@PostMapping(path = "create")
	public void createCharacter(@RequestBody Characters superhero)
	{
			crudservice.createSuperhero(superhero);
	}
	
	
	// localhost:8080/read?id=1
	@GetMapping(path = "read")
	public Characters ReadSuperheroById(@RequestParam(name = "id") int val)
	{
		return crudservice.Readsuperherobyid(val);
	}
	
	@PutMapping(path = "update")
	public void Updateherobyid(@RequestParam Characters superhero,@RequestParam(name = "id") int id)
	{
		crudservice.updateherobyId(superhero,id);
	}
	
	@DeleteMapping(path = "delete")
	public void deleteherobyId(@RequestParam(name = "id") int id)
	{
		crudservice.deletesuperhero(id);
	}

}
