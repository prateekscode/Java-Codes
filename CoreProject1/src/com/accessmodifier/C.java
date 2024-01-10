package com.accessmodifier;
public class C{
	public void showC() {
		System.out.println("C-show()");
		A a1=new A();
//		The field A.a is not visible
//		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
}