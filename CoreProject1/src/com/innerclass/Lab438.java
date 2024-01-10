package com.innerclass;

class Outer3{
	int a=30;
	static int b=50;
	void show() {
		System.out.println("Outer show() begin");
		class Inner{
			void m1() {
				System.out.println("Inner M1()");
				System.out.println(a);
				System.out.println(b);
			}
		}
		new Inner().m1();
		System.out.println("Outer show() end");
	}
}
public class Lab438 {

	public static void main(String[] args) {
		Outer3 o=new Outer3();
		o.show();

	}

}
