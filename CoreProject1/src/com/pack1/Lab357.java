package com.pack1;

public class Lab357 {

	public static void main(String[] args) {
		/*For calling method and class from different package in
		 *other package we must make class and methods public in the 
		 *first package, so we can access them in other package. 
		 */
		com.pack.Packsclass p1=new com.pack.Packsclass();
		p1.show();
		com.pack.Packsc1 p2=new com.pack.Packsc1();
		p2.display();
	}

}
