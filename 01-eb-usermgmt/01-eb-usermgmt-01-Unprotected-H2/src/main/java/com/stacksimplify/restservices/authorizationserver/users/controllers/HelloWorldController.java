package com.stacksimplify.restservices.authorizationserver.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.authorizationserver.users.entities.SimpleMessage;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String simpleHello() {
		return "Hello World - V3";
	}
	
	
	@GetMapping("/hello-bean")
	public SimpleMessage helloBean() {
		return new SimpleMessage("Hello World Bean", "V3");
	}
	
	
}
