package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LabB {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("****NOW SPRING CONTAINER IS READY****");
		A a = (A) ctx.getBean("createA");
		System.out.println(a);
		
		B b=(B) ctx.getBean("BO");
		System.out.println(b);
		
		Hello h=(Hello) ctx.getBean("Mhello");
		Hello h1=(Hello) ctx.getBean("Mhello");
		System.out.println(h==h1);
		System.out.println(h);
		
		a.m1();
		b.m2();
	}
}
