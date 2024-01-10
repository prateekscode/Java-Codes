package com.utilpack;

import java.util.*;

public class Lab645 {

	public static void main(String[] args) {
		
		Map m2=new LinkedHashMap();
		m2.put("sid", 101);
		m2.put("name", "roy");
		m2.put("email", "roy@mail.com");
		m2.put("phone", 99887755);
		m2.put("City", "kanpur");	
		m2.put(null, 1234);
		System.out.println(m2);
		
		m2.put("sid", 555);
		m2.put(null, 555);
		System.out.println(m2);
		
		System.out.println("Keys and values");
		Set mset1=m2.keySet();
		for(Object ob: mset1) {
			Object mval=m2.get(ob);
					System.out.println(ob+":\t"+mval);
		}
	}

}
