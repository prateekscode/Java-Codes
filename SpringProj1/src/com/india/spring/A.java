package com.india.spring;

public class A {

	int a; //Setter Injection
	String msg; //Setter Injection
	static {
		System.out.println("A SIB ");
	}
	public A() {}
	
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void m1() {
		System.out.println("m1() from A");
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", msg=" + msg + "]";
	}
	

}
