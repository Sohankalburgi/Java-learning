package com.example.WatchListApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchListApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatchListApplication.class, args);
		// Spring automatically renders the static web page without any Controllers
		// without any controllers the spring displays the index.html file which is static 
		
	}

}
