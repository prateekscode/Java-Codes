package com.oops;

public class Lab392 {

	public static void main(String[] args) {
		P38 p=new P38();
		p.m1();
	}

}
class P37{
	static void m1() {
		System.out.println("P37-m1()");
	}
}
class P38 extends P37{
	static void m1() {
		System.out.println("P38-m1()");
	}
}