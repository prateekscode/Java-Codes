package com.oops;

public class Lab244 {

	public static void main(String[] args) {
		System.out.println(Test16.c);
		System.out.println(Test16.c);
	}

}
class Test16{
	static int c=99;
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");
	}

}
/*Here also (IIB)instance block not invoked because 
we have not created the object of the Test16 class*/

