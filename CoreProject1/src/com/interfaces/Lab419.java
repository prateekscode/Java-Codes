package com.interfaces;

class I10 implements Inter9,Inter10{
	public void m1() {
		System.out.println("I10--m1()");
	}
	public void m2() {
		System.out.println("I10--m2()");
	}
	public void m3() {
		System.out.println("I10--m3()");
		System.out.println(Inter9.a);
		System.out.println(Inter10.a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Lab419 {

	public static void main(String[] args) {
		I10 i=new I10();
		i.m1();
		i.m2();
		i.m3();
	}

}
