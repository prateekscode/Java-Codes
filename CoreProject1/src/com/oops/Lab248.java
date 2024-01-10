package com.oops;

public class Lab248 {

	public static void main(String[] args) {
		System.out.println("Main: "+Test20.c);
	}

}
class Test20{
	static int c;
	int d;
	static{
		c=29;
		//d=30;	//Cannot make a static reference to the non-static field d.
		System.out.println("Static block");
	}
}