package com.java8.methodRefrnce;

import java.util.Arrays;
import java.util.List;

public class ExMethRefrnc {
	public static void print(String s) {
		System.out.println(s);
	}

	public void display(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		ExMethRefrnc r = new ExMethRefrnc();
		List<String> students = Arrays.asList("A", "B", "C", "D");
		students.forEach(ExMethRefrnc::print);
		
		System.out.println("-------------");
		
		List<String> students2 = Arrays.asList("W", "X", "Y", "Z");
		students2.forEach(r::display);
	}
}
