package com.interfaces;

interface Inter2{
	void m1();
	public abstract void m2();
	int a=90;
	public final int b=70;
}
//- The type I2 must implement the inherited abstract method Inter2.m1()
//- The type I2 must implement the inherited abstract method Inter2.m2()
class I2 implements Inter2{}
public class Lab411 {

	public static void main(String[] args) {
		System.out.println("Good day to all!");
	}

}
