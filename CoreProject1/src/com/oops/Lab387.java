package com.oops;

public class Lab387 {

	public static void main(String[] args) {
		new P28().m1();
	}

}
class P27{
	protected void m1() {}
	protected void m2() {}
}
class P28 extends P27{
	protected void m1() {}
	public void m2() {}
}