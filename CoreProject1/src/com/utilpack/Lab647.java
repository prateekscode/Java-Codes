package com.utilpack;

import java.util.*;

public class Lab647 {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put("sid", 101);
		ht.put("name", "roy");
		ht.put("email", "roy@mail.com");
		ht.put("phone", 998877);
		ht.put(12345, 99.99);
//		Exception in thread "main" java.lang.NullPointerException
//		ht.put("city", null);
//		ht.put(999.99, null);
//		ht.put(null, 1234);
		
		System.out.println(ht);
		
		System.out.println("----Keys and Values----");
		Set mset1=ht.keySet();
		for(Object ob:mset1) {
			Object mval=ht.get(ob);
			System.out.println(ob+":\t"+mval);
		}
	}

}
