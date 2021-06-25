package com.example.demo.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	
	@GetMapping("/Hi")
	public String hi() {
		return"<h1>Hello Spirng Security</h1>";
	}

}
