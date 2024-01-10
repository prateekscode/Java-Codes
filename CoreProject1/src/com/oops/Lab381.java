package com.oops;

public class Lab381 {
	public static void main(String[] args) {
	P16 p=new P16();
	p.m1();
	}
}
class P15{
	void m1() {}
}
class P16 extends P15{
	final void m1() {}
}