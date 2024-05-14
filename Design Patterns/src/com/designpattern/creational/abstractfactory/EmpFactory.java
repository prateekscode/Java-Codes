package com.designpattern.creational.abstractfactory;

public class EmpFactory {
	
	public static Employee getEmp(EmployeeAbstractFactory factory) {
		return factory.createEmp();
	}
}
