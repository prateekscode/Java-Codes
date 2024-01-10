package com.utilpack;

import java.util.*;

public class Lab646 {

	public static void main(String[] args) {
		
		Map m2=new TreeMap();
		m2.put("sid", 101);
		m2.put("name", "roy");
		m2.put("email", "roy@mail.com");
		m2.put("phone", 99887755);
		m2.put("City", null);
		
//		ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//		m2.put(12345,99.99);
//		ClassCastException: java.lang.String cannot be cast to java.lang.Double
//		m2.put(999.9, null);
//		Exception in thread "main" java.lang.NullPointerException
//		m2.put(null,1234);
		
		System.out.println(m2);
		
		System.out.println("kEYS AND VALUES-----");
		Set mset2=m2.keySet();
		for(Object obj:mset2) {
			Object mval=m2.get(obj);
			System.out.println(obj+":\t"+mval);
		}
		
	}

}
