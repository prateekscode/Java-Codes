package com.india.spring;

public class LabA {

	public static void main(String[] args) {
		
		B b=new B(30,"Sam");
		A a=new A();
		a.setA(23);
		a.setMsg("Hii");
		Hello h=new Hello(b);
		h.setObj1(a);
		h.show();
		
	}

}
