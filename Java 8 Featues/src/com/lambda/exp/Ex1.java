package com.lambda.exp;

public class Ex1{

	public static void main(String[] args) {
		ExI1 ex=()->"Software Eng";
		System.out.println(ex.getName());
		
		ExI1 edit=()->"Editor";
		System.out.println(edit.getName());
		
	}
}
