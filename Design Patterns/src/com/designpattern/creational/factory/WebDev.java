package com.designpattern.creational.factory;

public class WebDev implements Employee{
	@Override
	public int salary() {
		System.out.println("Getting Web Dev Salary");
		return 40000;
	}
}
