package com.walmart.api.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloRestController {
	
	@Autowired
	private Environment environment;
	
	@Value("${organization}")
	private String company;
	
	@GetMapping("/api/instance")
	public String knowInstance() {
	
		return "Instance running on port :" + environment.getProperty("local.server.port") + " for company: " + company;
	}

}
