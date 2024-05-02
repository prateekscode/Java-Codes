package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessingEx {
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(90);
		al.add(30);
		al.add(110);
		
		Collection<Integer> collect = al.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
