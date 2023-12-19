package com.example.MarvelSuperheroSpringbootCrud.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.MarvelSuperheroSpringbootCrud.models.Characters;

@Repository
public interface Superherocharactersrepository extends JpaRepository<Characters,Integer> {

	// this interface does all basic CRUD operations without anything adding to it just making extends of
	// JPA respository
}
