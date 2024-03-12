package com.india.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="examine.do",method=RequestMethod.GET)
	public String getTest(){
	System.out.println("TestController - getTest()");
	
	return "test";
	}
}
