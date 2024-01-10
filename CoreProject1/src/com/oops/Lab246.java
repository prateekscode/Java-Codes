package com.oops;

public class Lab246 {

	public static void main(String[] args) {
		Test18 t=null;
		System.out.println("Refrence created.");
		t=new Test18(); 
	}

}
class Test18{
	{
		System.out.println("Instance block.");
	}
	static {
		System.out.println("Static block.");
	}
}