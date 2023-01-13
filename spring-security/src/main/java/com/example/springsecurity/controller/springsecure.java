package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springsecure {
	@Autowired
	
	@GetMapping("/")
	public String welcome()
	{
		return ("<h1> welcome </h1>");
	}

}
