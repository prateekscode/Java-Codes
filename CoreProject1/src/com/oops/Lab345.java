package com.oops;

public class Lab345 {

	public static void main(String[] args) {
		N10 n=new N10();
	}

}
class Sup3{
	Sup3(int a){
		System.out.println("Sup3(int a) Constructor");
	}
}
class N10 extends Sup3{
		N10(){
			super(30);
			System.out.println("N10() Default constructor.");
	}
}