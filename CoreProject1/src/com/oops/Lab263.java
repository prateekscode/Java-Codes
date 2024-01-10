package com.oops;

public class Lab263 {

	public static void main(String[] args) {
		cons3 c=new cons3(101,"rohan","r@gmail.com",995677);
		c.display();
		cons3 c1=new cons3(102,"Rahul","r1@yahoo.com");
		c1.display();
		cons3 c2=new cons3(103,"Jenny");
		c2.display();
		cons3 c3=new cons3();
	}

}
class cons3{
	int sid;
	String sname;
	String email;
	long phone;
	cons3(int id,String name,String mail,long mob){
		System.out.println("4 parameter constructor.");
		sid=id;
		sname=name;
		email=mail;
		phone=mob;
	}
	cons3(int id,String name,String mail){
		System.out.println("3 parameter constructor");
		sid=id;
		sname=name;
		email=mail;
	}
	cons3(int id,String name){
		System.out.println("2 parameter constructor");
		sid=id;
		sname=name;
	}
	cons3(){
		System.out.println("Default constructor");
	}
	void display() {
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
	}
}