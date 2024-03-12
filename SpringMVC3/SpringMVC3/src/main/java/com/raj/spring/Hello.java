package com.raj.spring;

import org.springframework.stereotype.Service;

@Service
public class Hello {
	
	public String show() {
		return "show()===Hello";
	}

}
