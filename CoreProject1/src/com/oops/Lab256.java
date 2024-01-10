package com.oops;

public class Lab256 {

	public static void main(String[] args) {
		Test27 t=new Test27();
		//a is not accessable because it is the local variable of the blocks.
		//System.out.println(Test27.a);
	}

}
class Test27{
	{
		int a=10;
		System.out.println(a);
	}
	static {
		int a=10;
		System.out.println(a);
	}
}
