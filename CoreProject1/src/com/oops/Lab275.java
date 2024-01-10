package com.oops;

public class Lab275 {

	public static void main(String[] args) {
		meth2 m=null;
//		The static method show() from the type meth2 should be accessed in a static way.
//		m.show();
//		m=new meth2();
//		m.show();
		meth2.show();
	}

}
class meth2{
	static void show() {
		System.out.println("Static show()");
	}
}