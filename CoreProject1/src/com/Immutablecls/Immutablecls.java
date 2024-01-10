package com.Immutablecls;

import java.util.*;

public class Immutablecls {
	public static void main(String[] args) {
		String st = new String("RAJ");
		System.out.println(st);

	}

}

final class Emp {
	private final int eid;
	private final String ename;
	private final List<String> emails;

	public Emp(int eid, String ename, List<String> email) {
		this.eid = eid;
		this.ename = ename;

		List<String> tmpList = new ArrayList<String>();
		tmpList.addAll(email);

		this.emails = tmpList;
	}

	public List<String> getEmails() {
		return emails;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

}