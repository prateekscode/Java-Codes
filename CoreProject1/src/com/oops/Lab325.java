package com.oops;

public class Lab325 {

	public static void main(String[] args) {
		B3 z=new B3();
		System.out.println(z.a);
		System.out.println("----");
		
		D3 f=new D3();
		System.out.println(f.a);
		System.out.println(f.b);
	}

}
class B3{
	int a=77;
}
class D3 extends B3{
	int b=10;
}