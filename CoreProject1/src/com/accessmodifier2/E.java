package com.accessmodifier2;
import com.accessmodifier.A;
public class E{
	public void showE() {
		System.out.println("E--show");
		A a1=new A();
//		The field A.a is not visible
//		System.out.println(a1.a);
//		The field A.b is not visible
//		System.out.println(a1.b);
//		The field A.c is not visible
//		System.out.println(a1.c);
		System.out.println(a1.d);
	}
	
}