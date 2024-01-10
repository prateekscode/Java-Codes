package com.interfaces;

class I11 implements Inter9,Inter10{
	public void m1() {
		System.out.println("I11--m1()");
	}
	public void m2() {
		System.out.println("I11--m2()");
	}
	public void m3() {
		System.out.println("I11--m3()");
		System.out.println(Inter9.a);
		System.out.println(Inter10.a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Lab420 {

	public static void main(String[] args) {
		I11 i=new I11();
		Inter9 ref=i;
		ref.m1();
		ref.m2();
		
		Inter10 ref1=i;
		ref1.m2();
		ref1.m3();
		
	}

}
