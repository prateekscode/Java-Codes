package com.oops;

public class Lab274 {

	public static void main(String[] args) {
		meth m=null;
//		Null pointer access: The variable m can only be null at this location.
//		m.show();
		m=new meth();
		m.show();
//		Cannot make a static reference to the non-static method show() from the type meth.
//		meth.show();
	}

}
class meth{
	void show() {
		System.out.println("Instance show()");
	}
}