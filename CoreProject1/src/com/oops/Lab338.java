package com.oops;

public class Lab338 {

	public static void main(String[] args) {
		new N4(); 	
	}

}
class Incons{
	Incons(){
		System.out.println("Parent constructor");
	}
}
class N4 extends Incons{
	N4(){
		System.out.println("Child constructor");
	}
}