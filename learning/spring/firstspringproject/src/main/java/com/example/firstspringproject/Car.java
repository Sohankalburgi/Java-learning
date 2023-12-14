package com.example.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// the component annotation makes the class Car as factory
@Component
// The Scope will make the instance to be created once-"singleton" or multiple as created ="prototype"
@Scope(scopeName = "prototype")
public class Car {
		
	private String name="Bugati";
	private String color="Yellow";
	
	Car()
	{
		System.out.println("The Car is manufacturing");
	}
	
	// Inject the Engine class factory which is component by wiring to the car class
	// to inject the dependency we use AutoWired 
	@Autowired
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
