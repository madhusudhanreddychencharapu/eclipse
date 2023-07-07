package com.madhu.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerOrgApplication.class, args);
	}

	@GetMapping("/home")
	public String getMessage()
	{
		return "you are learning the docker files";
	}
}
