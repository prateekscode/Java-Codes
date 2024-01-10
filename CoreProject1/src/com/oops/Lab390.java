package com.oops;

public class Lab390 {

	public static void main(String[] args) {
		P34 p=new P34();
		p.m1();
	}

}
class P33{
	void m1() {
		System.out.println("P33-m1()");
	}
}
class P34 extends P33{
	void m1() {
		System.out.println("P34-m1()");
	}
}