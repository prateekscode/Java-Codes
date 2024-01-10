package com.utilpack;
import java.util.*;
public class Lab677 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		List<String> slist=Collections.synchronizedList(list);
		
		System.out.println(list);
		System.out.println(slist);
		
		List<String> sinlist=Collections.singletonList("ABC");
		
		System.out.println(sinlist);
		slist.add("Hey!");
		slist.set(0, "GO");
	}

}
