package com.oops;

public class Lab373 {

	public static void main(String[] args) {
		Methover2 m=new Methover2();
		m.m1();
		m.m3();
		m.m2();
	}

}
class Methover{
	void m1() {
		System.out.println("Methover--m1()");
	}
	void m2() {
		System.out.println("Methover--m2()");
	}
}
class Methover2 extends Methover{
	void m2() {
		System.out.println("Methover2--m2()");
	}
	void m3() {
		System.out.println("Methover2--m3()");
	}
}