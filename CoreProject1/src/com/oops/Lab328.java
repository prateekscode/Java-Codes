package com.oops;

public class Lab328 {

	public static void main(String[] args) {
		D6 d=new D6();
		d.S1();
		d.S2();
		d.S3();
	}

}
class B6{
	void S1() {
		System.out.println("S1()");
	}
}
class C6 extends B6{
	void S2() {
		System.out.println("S2()");
	}
}
class D6 extends C6{
	void S3() {
		System.out.println("S3()");
	}
}