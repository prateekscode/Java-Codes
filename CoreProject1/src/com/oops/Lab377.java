package com.oops;

public class Lab377 {

	public static void main(String[] args) {
		P8 p=new P8();
		p.m1();
	}

}
class P7{
	R1 m1() {
		return new R1();
	}
}
class P8 extends P7{
//	 overrides com.oops.P7.m1
//	R2 m1() {
//		return new R2();
//	}
}
class R1{}
class R2{}