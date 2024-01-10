package com.oops;

public class Lab247 {

	public static void main(String[] args) {
		Test19 t=new Test19();
		new Test19();
	}

}
class Test19
{
	{
		System.out.println("Instance block.");
	}
	static {
		System.out.println("Static block");
	}
}