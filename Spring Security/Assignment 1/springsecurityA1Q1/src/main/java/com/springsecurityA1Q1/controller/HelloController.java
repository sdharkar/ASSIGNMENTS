package com.springsecurityA1Q1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World!!!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin..";
	}
}
