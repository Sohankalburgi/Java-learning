package com.example.FirstJavaWeb.sohan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Rest Controller is used to make the API visibility in of the class
@RestController
public class FirstController {
		
	// This is the operation of the controller to make the GET API to appear
	// This will be open on localhost:8080
	// this is default api 
	@GetMapping
	public String getHelloSpringAPI()
	{
		return "Hello Spring World";
	} 
	// By this "search" or any String  in GetMapping annotation we get the sepearate web page 
	// like localhost:8080/search
	@GetMapping("search")
	public String getHelloWorld()
	{
		return "Hello World";
	}
	
	
	// In order to get in browser we need to use http://localhost:8080/searching?q=sohan 
	// annotation RequestParam is having key as q and value in string here.
	// you can change it as your wish
	@GetMapping("searching")
	public String makesearch(@RequestParam(name = "q")String value)
	{
		return value;
	}
	
	// Here in GetMapping we need to write the path {} inside this
	// Path variable web page is acessed similarly like RequestParam
	// but it is used in web search engine http://localhost:8080/searching/sohan
	@GetMapping("searching/{sohan}")
	public String usepathvariable(@PathVariable(name = "sohan")String value)
	{
		return value;
	}
	
	// path given is localhost:8080/post
	// the path can be any string
	@PostMapping(path = "post")
	public void makepost()
	{
		System.out.println("running post");
	}
}
