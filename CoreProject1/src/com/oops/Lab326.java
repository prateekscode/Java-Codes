package com.oops;

public class Lab326 {

	public static void main(String[] args) {
		D4 n=new D4();
		n.m1();
		n.m2();
	}

}
class B4{
	int a=35;
	void m1() {
		System.out.println("B4--m1: "+a);
//		b cannot be resolved to a variable
//		System.out.println("B4--m1: "+b);
	}
}
class D4 extends B4{
	int b=90;
	void m2() {
		System.out.println("D4--m2: "+a);
		System.out.println("D4--m2: "+b);
	}
}