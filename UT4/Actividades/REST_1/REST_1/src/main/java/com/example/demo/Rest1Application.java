package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Rest1Application {

	public static void main (String [] args) {
		
		SpringApplication.run (Rest1Application.class, args);
		
	}
	
	@Bean
	public CommandLineRunner lombokTest () {
		
		return args -> {
			
			System.out.println ("");

			Persona p1 = new Persona ();
			
			p1.setDni ("12345678A");
			p1.setNombre ("Pepe");
			p1.setApellidos ("Perez");
			
			System.out.println (p1);
			
			System.out.println ("");

			Persona p2 = new Persona ("12345678A", "Paco", "Perez");
			
			System.out.println (p2);
			
			System.out.println ("");
			
			if (p1.equals (p2)) {
				
				System.out.println ("Ambas personas son iguales");
				
			} else {
				
				System.out.println ("Las dos personas no son iguales");
				
			}
			
		};
		
	}

}
