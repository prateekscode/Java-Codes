package com.oops;

public class Lab391 {

	public static void main(String[] args) {
		P36 p=new P36();
		p.m1();
	}

}
class P35{
	void m1() {
		System.out.println("P35-m1()");
	}
}
class P36 extends P35{
	void m1() {
		System.out.println("P36-m1()");
		super.m1();
	}
}