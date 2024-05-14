package com.designpattern.creational.factory;

public class JavaDev implements Employee{
	@Override
	public int salary() {
		System.out.println("Getting Java Dev Salary");
		return 60000;
	}
}
