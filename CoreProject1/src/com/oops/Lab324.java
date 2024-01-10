package com.oops;

public class Lab324 {

	public static void main(String[] args) {
		B2 n=new B2();
		System.out.println(n.a);
//		b cannot be resolved or is not a field
//		System.out.println(n.b);
		System.out.println("-------");
		D2 n1=new D2();
		System.out.println(n1.a);
		System.out.println(n1.b);
	}

}
class B2{
	int a=30;
}
class D2 extends B2{
	int b=25;
}