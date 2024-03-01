package com.india.spring;

public class Hello {
	Hai hai;
	
	static {
		System.out.println("Hello static");
	}

	public Hello() {
		System.out.println("hello default const");
	}

	public void setHai(Hai hai) {
		System.out.println("Hello setHai()");
		this.hai = hai;
	}
	
	public void show() {
		System.out.println("HEllo show()");
		System.out.println(hai);
	}
	
}
