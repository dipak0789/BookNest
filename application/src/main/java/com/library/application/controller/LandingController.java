package com.library.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {
	
	@GetMapping("/index")
	public String showLandingPage() {
		return "index";
	}
	
	

}
