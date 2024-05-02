package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

}
public class ComparableEx{
	public static void main(String[] args) {
		List<Movie> list=new ArrayList<Movie>();
		list.add(new Movie(7.6,"Zen",2015));
		list.add(new Movie(9.6,"Ben",2017));
		list.add(new Movie(5.4,"Qen",2013));
		list.add(new Movie(3.2,"Men",2019));
		
		Collections.sort(list);
		
		for(Movie m: list)
			System.out.println(m.getYear());
	}
}