package com.interfaces;

interface Inter4{
	void m1();
	public abstract void m2();
	int a=89;
	public final int b=99;
}
class I4 implements Inter4{
//	- Cannot reduce the visibility of the inherited method from Inter4
	void m1() {
		System.out.println("I4--m1");
	}
//	- Cannot reduce the visibility of the inherited method from Inter4
	void m2() {
		System.out.println("I4--m2");
	}
}
public class Lab413 {

	public static void main(String[] args) {
	System.out.println("Hii!");
	}

}
