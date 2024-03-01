package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		System.out.println("-------Now, Spring Container is Ready-------");
		
		Customer cust=(Customer)ac.getBean("mycust");
		System.out.println(cust);
		System.out.println(cust.getEmails());
		System.out.println(cust.getPhones());
		System.out.println(cust.getRefs());
		System.out.println(cust.getAddress());
		
		for(Account acc:cust.getAccounts()) {
			System.out.println(acc);
		}
	}

}
