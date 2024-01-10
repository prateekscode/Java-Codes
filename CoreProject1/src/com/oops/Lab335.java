package com.oops;

public class Lab335 {

	public static void main(String[] args) {
	new N1();	
	}

}
class Inblo{
	static int a=99;
	static{
		System.out.println("Inblo Static bk:"+a);
	}
}
class N1 extends Inblo{
	static int b=80;
	static {
		System.out.println("N1 bk:"+a);
		System.out.println("N1 bk:"+b);
	}
}