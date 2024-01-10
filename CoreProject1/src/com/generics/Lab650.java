package com.generics;
import java.util.*;
class Customer1{
	int id;
	String name;
	String email;
	long phone;
	
	Customer1(){}
	Customer1(int id, String name,String email,long phone){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	public String toString() {
		String str=id+"\t"+name+"\t"+email+"\t"+phone;
		return str;
	}
	public void show() {
		String str="["+id+","+name+","+email+","+phone+"]";
		System.out.println(str);
	}
}

public class Lab650 {

	public static void main(String[] args) {
	
		Set<Customer1> mset=new HashSet<Customer1>();
//		Set<Customer1> mset=new LinkedHashSet<Customer1>();
//		ClassCastException: Customer1 cannot be cast to java.lang.Comparable
//		Set<Customer1> mset=new TreeSet<Customer1>();
		
		mset.add(new Customer1(101,"Rohan","rohan@mail.com",995677));
		mset.add(new Customer1(102,"Roy","roy@mail.com",77677));
		mset.add(new Customer1(103,"Vsn","vsn@mail.com",332677));
		mset.add(new Customer1(104,"Seu","seu@mail.com",22144));
	
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (int)
//		mset.add(50);
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (double)
//		mset.add(8.3);
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (String)
//		mset.add("Namaste!");
		
		System.out.println(mset);
		
		System.out.println("using for");
		for(Customer1 cu:mset) {
			System.out.println(cu);
		}
		
		System.out.println("using iterator");
		Iterator<Customer1> it=mset.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
}