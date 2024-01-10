package com.oops;

public class Lab318 {

	public static void main(String[] args) {
		Varargs8 v=new Varargs8();
		v.show(10);// show(int... ar1);
	}

}
class Varargs8{
	void show(int...ar1) {
		System.out.println("show(int...ar1)");
	}
	void show(int[] ar1) {
		System.out.println("show(int[] ar1)");
	}
}