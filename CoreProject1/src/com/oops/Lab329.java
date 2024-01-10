package com.oops;

public class Lab329 {

	public static void main(String[] args) {
		C7 c=new C7();
		c.D1();
		c.D2();
		D7 d=new D7();
		d.D1();
		d.D3();
	}

}
class B7{
	void D1(){
		System.out.println("B7--D1");
	}
}
class C7 extends B7{
	void D2() {
		System.out.println("C7--D2");
	}
}
class D7 extends C7{
	void D3() {
		System.out.println("D7--D3");
	}
}