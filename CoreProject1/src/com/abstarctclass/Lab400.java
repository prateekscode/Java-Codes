package com.abstarctclass;

class Shape1{
//	This method requires a body instead of a semicolon
	void area();
}
class Square1 extends Shape1{}
public class Lab400 {

	public static void main(String[] args) {
		Shape1 s=new Square1();
		s.area();
	}

}
