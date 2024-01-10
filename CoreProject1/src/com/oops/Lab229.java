package com.oops;

public class Lab229 {

	public static void main(String[] args) {
		Test9 t=null;
		//java.lang.NullPointerException
		System.out.println(t.c);
	}

}
class Test9{
	int c;
}