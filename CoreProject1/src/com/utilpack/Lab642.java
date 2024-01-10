package com.utilpack;

import java.util.*;

public class Lab642 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		
		m1.put("sid", 101);
		m1.put("name", "roy");
		m1.put("email", "roy@mail.com");
		m1.put("phone", 99887755);
		m1.put("City", "kanpur");
		
		System.out.println(m1);
		
		System.out.println(m1.containsKey("email"));
		System.out.println(m1.containsKey("City"));
		System.out.println(m1.containsKey("mycity"));
		
		System.out.println(m1.containsValue(101));
		System.out.println(m1.containsValue("ro"));
		System.out.println(m1.containsValue("kanpur"));
		
		System.out.println(m1.remove("sid"));
		System.out.println(m1.remove("roy"));
		
		System.out.println(m1.replace("name", "Jay"));
		System.out.println(m1.replace("City", "Lucknow"));
		
		System.out.println(m1);
		System.out.println(m1.put("City", "Kanpur"));
		System.out.println(m1);
		System.out.println(m1.replace("City", "CNB"));
		System.out.println(m1);
		m1.clear();
		System.out.println(m1);
	}
}