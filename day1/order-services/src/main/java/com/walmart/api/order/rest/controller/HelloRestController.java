package com.walmart.api.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/api/instance")
	public String knowInstance() {
	
		return "Instance running on port :" + environment.getProperty("local.server.port");
	}

}
