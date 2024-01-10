package com.interfaces;

interface Inter12 {
int ab=80;
}
class N1 implements Inter12{
	void show() {
//		ab cannot be resolved or is not a field
		System.out.println(super.ab);
	}
}