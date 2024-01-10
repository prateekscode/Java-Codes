package com.oops;

public class Lab327 {

	public static void main(String[] args) {
		D5 d=new D5();
		d.C1();
		d.C2();
	}

}
class B5{
	int a=89;
	void C1(){
		System.out.println("B5--C1: "+a);
	}
}
class D5 extends B5{
	int b=76;
	void C2() {
		System.out.println("D5--C2: "+a);
		System.out.println("D5--C2: "+b);
	}
}