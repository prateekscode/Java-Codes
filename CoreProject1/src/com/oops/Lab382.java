package com.oops;

public class Lab382 {

	public static void main(String[] args) {
		P18 p=new P18();
		p.m1();
	}

}
class P17{
	void m1() {}
	static void m2() {}
}
class P18 extends P17{
	void m1() {}
	static void m2() {}
}