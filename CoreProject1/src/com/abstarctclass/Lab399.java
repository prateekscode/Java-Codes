package com.abstarctclass;

class Shape{
	void area() {}
}
class Square extends Shape{
}

public class Lab399 {

	public static void main(String[] args) {
		Shape s=new Square();
		s.area();
		}
}
