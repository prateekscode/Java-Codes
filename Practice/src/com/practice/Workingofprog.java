package com.practice;

public class Workingofprog{
	public static void main(String[] args){
	New n=new New();
	n.display();
	System.out.println(n);
	}
}
class New{
	int b=89;
	static int a=90;
	{
		System.out.println("instance block");
	}
	static{
	System.out.println("static block");
	}
	New(){
	System.out.println("constructor called");
	}
	void display() {
		System.out.println("static var"+a);
		System.out.println("instance var"+b);	
	}
		
}
