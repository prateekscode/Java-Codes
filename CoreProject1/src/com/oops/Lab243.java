package com.oops;

public class Lab243 {

	public static void main(String[] args) {
		System.out.println("MAin:"+ Test15.a);
	}

}
class Test15{
	static int a;
static {
	a=55;
	System.out.println("Initialize: "+a);
}
}
