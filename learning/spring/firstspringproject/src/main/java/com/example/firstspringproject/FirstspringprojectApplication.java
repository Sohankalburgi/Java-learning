package com.example.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstspringprojectApplication {

	public static void main(String[] args) {
		
		// the context saves the instance of entire application
		ConfigurableApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);
		
		
		// we fetched the factory class which is annotated as @Component using getBean as spring stores it in Beans
		// to avoid multiple creation of the object instance of the class this is done
		Car c1 = context.getBean(Car.class);
		System.out.println(c1.getName());
		System.out.println(c1.getEngine().getEngine()); // The Engine is autowired so no necessary to create the object engine
		
		Car c2 = context.getBean(Car.class);
		System.out.println(c2.getName());
		
		Car c3 = context.getBean(Car.class);
		System.out.println(c3.getName());
		
		// In order to create only one multiple objects using the spring boot with help of Beans we
		// need to use the annotation @Scope with and run the above 
		// By default the scope will be "singleton" which means there is only one instance
		
//		Car c1 = new Car();
//		Engine engine1 = new Engine();
//		c1.setEngine(engine1);	
		
		
		}

}
