package com.example.firstspringproject;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String engine="V8";
	private int cc = 2000;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
