package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LabC {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Hello h=(Hello)ctx.getBean("Mhello");
		h.show();
		
	}
}
