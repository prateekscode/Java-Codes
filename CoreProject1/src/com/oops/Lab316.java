package com.oops;

public class Lab316 {

	public static void main(String[] args) {
		Varargs6 v=new Varargs6();
		v.inte();
		v.inte(20);
		v.strin("HEllo!");
	}

}
class Varargs6{
	void inte(int...a) {
		System.out.println("inte(int...)");
	}
	void strin(String...b) {
		System.out.println("strin(String...)");
	}
}