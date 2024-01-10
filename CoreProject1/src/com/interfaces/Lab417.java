package com.interfaces;

class I8 implements Inter9,Inter10{
	public void m1() {
		System.out.println("I8--m1()");
	}
	public void m2() {
		System.out.println("I9--m2()");
	}
	public void m3() {
		System.out.println("I8--m3()");
		System.out.println(b);
		System.out.println(c);
	}
}
public class Lab417 {

	public static void main(String[] args) {
		I8 i=new I8();
		i.m1();
		i.m2();
		i.m3();
	}

}
