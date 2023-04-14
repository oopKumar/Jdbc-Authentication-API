package com.oop.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h3>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome user</h3>";
	}

	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome </h3>";
	}

	
	
	
	

}
