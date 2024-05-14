package com.designpattern.creational.abstractfactory;

public class WebDevFactory extends EmployeeAbstractFactory{
	@Override
	public Employee createEmp() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}
}
