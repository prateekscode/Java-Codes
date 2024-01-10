package com.utilpack;
import java.util.*;

public class Lab641 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		
		m1.put("sid", 101);
		m1.put("name", "roy");
		m1.put("email", "roy@mail.com");
		m1.put("phone", 99887755);
//		The method put(Object, Object) in the type Map is not applicable for the arguments (int)
//		m1.put(852852);
		m1.put(null, null);
		
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		
		System.out.println(m1);
		
		System.out.println(m1.get("email"));
		System.out.println(m1.get("phone"));
	}

}
