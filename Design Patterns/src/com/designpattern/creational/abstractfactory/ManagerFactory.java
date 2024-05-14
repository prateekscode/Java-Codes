package com.designpattern.creational.abstractfactory;

public class ManagerFactory extends EmployeeAbstractFactory {
	@Override
	public Employee createEmp() {
		return new Manager();
	}
}
