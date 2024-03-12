package com.india.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raj.spring.Hello;

@Controller
public class TestController {
	
	@Autowired
	Hello hello;

	@RequestMapping(value = "examine.do", method = RequestMethod.GET)
	public String getTest() {
		System.out.println("TestController - getTest()");
		System.out.println(hello.show());
		
		return "test";
	}

}
