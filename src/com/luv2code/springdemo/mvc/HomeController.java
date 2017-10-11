package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Step 1
public class HomeController {
		
	@RequestMapping("/") // Step 3
	public String showPage() { // Step 2
		return "main-menu"; // Step 4 
	}

}
