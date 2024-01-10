package com.utilpack;
import java.util.*;

public class Lab644 {

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
		
		System.out.println("keys and values---");
		Set mentry=m1.entrySet();
		for(Object ob:mentry) {
			Map.Entry mm=(Map.Entry)ob;
			Object mkey=mm.getKey();
			Object mval=mm.getValue();
			System.out.println(mkey+":\t"+mval);
		}
		
		Map cM=new HashMap();
		
		cM.put("cname", "Java");
		cM.put("mode", "online");
		cM.put("Time", 6);
		
		System.out.println(cM);
		System.out.println(cM.size());
		m1.putAll(cM);
		System.out.println(m1);
		System.out.println(m1.size());
	}
}