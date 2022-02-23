package springMVCAssignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String HelloWorld() {
		System.out.println("This is the Hello world URL");
		return "helloWorld";
		
	}

}
