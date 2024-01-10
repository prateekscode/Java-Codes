package com.interfaces;

interface Inter5{
	void m1();
	public abstract void m2();
	int a=100;
	public final int b=45;
}
class I5 implements Inter5{
	public void m1() {
		System.out.println("I5--m1():"+a);
	}
	public void m2() {
		System.out.println("i5--m2():"+b);
	}
}
public class Lab414 {

	public static void main(String[] args) {
		Inter5 ref=null;
//		Cannot instantiate the type Inter5
//		ref=new Inter5();
		ref=new I5();
		ref.m1();
		ref.m2();
		
	}

}
