package com.accessmodifier;
public class B extends A{
	public void showB() {
		System.out.println("B--show");
		//The field A.a is not visible.
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}