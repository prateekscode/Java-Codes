package com.oops;

public class Lab339 {

	public static void main(String[] args) {
		new O();
	}

}
class Incons1{
	Incons1(){
		System.out.println("Grand Parent Constructor");
	}
}
class N5 extends Incons1{
	N5(){
		System.out.println("Parent Constructor");
	}
}
class O extends N5{
	O(){
		System.out.println("Child Constructor");
	}
}