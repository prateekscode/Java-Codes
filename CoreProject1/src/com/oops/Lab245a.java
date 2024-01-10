package com.oops;

public class Lab245a {

	public static void main(String[] args) {
		Test17 t=null;
		System.out.println("Reference created.");
	}

}
class Test17{
	static int d=35;
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("Static block");
	}
}
/*Here only main's print function executed also not the static
block executed because of Test17 class not loaded*/