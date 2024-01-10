package com.oops;

public class Lab336 {

	public static void main(String[] args) {
		new N2();
	}
	
}
class Inblo1{
	int a=67;
	{
		System.out.println("Inblo ik:"+a);
	}
}
class N2 extends Inblo1{
	int b=34;
	{
		System.out.println("N2 ik:"+a);
		System.out.println("N2 ik:"+b);
	}
}