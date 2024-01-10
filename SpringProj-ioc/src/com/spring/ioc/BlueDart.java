package com.spring.ioc;

public class BlueDart implements LogisticsCompany{
	@Override
	public void deliverOrder() {
		System.out.println("Order deliver by BlueDart");
		
	}
	@Override
	public void returnRequest() {
		System.out.println("Return request accepted by BlueDart");
		
	}
	@Override
	public void trackOrder() {
		System.out.println("Order status by BlueDart");
		
	}
}
