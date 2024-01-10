package com.utilpack;
import java.util.*;

class Student implements Comparable<Student>{
	int sid;
	String name;
	String email;
	long phone;
	
	Student(){}
	
	Student(int sid, String name, String email, long phone){
		this.sid=sid;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	public String toString() {
		String str=sid+"\t"+name+"\t"+email+"\t"+phone;
		return str;
	}
	public int compareTo(Student st) {
		int x=this.sid-st.sid;
		return x;
	}
}
class SidAscComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
	int x=s1.sid-s2.sid;
	return x;
	}
}
class SidDescComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=s1.name.compareTo(s2.name);
		return x;
	}
}
class SnameAscComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=s1.name.compareTo(s2.name);
		return x;
	}
}
class SnameDescComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=s2.name.compareTo(s1.name);
		return x;
	}
}
class EmailAscComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=s1.email.compareTo(s2.email);
		return x;
	}
}
class EmailDescComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=s2.email.compareTo(s2.email);
		return x;
	}
}
class PhoneAscComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=(int)(s1.phone-s2.phone);
		return x;
	}
}
class PhoneDescComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		int x=(int)(s2.phone-s1.phone);
		return x;
	}
}

public class Lab670 {

	public static void main(String[] args) {
		
		Student st1=new Student(101,"aa","aa@sch",111);
		Student st3=new Student(103,"cc","cc@sch",333);
		Student st2=new Student(102,"bb","bb@sch",222);
		Student st4=new Student(104,"dd","dd@sch",444);
		
		List<Student> list=new ArrayList<>();
		
		list.add(st1);
		list.add(st3);
		list.add(st2);
		list.add(st4);
		
		System.out.println("Given order");
		for(Student st:list) {
			System.out.println(st);
		}
		
		System.out.println("Sid Asc");
		Collections.sort(list);
		for(Student st:list) {
		System.out.println(st);
		}
		
		System.out.println("Sid Desc");
		Collections.sort(list,new SidDescComparator());
		for(Student st:list) {
			System.out.println(st);
		}
		
		System.out.println("Sname Asc");
		Collections.sort(list,new SnameAscComparator());
		for(Student st:list) {
			System.out.println(st);
		}
		
		System.out.println("Sname Desc");
		Collections.sort(list,new SnameDescComparator());
		for(Student st:list) {
			System.out.println(st);
		}
	}

}
