package com.utilpack;
import java.util.*;

class Lab610a {
	public static void main(String as[]) {
		Properties p = new Properties();
		p.put("hii", "hii@gmail.com");
		p.put("hello", "hello@gmail.com");
		p.put("bye", "bye@gmail..com");
		System.out.println(p);
		Enumeration enm = p.propertyNames();
		while (enm.hasMoreElements()) {
			String pname = (String) enm.nextElement();
			String pvalue = (String) p.get(pname);
			System.out.println(pname +"- \t " + pvalue);
		}
	}
}