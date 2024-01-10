package com.oops;

public class Lab242 {

	public static void main(String[] args) {
		System.out.println("MAin:"+Test14.c);
	}

}
class Test14{
	static int c;
	{
		c=52;
		System.out.println("Initialized :"+c);
	}
}
/*prints 0 only in main fun() because there is no creation of
object of class Test14 so IIB(instance initialization block not executed. */