package com.abstarctclass;

abstract class Shape5{
	abstract void area();
}
class Square5 extends Shape5{
	void area() {
		System.out.println("Square5--area");
	}
}
public class Lab404 {

	public static void main(String[] args) {
		Square5 sq=new Square5();
		sq.area();
	}

}
