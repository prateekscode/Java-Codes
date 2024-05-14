package com.designpattern.creational.abstractfactory;

public class JavaDeveloper implements Employee {
	@Override
	public String name() {
		return "Java Developer";
	}

	@Override
	public int sal() {
		return 45000;
	}
}
