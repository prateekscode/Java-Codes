package com.oops;

public class Lab251 {

	public static void main(String[] args) {
		Test22 t=new Test22();

	}

}
class Test22{
	int c;
	static int d;
	{
		int r;
		System.out.println(c);
		System.out.println(d);
		//The local variable r may not have been initialized.
		//System.out.println(r);
	}
}