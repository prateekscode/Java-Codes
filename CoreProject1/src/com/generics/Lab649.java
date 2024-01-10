package com.generics;
import java.util.*;
class Customer{
	int id;
	String name;
	String email;
	long phone;
	
	Customer(){}
	Customer(int id, String name,String email,long phone){
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

public class Lab649 {

	public static void main(String[] args) {
		
		List<Customer> cl=new ArrayList<Customer>();
//		List<Customer> cl=new LinkedList<Customer>();
		
		cl.add(new Customer(101,"Rohan","rohan@mail.com",995677));
		cl.add(new Customer(102,"Roy","roy@mail.com",77677));
		cl.add(new Customer(103,"Vsn","vsn@mail.com",332677));
		cl.add(new Customer(104,"Seu","seu@mail.com",22144));
		
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (int)
//		cl.add(50);
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (double)
//		cl.add(8.3);
//		The method add(int, Customer) in the type List<Customer> is not applicable for the arguments (String)
//		cl.add("Namaste!");
		
		System.out.println(cl);
		
		System.out.println("using for");
		for(Customer cu:cl) {
			System.out.println(cu);
		}
		
		System.out.println("using iterator");
		Iterator<Customer> it=cl.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
