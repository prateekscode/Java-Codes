package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movies implements Comparable<Movies> {

	private int year;
	private double rating;
	private String name;

	public Movies(int year, double rating, String name) {
		this.year = year;
		this.rating = rating;
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Movies o) {
		
		return this.year - o.year;
	}

}

class RatingComp implements Comparator<Movies>{
	@Override
	public int compare(Movies o1, Movies o2) {
		
		if(o1.getRating()<o2.getRating())
			return -1;
		
		if(o1.getRating()<o2.getRating())
			return 1;
		
		return 0;
	}
}

class NameComp implements Comparator<Movies>{
	@Override
	public int compare(Movies o1, Movies o2) {
		//comparing according to first letter
		return o1.getName().compareTo(o2.getName());
		//comparing according to length
//		return o2.getName().length()-o1.getName().length();
	}
}


public class ComparatorEx {
	public static void main(String[] args) {
		List<Movies> list=new ArrayList<Movies>();
		list.add(new Movies(2018,8.3,"Rustom"));
		list.add(new Movies(2013,7.3,"Oggy"));
		list.add(new Movies(1999,9.3,"LionKing"));
		list.add(new Movies(2020,7.8,"MIB"));
		list.add(new Movies(2000,6.5,"JungleSafari"));
		
		RatingComp r=new RatingComp();
		Collections.sort(list,r);
		
		for(Movies m:list)
			System.out.println(m.getRating());
		
		NameComp n=new NameComp();
		Collections.sort(list,n);
		
		for(Movies m1:list)
			System.out.println(m1.getName());
		
		Collections.sort(list);
		for(Movies m2:list)
			System.out.println(m2.getYear());
		
	}
}
