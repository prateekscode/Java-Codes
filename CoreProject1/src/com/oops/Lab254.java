package com.oops;

public class Lab254 {

	public static void main(String[] args) {
		Test25 t=new Test25();
	}

}
class Test25{
	{
		int a=100;
		System.out.println("I.block 1 :"+a);
	}
	{
		String a="Hello!";
		System.out.println("I.block 2 :"+a);
	}
}