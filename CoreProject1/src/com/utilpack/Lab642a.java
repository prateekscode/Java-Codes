package com.utilpack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab642a {

	public static void main(String[] args) {
		Std s1 = new Std(101, "RAJ");
		Std s2 = new Std(101, "PATEL"); // this==obj -> s1==s2 ->false
		Std s3 = new Std(202, "SHIKHA");
		Std s4 = new Std(303, "NIDHI");
		Std s5 = new Std(404, "SANDEEP");

		Map myMap = new LinkedHashMap();
		myMap.put(s1, "RAJ");
		myMap.put(s2, "RAJ");
		myMap.put(s3, "SHIKHA");
		myMap.put(s4, "NIDHI");
		myMap.put(s5, "SANDEEP");

		System.out.println(myMap);
		System.out.println("*****************");
		Map treeMap = new TreeMap();

		treeMap.put(s1, "RAJ");
		treeMap.put(s2, "RAJ");
		treeMap.put(s3, "SHIKHA");
		treeMap.put(s4, "NIDHI");
		treeMap.put(s5, "SANDEEP");

		System.out.println(treeMap);

	}
}

class Std implements Comparable {

	int sid;
	String name;

	public Std(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Std [sid=" + sid + ", name=" + name + "]";
	}

	public int hashCode() {

		return this.sid;
	}

	@Override
	public boolean equals(Object obj) {
		Std ss = (Std) obj;

		return this.sid == ss.sid;
	}

	@Override
	public int compareTo(Object o) {
		Std ss = (Std) o;
		return this.sid - ss.sid;
	}

}