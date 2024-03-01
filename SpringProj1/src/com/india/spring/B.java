package com.india.spring;

public class B {
	int b; //constructor injection
	String str; //constructor injection
	
	static {
		System.out.println("B-SIB");
	}

	public B(int b, String str) {
		System.out.println("B parameteric constructor");
		this.b = b;
		this.str = str;
	}
	
	public void m2() {
		System.out.println("m1() from A");
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}
	
}
