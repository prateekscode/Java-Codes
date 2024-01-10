package com.utilpack;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LAb643a {
	public static void main(String[] args) {
		Students s1 = new Students(505, "RAJ", 35);
		Students s2 = new Students(101, "PATEL", 36);
		Students s3 = new Students(303, "SANDEEP", 30);
		Students s4 = new Students(202, "ROHIT", 24);
		Students s5 = new Students(404, "AMIT", 33);
		Students s6 = new Students(101, "PATEL", 37);

		Map sidMaps = new TreeMap(new SidComperator());
		sidMaps.put(s1, "RAJ");
		sidMaps.put(s2, "PATEL");
		sidMaps.put(s3, "SANDEEP");
		sidMaps.put(s4, "SYHAM");
		sidMaps.put(s5, "AMIT");
		sidMaps.put(s6, "PATEL");

		System.out.println(sidMaps);

		Map namesMaps = new TreeMap(new NameComperator());
		namesMaps.put(s1, "RAJ");
		namesMaps.put(s2, "PATEL");
		namesMaps.put(s3, "SANDEEP");
		namesMaps.put(s4, "SYHAM");
		namesMaps.put(s5, "AMIT");
		namesMaps.put(s6, "PATEL");

		System.out.println(namesMaps);

		Map ageMaps = new TreeMap(new AgeComperator());
		ageMaps.put(s1, "RAJ");
		ageMaps.put(s2, "PATEL");
		ageMaps.put(s3, "SANDEEP");
		ageMaps.put(s4, "SYHAM");
		ageMaps.put(s5, "AMIT");
		ageMaps.put(s6, "PATEL");

		System.out.println(ageMaps);

	}

}

class Students {
	int sid;
	String name;
	int age;

	Students(int sid, String name, int age) {
		this.sid = sid;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SID :" + sid + " NAME :" + name + " AGE :" + age;
	}
}

class SidComperator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students s1 = (Students) o1;
		Students s2 = (Students) o2;
		return s1.sid - s2.sid;
	}

}

class NameComperator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students s1 = (Students) o1;
		Students s2 = (Students) o2;
		return s1.name.compareTo(s2.name);
	}

}

class AgeComperator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students s1 = (Students) o1;
		Students s2 = (Students) o2;
		return s2.age - s1.age;
	}

}