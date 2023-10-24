package com.myjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class JavaAppController {
	

	@GetMapping(path="/set1")
	public String getValue() {
		return "This is Sneha";
	}
	

}
