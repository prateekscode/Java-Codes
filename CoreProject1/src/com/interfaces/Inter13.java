package com.interfaces;

interface Inter13 {
int bc=76;
}
class N2{
	String bc="Namaste!";
}
class Hii extends N2 implements Inter13{
	void show() {
		System.out.println(super.bc);
		System.out.println(Inter13.bc);
	}
}