package com.abstarctclass;

abstract class Person{
	abstract void sleeping();
	abstract void walking();
}
abstract class Student extends Person{
	void sleeping() {
		System.out.println("Student--sleeping");
	}
}
class Currentstu extends Student{
	void walking() {
		System.out.println("Currentsu--walking");
	}
}
public class Lab405 {

	public static void main(String[] args) {
		Person ob=new Currentstu();
		ob.sleeping();
		ob.walking();
	}

}
