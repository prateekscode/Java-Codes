package com.prateekscode.component;

//concrete class  ....realclass
public class FlipkartServiceRealImple implements FlipkartService {

	public float buyNow(String[] items, float[] prices) {
		float bill = 0;

		// calculate bill
		for (float p : prices) {
			bill = bill + p;
		}
		return bill;
	}

}
