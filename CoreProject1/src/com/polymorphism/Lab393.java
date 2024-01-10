package com.polymorphism;

public class Lab393 {

	public static void main(String[] args) {
		Person p=null;
//		Type mismatch: cannot convert from Student to Person
//		p=new Student();
		p.eating();
//		Type mismatch: cannot convert from Employee to Person
//		p=new Employee();
		p.eating();
	}

}
