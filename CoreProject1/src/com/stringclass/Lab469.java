package com.stringclass;

class Customer{
	public String toString() {
		return "I am Customer";
	}
}
class Account{
}

public class Lab469 {

	public static void main(String[] args) {
		Customer c=new Customer();
		Account a=new Account();
		
		String str1=String.valueOf(c);
		System.out.println(str1);
		
		String str2=String.valueOf(a);
		System.out.println(str2);
	}

}
