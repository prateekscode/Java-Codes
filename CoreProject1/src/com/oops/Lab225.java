package com.oops;

public class Lab225 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.display();
		Customer c2=new Customer();
		c2.cid=3322;
		c2.cname="Rahul";
		c2.mob=22446688;
		c2.display();
	}

}

class Customer {
	int cid;
	String cname;
	long mob;

	void display() {
	System.out.println(cid);
	System.out.println(cname);
	System.out.println(mob);
	}
}
