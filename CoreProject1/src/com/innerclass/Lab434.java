package com.innerclass;

class Outer{
	int a=90;
	static int b=12;
	void m1() {
		System.out.println("Outer m1()");
	}
	static void m2() {
		System.out.println("Outer static m2()");
	}
class Inner{
	int x=11;
	void show() {
		System.out.println("Inner_show");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		m1();
		m2();
		}
	}
}

public class Lab434 {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.m1();
		o.m2();
		Outer.Inner inob=new Outer().new Inner();
		inob.show();
	}

}
