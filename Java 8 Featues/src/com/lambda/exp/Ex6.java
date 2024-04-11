package com.lambda.exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		Student s1=new Student(102,"Sam");
		Student s2=new Student(101,"Tanishq");
		Student s3=new Student(103,"Charan");
		List<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		Collections.sort(l,(a,b)->a.id-b.id);
		System.out.println(l);

		Collections.sort(l,(a,b)->b.id-a.id);
		System.out.println(l);
		
	}

}
