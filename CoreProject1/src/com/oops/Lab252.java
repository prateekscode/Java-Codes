package com.oops;

public class Lab252 {

	public static void main(String[] args) {
		System.out.println(Test23.n);
	}

}
class Test23{
	static int n;
	static {
		//Illegal modifier for the variable b; only final is permitted.
		//static int b;
		System.out.println(n);
		//System.out.println(b);
	}
}