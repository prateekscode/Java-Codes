package com.oops;

public class Lab262 {

	public static void main(String[] args) {
		cons2 c=new cons2(101,"Rohan");
		c.show();
		cons2 c1=new cons2(102,"Rahul");
		c1.show();
		cons2 c2=new cons2(103,"Jenny");
		c2.show();
		
	}

}
class cons2{
	int sid;
	String sname;
	cons2(int sn, String name){
		System.out.println("constructor with parameters");
		sid=sn;
		sname=name;
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}