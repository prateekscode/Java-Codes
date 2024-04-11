package com.java8.Function;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex1 {

	public static void main(String[] args) {
		Function<String, Integer> function = x -> x.length();
		System.out.println(function.apply("Raman"));
		
		Function<String, String> function2 = s -> s.substring(0, 3);
		Function<List<Student>, List<Student>> studentsWithPraAsPrefix = li -> {
			List<Student> result = new ArrayList<Student>();
			for (Student s : li) {
				if (function2.apply(s.getName()).equalsIgnoreCase("Pra")) {
					result.add(s);
				}
			}
			return result;
		};

		Student s1 = new Student(101, "Prateek");
		Student s2 = new Student(101, "Prakhar");
		Student s3 = new Student(101, "Ashu");
		Student s4 = new Student(101, "Pranav");
		List<Student> students = Arrays.asList(s1, s2, s3, s4);
		List<Student> filteredStudents = studentsWithPraAsPrefix.apply(students);
		System.out.println(filteredStudents);

	}

	public static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {

			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

	}
}
