package com.generics;
import java.util.*;
class Customer2{
	int id;
	String name;
	String email;
	long phone;
	
	Customer2(){}
	Customer2(int id, String name,String email,long phone){
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
public class LAb653 {

	public static void main(String[] args) {
	
		Customer2 cu=new Customer2(101,"Rohan","rohan@mail.com",99567);
		Customer2 cu2=new Customer2(102,"Roy","roy@mail.com",77677);
		Customer2 cu3=new Customer2(103,"Vsn","vsn@mail.com",332677);
		Customer2 cu4=new Customer2(104,"Seu","seu@mail.com",22144);
		
//		Map<Integer,Customer2> mmap=new HashMap<Integer,Customer2>();
//		Map<Integer,Customer2> mmap=new LinkedHashMap<Integer,Customer2>();
		Map<Integer,Customer2> mmap=new TreeMap<Integer,Customer2>();
	
		mmap.put(101, cu);
		mmap.put(102, cu2);
		mmap.put(103, cu3);
		mmap.put(104, cu4);
		
		System.out.println(mmap);
		
		Customer2 mcu1=mmap.get(103);
		mcu1.show();
		
		Customer2 mcu2=mmap.get(104);
		mcu2.show();
		
		System.out.println("Display All-----");
		Set<Integer> mkey=mmap.keySet();
		for(Integer m:mkey) {
			Customer2 cus=mmap.get(m);
			cus.show();
		}
	}
}
