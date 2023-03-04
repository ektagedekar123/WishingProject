package com.Bikkad.MySecondJenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/wish")
	public String greet()
	{
		return "Good Morning";
	}

}
