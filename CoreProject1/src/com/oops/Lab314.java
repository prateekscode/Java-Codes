package com.oops;

public class Lab314 {

	public static void main(String[] args) {
		Varargs4 v=new Varargs4();
		// The method display(int, int...) in the type Varargs4 is not applicable for the arguments ().
//		v.display();
		v.display(50, new int[] {43,43,43});
	}

}
class Varargs4{
	void display(int a,int...arr) {
		System.out.println("display(int,int...)");
	}
}