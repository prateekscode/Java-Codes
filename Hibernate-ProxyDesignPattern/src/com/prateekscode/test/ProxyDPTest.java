package com.prateekscode.test;

import com.prateekscode.component.FlipkartService;
import com.prateekscode.factory.EcommerceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		FlipkartService service=null;
		
		//Buy Product
		String couponCode="PrateeksC20";
		
		service = EcommerceFactory.getInstance(couponCode);
		
		System.out.println("Real or Proxy class? \n"+service.getClass());
		
		float bill=service.buyNow(new String[] {"Tshirts","Shoes"}, new float[] {400.0f,1200.0f});
		System.out.println(bill);
	}

}
