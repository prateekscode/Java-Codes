package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLab {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		System.out.println("____Now spring conatiner is ready____");
		
		Hello ref=(Hello)ac.getBean("hello");
		ref.show();
	}
}
