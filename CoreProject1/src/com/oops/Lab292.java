package com.oops;

public class Lab292 {

	public static void main(String[] args) {
		Methre13 m=new Methre13();
		System.out.println(m.isDigit('A'));
		System.out.println(m.isDigit('8'));
	}

}
class Methre13{
	boolean isDigit(char ch) {
		System.out.println("isdigit():"+ch);
		if(ch>=48 && ch<=57)
			return true;
		else 
			return false;
	}
}