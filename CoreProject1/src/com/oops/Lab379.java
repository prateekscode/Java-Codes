package com.oops;

public class Lab379 {
	public static void main(String[] args) {
		P12 p=new P12();
		p.m1();
	}
}
class P11{
	R5 m1() {
		return new R5();
	}
}
class P12 extends P11{
	R6 m1() {
		return new R6();
	}
}
class R5{}
class R6 extends R5{}