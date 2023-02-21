package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Valueannotation {
	@Value("${than.page}")
	private String msg;
	@GetMapping("/day2")
	public String getName()
	{
		return "Welcome to this "+msg;
	}
}
