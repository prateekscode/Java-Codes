package com.oops;

public class Lab376 {

	public static void main(String[] args) {
		P6 p=new P6();
		p.show();
		
	}

}
class P5{
	long show() {
		return 0;
	}
}
class P6 extends P5{
//	 overrides com.oops.P5.show
//	int show() {
		return 0;
	}
}