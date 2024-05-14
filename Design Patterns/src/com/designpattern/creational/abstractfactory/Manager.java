package com.designpattern.creational.abstractfactory;

public class Manager implements Employee {
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Manager";
	}

	@Override
	public int sal() {
		// TODO Auto-generated method stub
		return 100000;
	}
}
