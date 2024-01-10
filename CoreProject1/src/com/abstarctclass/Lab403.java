package com.abstarctclass;

abstract class Shape4{
	abstract void area();
}
//The type Square4 must implement the inherited abstract method Shape4.area()
class Square4 extends Shape4{}

class Lab403{
	public static void main(String[] args) {
		Shape4 sp=new Square4();
		sp.area();
	}
}