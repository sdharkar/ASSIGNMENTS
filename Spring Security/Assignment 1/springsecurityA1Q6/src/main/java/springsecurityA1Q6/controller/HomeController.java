package springsecurityA1Q6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hello this is the Homepage..";
	}
	@GetMapping("/user")
	public String user() {
		return "Hello User.";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin.";
	}

}

