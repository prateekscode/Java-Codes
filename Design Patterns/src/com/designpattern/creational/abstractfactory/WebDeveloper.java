package com.designpattern.creational.abstractfactory;

public class WebDeveloper implements Employee {
	@Override
	public String name() {
		return "Web Developer";
	}

	@Override
	public int sal() {
		return 25000;
	}
}
