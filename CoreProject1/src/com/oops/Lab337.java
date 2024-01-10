package com.oops;

public class Lab337 {
	public static void main(String[] args) {
	new N3();	
	}
}
class Inblo2{
	{
		System.out.println("Inblo2 Instance block");
	}
	static {
		System.out.println("Inblo2 Static block");
	}
}
class N3 extends Inblo2{
	{
		System.out.println("N3 Instance block");
	}
	static {
		System.out.println("N3 Static block");
	}
}