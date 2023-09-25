package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.model.Model;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String Welcome(Model model) {
		return "Hey Buddy,\nWelcome TO My World!!!";
	}

}
