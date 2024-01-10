package com.oops;

public class Lab386 {

	public static void main(String[] args) {
		new P26().m1();
	}

}
class P25{
	protected void m1() {}
	protected void m2() {}
}
class P26 extends P25{
//	Cannot reduce the visibility of the inherited method from P25
//	private void m1() {}
//	Cannot reduce the visibility of the inherited method from P25
//	void m2() {}
}