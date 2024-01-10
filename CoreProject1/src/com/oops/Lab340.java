package com.oops;

public class Lab340 {

	public static void main(String[] args) {
		new O1();
	}

}
class Incons2{
	Incons2(){
		System.out.println("Grand Parent Constructor");
	}
	{
		System.out.println("Incons2 Instance block");
	}
	static{
		System.out.println("Incons2 Static block");
	}
}
class N6 extends Incons2{
	N6(){
		System.out.println("Parent Constructor");
	}
	{
		System.out.println("N6 Instance block");
	}
	static {
		System.out.println("N6 static block");
	}
}
class O1 extends N6{
	O1(){
		System.out.println("Child Constructor");
	}
	{
		System.out.println("O1 Instance block");
	}
	static {
		System.out.println("O1 static block");
	}
}