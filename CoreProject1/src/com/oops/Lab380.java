package com.oops;

public class Lab380 {

	public static void main(String[] args) {
		P14 p=new P14();
		p.m1();
	}

}
class P13{
	final void m1() {}
}
class P14 extends P13{
//	Cannot override the final method from P13
//	void m1() {}
}