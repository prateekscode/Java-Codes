package com.interfaces;

class I9 implements Inter9,Inter10{
	public void m1() {
		System.out.println("I9--m1()");
	}
	public void m2() {
		System.out.println("I9--m2()");
	}
	public void m3() {
		System.out.println("I9--m3()");
//		The field a is ambiguous
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Lab418 {

	public static void main(String[] args) {
		I9 i=new I9();
		i.m1();
		i.m2();
		i.m3();
	}

}
