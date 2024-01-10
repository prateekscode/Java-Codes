package com.prateekscode.factory;

import com.prateekscode.component.FlipkartService;
import com.prateekscode.component.FlipkartServiceRealImple;
import com.prateekscode.proxy.FlipkartServiceProxy;

public class EcommerceFactory {

	// getInstance method- it will either give proxy or real object
	public static FlipkartService getInstance(String couponCode) {
		if (couponCode.equals("") || couponCode.trim().length() == 0) {
			return new FlipkartServiceRealImple();
		} else {
			if (couponCode.equalsIgnoreCase("PrateeksC20")) {
				return new FlipkartServiceProxy(20);
			} else if (couponCode.equalsIgnoreCase("PrateeksC10")) {
				return new FlipkartServiceProxy(10);
			} else {
				return new FlipkartServiceRealImple();
			}
		}

	}

}
