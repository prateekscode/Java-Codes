package com.utilpack;
import java.util.*;

public class Lab643 {

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
		
		System.out.println("Keys only---------");
		Set mset=m1.keySet();
		for(Object k:mset) {
			System.out.println(k);
		}
		
		System.out.println("Values only--------");
		Collection mset1=m1.values();
		for(Object val:mset1) {
			System.out.println(val);
		}
		
		System.out.println("Keys and values-----");
		Set mset2=m1.keySet();
		for(Object val:mset2) {
			Object mval=m1.get(val);
			System.out.println(val+":\t"+mval);
		}
	}
}