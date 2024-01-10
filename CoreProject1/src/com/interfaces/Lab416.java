package com.interfaces;

interface Inter7{
	void m1();
	int a=78;
}
interface Inter8{
	void m2();
	int b=111;
}
class I7 implements Inter7,Inter8{
	public void m1() {
		System.out.println("I7--m1()");
	}
	public void m2() {
		System.out.println("I7--m2()");
	}
}
public class Lab416 {
	public static void main(String[] args) {
		I7 i=new I7();
		System.out.println(i.a);
		System.out.println(i.b);
		i.m1();
		i.m2();
	}

}
