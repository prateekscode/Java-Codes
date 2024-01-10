package com.oops;

public class Lab255a {

	public static void main(String[] args) {
		Test26 t=new Test26();
	}

}
class Test26{
	{
		int a=99;
		System.out.println(a);
	}
	{
		//a cannot be accessed because it is local to the previous instance block.
		//System.out.println(a);
	}
}
