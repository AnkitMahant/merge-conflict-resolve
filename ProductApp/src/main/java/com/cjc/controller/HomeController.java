package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	
	
	@GetMapping("/get-Product")
	public List allProduct()
	{
		
		return new ArrayList<>();	
		
	}
}
