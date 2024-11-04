package com.satya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.client.WelcomeFeignClient;

@RestController
public class GreetRestCOntroller {
	
	@Autowired
	private WelcomeFeignClient welcomeFeignClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String welcomeMsg = welcomeFeignClient.getWelcomeMsg();
		String greetMsg = "Good Morning..!!";
		return welcomeMsg + greetMsg;
	}

}
