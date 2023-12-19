package com.example.WatchListApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WatchListApp.Repository.MovieRepository;
import com.example.WatchListApp.entity.Movie;

@Service
public class Databaseservice {

	@Autowired
	MovieRepository movieRepo;
	
	@Autowired
	RatingService ratingservice;
	
	// create 
	public void create(Movie movie)
	{
		String ratingString = ratingservice.getMovieRating(movie.getTitle());
		if(ratingString!="")
		{
			movie.setRating(Float.parseFloat(ratingString));
		}
		
		movieRepo.save(movie);
	}
	
	//to get all rows in DB
	public List<Movie> getAllmovies()
	{
		return movieRepo.findAll();
	}
	
	@SuppressWarnings("deprecation")
	public Movie getmoviebyId(int id)
	{
		return movieRepo.getById(id);
	}

	public void update(Movie movie, Integer id) {
		// TODO Auto-generated method stub
		Movie tobeUpdated = getmoviebyId(id);
		tobeUpdated.setTitle(movie.getTitle());
		tobeUpdated.setPriority(movie.getPriority());
		tobeUpdated.setRating(movie.getRating());
		tobeUpdated.setComment(movie.getComment());
		
		movieRepo.save(tobeUpdated);
		
	}
}
