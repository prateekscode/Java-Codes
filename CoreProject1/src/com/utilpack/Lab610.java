package com.utilpack;

import java.util.*;

public class Lab610 {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put(101, "RAJ");
		p.put(201, "SANDEEP");
		p.put(301, "ROHIT");
		p.put(401, "SIVA");
		p.put(501, "SONU");
		p.put(601, "PRATEEK");
		System.out.println(p);

		System.out.println("Accessing the Properties collection...");
		Enumeration e = p.keys();

		while (e.hasMoreElements()) {
			Integer key = (Integer) e.nextElement();

			System.out.println(key + "");

		}
	}

	Properties p1 = new Properties();
	p1.put("RAJ","rj@gmail.com");
	p1.put("SANDEEP","sp@gmail.com");
	p1.put("ROHIT","ro@gmail.com");

	System.out.println(p1);

	Enumeration e2=p1.propertyNames();
	while(e2.hasMoreElements())
	{
			String key=(String)e2.nextElement();
			String value=(String)p1.get(key);
			System.out.println(key +"\t"+value);
        }        
}
