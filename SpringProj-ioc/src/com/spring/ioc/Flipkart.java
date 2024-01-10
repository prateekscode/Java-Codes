package com.spring.ioc;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Flipkart {
	public static void main(String[] args) {

		/*// Tightly-coupled
		LogisticsCompany l = new ShadowFax();
		l.trackOrder();
		l.returnRequest();
		System.out.println();
		
		Delhivery d = new Delhivery();
		d.deliverOrder();
		d.trackOrder();
		System.out.println();
		
		Ekart e = new Ekart();
		e.deliverOrder();
		e.returnRequest();*/

		// ApplicationContext
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application Configured");

		/*//tightly  coupled
		Delhivery delhivery=(Delhivery)ac.getBean("delhivery");
		delhivery.deliverOrder();
		System.out.println();
		
		Ekart ekart=(Ekart)ac.getBean("ekart");
		ekart.deliverOrder();
		ekart.trackOrder();*/

		// Loosely coupled
		LogisticsCompany lc=(LogisticsCompany)ac.getBean("logistics");
		lc.deliverOrder();
		lc.returnRequest();
		lc.trackOrder();
		
	}
}
