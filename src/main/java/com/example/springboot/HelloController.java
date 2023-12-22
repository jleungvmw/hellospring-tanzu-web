package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Greetings from Spring Boot + Tanzu!!");
		return "Hello Spring Boot + Tanzu!!";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Tanzu!!";
	}

}