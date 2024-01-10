package com.interfaces;

interface Inter1{
	void m1();
	public abstract void m2();
	int a=10;
	public final int b=20;
}
//The type Inter1 cannot be the superclass of I1; a superclass must be a class
//class I1 extends Inter1{}  
public class Lab410 {

	public static void main(String[] args) {
		System.out.println("Namaste!");
	}

}
