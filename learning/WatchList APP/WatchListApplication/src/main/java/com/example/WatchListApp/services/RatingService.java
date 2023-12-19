package com.example.WatchListApp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RatingService {
	String apiUrl = "https://www.omdbapi.com/?apikey=a8431cee&t=";
	
	public String getMovieRating(String title)
	{
		try {
			RestTemplate template = new RestTemplate();
			//apiUrl +title
			
			ResponseEntity<ObjectNode> response = template.getForEntity(apiUrl+title,ObjectNode.class);
			
			ObjectNode JSONObject = response.getBody();
			
			return JSONObject.path("imdbRating").asText();
		}
		catch(Exception e)
		{
			System.out.println("Either Movie is not available or API is down"+e.getMessage());
			return null;
		}
		
	}
	
	
}
