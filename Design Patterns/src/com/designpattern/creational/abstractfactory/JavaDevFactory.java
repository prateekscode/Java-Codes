package com.designpattern.creational.abstractfactory;

public class JavaDevFactory extends EmployeeAbstractFactory {
@Override
public Employee createEmp() {
	return new JavaDeveloper();
}
}
