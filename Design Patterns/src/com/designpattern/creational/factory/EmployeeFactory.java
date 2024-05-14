package com.designpattern.creational.factory;

public class EmployeeFactory {
	public static Employee getEmployee(String empType){
		if(empType.trim().equalsIgnoreCase("Java Dev")) {
			return new JavaDev();
		}
		else if(empType.trim().equalsIgnoreCase("Web Dev")) {
			return new WebDev();
		}
		else {
			return null;
		}
	}
}
