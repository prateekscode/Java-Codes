package com.utilpack;
import java.util.*;
public class Lab674 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("ok");
		list.add("Hii");
		list.add("see u");
		list.add("Hii");
		list.add("Evening");
		
		List<String> tl=new ArrayList<>();
		tl.add("Test1");
		tl.add("Test2");
		tl.add("Test3");
		
		System.out.println("List: "+list);
		System.out.println("TestList: "+tl);
		
		Collections.copy(list, tl);
		
		System.out.println("List: "+list);
		System.out.println("TestList: "+tl);
		
		System.out.println("=============");
		tl.add("Test3");
		tl.add("Test3");
		tl.add("Test3");
		
		System.out.println("List: "+list);
		System.out.println("TestList: "+tl);
		
		System.out.println("----------------");
		Collections.copy(list, tl);
		
		System.out.println("List: "+list);
		System.out.println("TestList: "+tl);
		
	}

}
