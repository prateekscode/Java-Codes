package com.oops;

public class Lab385 {

	public static void main(String[] args) {
		new P24().m1();
	}

}
class P23{
	void m1() {}
	void m2() {}
	void m3() {}
}
class P24 extends P23{
	void m1() {}
	protected void m2() {}
	public void m3() {}
}