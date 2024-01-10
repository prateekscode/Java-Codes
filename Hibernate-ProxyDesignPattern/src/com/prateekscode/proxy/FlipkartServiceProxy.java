package com.prateekscode.proxy;

import com.prateekscode.component.FlipkartService;
import com.prateekscode.component.FlipkartServiceRealImple;

//proxy class
public class FlipkartServiceProxy implements FlipkartService {

	private FlipkartService flipkartService;
	float discount = 0;

	public FlipkartServiceProxy(float discount) {
		flipkartService = new FlipkartServiceRealImple();
		this.discount=discount;
	}

	@Override
	public float buyNow(String[] items, float[] prices) {
		float finalBillAfterDiscount=0;
		float billAmount=0;
		
		for(float p:prices) {
			billAmount=billAmount+p;
		}
		
		finalBillAfterDiscount = (billAmount- billAmount*discount/100);		
		return finalBillAfterDiscount;
	}

}
