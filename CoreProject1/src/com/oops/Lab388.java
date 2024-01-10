package com.oops;

public class Lab388 {

	public static void main(String[] args) {
		new P30().m1();
	}

}
class P29{
	public void m1() {}
}
class P30 extends P29{
//	Cannot reduce the visibility of the inherited method from P29
//	protected void m1() {}
}