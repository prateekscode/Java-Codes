package com.interfaces;

interface Inter6{
	void m1();
	public abstract void m2();
	int a=88;
	public final int b=77;
}
abstract class I6 implements Inter6{
	public void m1(){
		System.out.println("I6--m1()"+a);
	}
}
class J1 extends I6{
	public void m2() {
		System.out.println("J1--m2()"+b);
	}
	void m3() {
		System.out.println("J1--m3()");
	}
}
public class Lab415 {

	public static void main(String[] args) {
//		J6 cannot be resolved to a type.
		Inter6 re=new J6();
		re.m1();
		re.m2();
	}

}
