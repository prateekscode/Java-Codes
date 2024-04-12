package com.java8.methodRefrnce;

public class ExStudent {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExStudent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ExStudent [name=" + name + "]";
	}
	
}
