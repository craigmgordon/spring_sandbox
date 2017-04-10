package com.craigmgordon.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String testMapping(){
		return "In testMapping() method";
	}
	
}
