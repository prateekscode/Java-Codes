package com.oops;

public class Lab235a {

	public static void main(String[] args) {
		Test4 t=null;
		//Error:The static field Test4.b should be accessed in a static way.
		System.out.println(t.b);
	}

}
class Test4{
	static int b;
}