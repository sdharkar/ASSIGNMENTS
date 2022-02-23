package com.springsecurityA2Q2.springsecurityA2Q2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "Welcome Hompage!!!";
	}
	@RequestMapping("/user")
	public String user() {
		return "Welcome User!!!!";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome Admin!!!!";
	}
}
