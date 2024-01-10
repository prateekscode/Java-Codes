package com.oops;

public class Lab315 {

	public static void main(String[] args) {
		Varargs5 v=new Varargs5();
		v.show(45);
		v.show(30,15,15);
		v.show(15,15,15,15,15);
	}

}
class Varargs5{
	void show(int a,int...arr) {
		System.out.println("show(int,int...)");
	}
}