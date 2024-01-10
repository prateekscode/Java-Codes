package com.polymorphism;

public class Lab394 {

	public static void main(String[] args) {
		Person p=null;
//		Type mismatch: cannot convert from Student to Person
//		p=new Student();
		p.walking();
//		Type mismatch: cannot convert Employee to Person
//		p=new Employee();
		p.walking();
	}

}
