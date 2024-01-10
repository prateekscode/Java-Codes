package com.utilpack;

import java.util.*;

public class Lab609 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.addElement("Hello!");
		v.addElement("Hii!");
		v.addElement("Bye");
		v.addElement("Namaste!");
		
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			Object ob=en.nextElement();
			System.out.println(ob);
		}
	}

}
