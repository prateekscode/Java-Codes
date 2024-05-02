package com.practice;

import java.util.Set;
import java.util.TreeSet;

public class Comparab {
	public static void main(String[] args) {
		
		Bacche b1=new Bacche(103,"Adarsh",300);
		Bacche b2=new Bacche(102,"Bash",300);
		Bacche b3=new Bacche(101,"Cameron",300);
		Bacche b4=new Bacche(104,"Evil",300);
		Bacche b5=new Bacche(105,"Rohan",300);
		
		Set<Bacche> l=new TreeSet();
		l.add(b1);l.add(b2);l.add(b3);l.add(b4);l.add(b5);
		
		System.out.println(l);
		
	}
}

class Bacche implements Comparable{
	int id;
	String name;
	long marks;
	
	public Bacche(int id, String name, long marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Object o) {
	Bacche b=(Bacche)o;
	return b.name.compareTo(this.name);
	}
}