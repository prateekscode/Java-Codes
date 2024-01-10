package com.oops;

public class Lab280 {

	public static void main(String[] args) {
		Methre1 m=new Methre1();
		m.displayreamainder(24, 6);
		m.displayreamainder(88, 9);
		m.displayreamainder(100, 7);
	}

}
class Methre1{
	static void displayreamainder(int a,int b) {
		System.out.println(a%b);
	}
}