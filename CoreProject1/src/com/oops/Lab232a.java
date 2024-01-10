package com.oops;

public class Lab232a {

	public static void main(String[] args) {
	Test t=new Test();
		System.out.println(t.b);
		t.b=33;
		System.out.println(t.b);
	}
}
class Test{
	static int b;
}

