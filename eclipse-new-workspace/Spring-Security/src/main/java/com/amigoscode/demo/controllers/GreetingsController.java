package com.amigoscode.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
	
	@GetMapping
	public ResponseEntity<String> sayHello()
	{
		return ResponseEntity.ok("Hello from our API");
		
	}
	
	@GetMapping("/say-good-bye")
	public ResponseEntity<String> sayGoodBye()
	{
		return ResponseEntity.ok("Good bye see you later");
	}

}
