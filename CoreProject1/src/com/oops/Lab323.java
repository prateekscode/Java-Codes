package com.oops;

public class Lab323 {

	public static void main(String[] args) {
		B1 n=new B1();
		System.out.println(n.a);
//		b cannot be resolved or is not a field
//		System.out.println(n.b);
		D1 n1=new D1();
//		a cannot be resolved or is not a field
//		System.out.println(n1.a);
		System.out.println(n1.b);
	}

}
class B1{
	int a=90;
}
class D1{
	int b=55;
}