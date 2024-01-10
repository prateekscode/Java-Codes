package com.oops;

public class Lab378 {

	public static void main(String[] args) {
		P10 p=new P10();
		p.m1();
	}

}
class P9{
	R3 m1() {
		return new R3();
	}
}
class P10 extends P9{
	R3 m1() {
		return new R3();
	}
}
class R3{}
class R4 extends R3{}