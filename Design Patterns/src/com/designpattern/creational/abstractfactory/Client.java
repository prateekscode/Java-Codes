package com.designpattern.creational.abstractfactory;

public class Client {
	public static void main(String[] args) {

		Employee emp1 = EmpFactory.getEmp(new WebDevFactory());
		System.out.println(emp1.name());
		System.out.println(emp1.sal());

		Employee emp2 = EmpFactory.getEmp(new JavaDevFactory());
		System.out.println(emp2.name());
		System.out.println(emp2.sal());
		
		Employee emp3 = EmpFactory.getEmp(new ManagerFactory());
		System.out.println(emp3.name());
		System.out.println(emp3.sal());	
	}
}
