package com.innerclass;

class Outer2{
	int a=87;
	static int b=67;
	void m1() {
		System.out.println("Outer2-m1");
	}
	static void m2() {
		System.out.println("Outer2_static-m2");
	}
	static class Inner2{
		int x=11;
		static int y=23;
		void show() {
			System.out.println("Inner2-show()");
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			m2();
		}
		static void m3() {
			System.out.println("Inner-m3()");
		}
	}
}

public class Lab436 {

	public static void main(String[] args) {
		Outer2 ob=new Outer2();
		ob.m1();
		ob.m2();
		Outer2.Inner2 inob=new Outer2.Inner2();
		inob.show();
		inob.m3();
		}

}
