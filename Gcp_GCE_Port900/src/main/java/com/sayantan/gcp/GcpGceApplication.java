package com.sayantan.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpGceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpGceApplication.class, args);
	}
	
	@GetMapping("/name")
	public String getMyName(){
		return "I am Sayantan Chatterjee";
	}

}
