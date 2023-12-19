package com.example.WatchListApp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.WatchListApp.entity.Movie;
import com.example.WatchListApp.services.Databaseservice;

import jakarta.validation.Valid;

@RestController
public class MovieController {
	
	@Autowired
	Databaseservice databaseservice;
	
	
	// the url name below 
	@GetMapping(path = "/watchlistitemform")
	public ModelAndView showWatchListForm(@RequestParam (required = false) Integer id)
	{
		
		System.out.println(id);
		
		// View Part
		// the string given is the name of the html page
		String viewName = "watchlistitemform";
		
		Map<String,Object> model = new HashMap<>();

		if(id==null)
		{
			model.put("watchlistitem",new Movie());
		}
		else {
			model.put("watchlistitem",databaseservice.getmoviebyId(id));
		}
		
		// this is how the created object is there on dynamic web page
//		Movie dummyMovie = new Movie();
//		dummyMovie.setTitle("dummy");
//		dummyMovie.setRating(0);
//		dummyMovie.setPriority("Low");
//		dummyMovie.setComment("No use");
//		model.put("watchlistitem",dummyMovie);
		
		
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping(path = "/watchlistitemform")
	public ModelAndView submitWatchListForm(@Valid @ModelAttribute("watchlistitem") Movie movie,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("watchlistitemform");
		}
		Integer id = movie.getId();
		if(id==null)
		{
			databaseservice.create(movie);
		}
		else {
			databaseservice.update(movie,id);
		}
		
		
		RedirectView rd = new RedirectView();
		rd.setUrl("/watchlist");
		
		return new ModelAndView(rd);
	}
	
	@GetMapping(path ="/watchlist")
	public ModelAndView getWatchList() {
		
		String viewName = "WatchList";
		
		Map<String,Object> model = new HashMap<String, Object>();
		List<Movie> allMovies = databaseservice.getAllmovies();
		model.put("watchlistrows",allMovies);
		model.put("noofmovies",allMovies.size());
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping(path="/index")
	public ModelAndView getHomepage()
	{
		String viewName = "index";
		return new ModelAndView(viewName);
	}
	
}
