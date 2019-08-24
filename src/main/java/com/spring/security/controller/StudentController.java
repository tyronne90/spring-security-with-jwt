package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/")
	public String home() {
		return "Hello everybody!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin!";
	}
	
	@GetMapping("/any")
	public String any() {
		return "Hello Admin and User!";
	}

}
