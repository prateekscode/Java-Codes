package com.spring.ioc;

public class Ekart implements LogisticsCompany {
	@Override
	public void deliverOrder() {
		System.out.println("Order deliver by Ekart");
	}
	@Override
	public void returnRequest() {
		System.out.println("Return requested accepted by Ekart");
	}
	@Override
	public void trackOrder() {
		System.out.println("Order status by Ekart");
	}
}
