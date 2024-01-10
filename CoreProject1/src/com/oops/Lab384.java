package com.oops;

public class Lab384 {

	public static void main(String[] args) {
		new P22().m1();
	}

}
class P21{
	void m1() {}
}
class P22 extends P21{
//	Cannot reduce the visibility of the inherited method from P21
//	private void m1() {}
}