package com.abstarctclass;

abstract class Person1{
	abstract void sleeping();
}
abstract class Student1 extends Person1{
	void sleeping() {
		System.out.println("Student1--sleeping()");
	}
}
class Currentstu1 extends Student1{}
public class Lab406 {
	public static void main(String[] args) {
		Person pb=new Currentstu();
		pb.sleeping();
	}
}
