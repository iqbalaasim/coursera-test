package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hello World");
		return "index";
	}
	
	@RequestMapping("/diff")
	public String foo(Model m) {
		
		m.addAttribute("name","Aasim");
		m.addAttribute("Roll",6574);
	
	return "hello";
		
		
	}

}
