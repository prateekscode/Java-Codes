package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
	public static void main(String[] args) {
		
		//Exception in thread "Thread-0" java.util.ConcurrentModificationException
//		List<String> list=new ArrayList<String>();
		//now it is thread safe
		List<String> list=new CopyOnWriteArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		list.add("sixth");
		
		Runnable r1=()->{
			for (String string : list) {
				System.out.println(string);
			}
		};
		Runnable r2=()->{
			list.add("new obj 1");
			list.add("new obj 2");
			list.add("new obj 3");
		};
		
		Thread t=new Thread(r1);
		t.start();
		
		Thread t2=new Thread(r2);
		t2.start();
		
		
		}
}
