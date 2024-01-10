package com.oops;

public class Lab269 {

	public static void main(String[] args) {
		cons9 c=new cons9(101,"Rohan");
		c.show();
		cons9 c1=new cons9(102,"Rahul");
		c1.show();
	}

}
class cons9{
	int sid;
	String sname; 
	cons9(int sid,String sname){
		System.out.println("2 parameter constructor");
		//The assignment to variable sid has no effect
		sid=sid;
		sname=sname;
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}