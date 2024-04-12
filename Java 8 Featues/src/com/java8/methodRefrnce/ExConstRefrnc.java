package com.java8.methodRefrnce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExConstRefrnc {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam", "Zen", "Men");
		List<ExStudent> students = names.stream().map(ExStudent::new).collect(Collectors.toList());
		System.out.println(students);
	}
}
