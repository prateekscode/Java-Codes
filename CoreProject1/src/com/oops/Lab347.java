package com.oops;

public class Lab347 {

	public static void main(String[] args) {
		new N12(12);
	}

}
class Sup5{
	Sup5(){
		System.out.println("Sup5() Constructor");
	}
}
class N12 extends Sup5{
	N12(){
		System.out.println("N12() Constructor");
	}
	N12(int a){
		this();
		System.out.println("N12(int a)");
	}
}