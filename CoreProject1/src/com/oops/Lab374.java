package com.oops;

public class Lab374 {
	public static void main(String[] args) {
		P1 pobj=new P1();
		pobj.show();
		pobj.SHOW();
	}
}
class P{
	void show() {
		System.out.println("A-show");
	}
}
class P1 extends P{
	void SHOW() {
		System.out.println("B-SHOW");
	}
}