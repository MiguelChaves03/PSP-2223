package com.openwebinars.rest.REST_2;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong ();

	@GetMapping ("/greeting") // localhost:8080/greeting o localhost:8080/greeting?name=TEXTO
	public Greeting greeting (@RequestParam (value = "name", defaultValue = "World") String name) {
		
		return new Greeting (counter.incrementAndGet (), String.format (template, name));
		
	}
	
}
