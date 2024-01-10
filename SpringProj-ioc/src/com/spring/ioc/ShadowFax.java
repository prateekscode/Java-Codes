package com.spring.ioc;

public class ShadowFax  implements LogisticsCompany{
	@Override
	public void deliverOrder() {
		System.out.println("Order deliver by ShadowFax");
	}
	@Override
	public void returnRequest() {
		System.out.println("Return request accepted by ShadowFax");	
	}
	@Override
	public void trackOrder() {
		System.out.println("Order status by ShadowFax");
	}
}
