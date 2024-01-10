package com.practice;

public class Interf {

	public static void main(String[] args) {

		ZZ ref = new ZZ();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();

		Inter1 ref2 = new ZZ();
		ref2.m1();
		ref2.m2();

		Inter2 ref3 = new ZZ();
		ref3.m3();
		ref3.m4();
		System.out.println(ref.a + "\t" + ref2.a);
	}

}

interface Inter1 {

	int a = 10;// public static final int a=10;

	void m1();

	void m2();

}

interface Inter2 {

	int b = 10;// public static final int a=10;

	void m3();

	void m4();
}

class ZZ implements Inter1, Inter2 {
	int a = 100;

	@Override
	public void m3() {
		System.out.println("m3()---Inter2");

	}

	@Override
	public void m4() {
		System.out.println("m4()---Inter2");

	}

	@Override
	public void m1() {
		System.out.println("m1()---Inter1");

	}

	@Override
	public void m2() {
		System.out.println("m2()---Inter1");

	}

}
