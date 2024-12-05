package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
@postMapping("/save-Product)
public String saveProduct()
	{

return "product will be save later";
		
	}
	
	@GetMapping("/get-Product")
	public List allProduct()
	{
		
		return new ArrayList<>();	
		
	}
}
