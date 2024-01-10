package com.accessmodifier2;
import com.accessmodifier.A;
public class D extends A{
	public void showD() {
		System.out.println("D-show");
//		The field A.a is not visible
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}