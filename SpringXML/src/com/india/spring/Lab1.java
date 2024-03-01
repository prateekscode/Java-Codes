package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("india.xml");
		System.out.println("Spring Container is ready...");
		Hello h=(Hello)ctx.getBean("hello");
		Hello h1=(Hello)ctx.getBean("hello");
		
		Hello h2=(Hello)ctx.getBean("hello1");
		System.out.println(h==h1);
		System.out.println(h2==h1);
		h.show();
	}

}
