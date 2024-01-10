package com.spring.ioc;

public class Delhivery implements LogisticsCompany{
	
	Delhivery() {
		System.out.println("Constructor Called");
	}
	
	@Override
	public void deliverOrder() {
		System.out.println("Order deliver by Delhivery");		
	}
	@Override
	public void returnRequest() {
		System.out.println("Order return rquested by Delhivery");
	}
	@Override
	public void trackOrder() {
		System.out.println("Order Status by delhivery");
	}
	
}
