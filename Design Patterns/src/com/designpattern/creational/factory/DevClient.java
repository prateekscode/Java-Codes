package com.designpattern.creational.factory;

public class DevClient {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Java Dev");
		System.out.println(employee.salary());
		
		Employee employee1 = EmployeeFactory.getEmployee("Web Dev");
		System.out.println(employee1.salary());
		
//		Null
//		Employee employee3 = EmployeeFactory.getEmployee("Python");
//		System.out.println(employee3.salary());
		
	}
}
