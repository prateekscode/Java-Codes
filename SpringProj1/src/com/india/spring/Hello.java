package com.india.spring;

public class Hello {

	A obj1 = null;
	B obj2 = null;
	static {
		System.out.println("Hello SIB");
	}

	public Hello(B obj2) {
		System.out.println("Hello(B) constructor");
		this.obj2 = obj2;
	}

	public void setObj1(A obj1) {
		this.obj1 = obj1;
	}

	void show() {
		System.out.println("Hello() show");
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
