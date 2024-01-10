package com.innerclass;

abstract class Person3{
	public abstract void sleeping3();
}
public class Lab442 {

	public static void main(String[] args) {
		Person3 p3=new Person3() {
			public void sleeping3() {
				System.out.println("student3 sleeping.");
			}
		};
		p3.sleeping3();		
	}

}
