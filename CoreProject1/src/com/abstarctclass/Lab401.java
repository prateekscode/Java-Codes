package com.abstarctclass;

//The type Shape2 must be an abstract class to define abstract methods
//class Shape2{
//	abstract void area();
//}
class Square2 extends Shape2{}
public class Lab401 {

	public static void main(String[] args) {
		Shape2 sp=new Square2();
		sp.area();
	}

}
