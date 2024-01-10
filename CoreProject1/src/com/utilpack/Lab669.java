package com.utilpack;
import java.util.*;

class StringDescCmparator implements Comparator<String>{
	public int compare(String s1,String s2) {
		int x=s2.compareTo(s1);
		return x;
	}
}
public class Lab669 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Abhay");
		list.add("Dorito");
		list.add("Charles");
		list.add("Base");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,new StringDescCmparator());
		System.out.println(list);
	}

}
