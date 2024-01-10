package com.oops;

public class Lab282 {

	public static void main(String[] args) {
	Methre3.displayRemainder(30, 12);
//	Methre3.displayRemainder(30, 0);
	}

}
class Methre3{
	static void displayRemainder(int a,int b) {
		if(b==0)
//			Void methods cannot return a value.
//		return 0;
		System.out.println(a%b);
	}
}