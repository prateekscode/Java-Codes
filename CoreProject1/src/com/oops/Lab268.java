package com.oops;

public class Lab268 {

	public static void main(String[] args) {
		cons8 c=new cons8();
		c.show();
	}

}
class cons8{
	int a=99;
	static int b=55;
	void show() {
		String a="Hello";
		String b="Everyone!";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(cons8.b);
	}
}