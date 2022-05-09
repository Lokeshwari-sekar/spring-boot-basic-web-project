package com.example.demo.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Component
public class HelloSpringBoot {
	
	@GetMapping("/")
	public String display()
	{
		System.out.println("hello");
		return "Hello Spring Boot";
		
	}

}
