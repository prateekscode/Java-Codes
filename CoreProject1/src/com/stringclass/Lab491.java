package com.stringclass;

public class Lab491 {

	public static void main(String[] args) {
		String exp1="[A-Z][A-aa-z]";
		
		System.out.println("sri".matches(exp1));
		System.out.println("Sri".matches(exp1));
		System.out.println("InDiA".matches(exp1));
		
		System.out.println("+++++++++++++++++");
		
		String exp2="[A-Z][A-Za-z]*[0-5]";
		System.out.println("Srinivas".matches(exp2));
		System.out.println("Srini8".matches(exp2));
		System.out.println("Srini3".matches(exp1));
	}

}
