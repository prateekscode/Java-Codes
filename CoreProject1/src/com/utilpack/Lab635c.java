package com.utilpack;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Lab635c {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "RAJ", 123456);
		Emp e2 = new Emp(202, "SUJATA", 987654);
		Emp e3 = new Emp(303, "SEEMA", 654328);
		Emp e4 = new Emp(404, "ANUSHA", 9867544);
		Emp e5 = new Emp(505, "SANDEEP", 7654321);
		Emp e6 = new Emp(202, "SUJATA", 987654);

		Set empSet = new TreeSet();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e6);
		System.out.println(empSet);

		System.out.println("********Sort by Emp Id***********");

		Set empSetByID = new TreeSet(new SortByEmpID());
		empSetByID.add(e1);
		empSetByID.add(e2);
		empSetByID.add(e3);
		empSetByID.add(e4);
		empSetByID.add(e5);
		empSetByID.add(e6);

		System.out.println(empSetByID);

		System.out.println("********Sort by Emp name***********");
		Set empSetByName = new TreeSet(new SortByEmpName());
		empSetByName.add(e1);
		empSetByName.add(e2);
		empSetByName.add(e3);
		empSetByName.add(e4);
		empSetByName.add(e5);
		empSetByName.add(e6);
		System.out.println(empSetByName);

		System.out.println("********Sort by Emp Phone Number***********");
		Set empSetByPhone = new TreeSet(new SortByEmpPhone());
		empSetByPhone.add(e1);
		empSetByPhone.add(e2);
		empSetByPhone.add(e3);
		empSetByPhone.add(e4);
		empSetByPhone.add(e5);
		empSetByPhone.add(e6);
		System.out.println(empSetByPhone);

		System.out.println("********Sort by Emp name in DESC Order***********");
		Set empSetByNameInDESC = new TreeSet(new SortByEmpNameInDesc());
		empSetByNameInDESC.add(e1);
		empSetByNameInDESC.add(e2);
		empSetByNameInDESC.add(e3);
		empSetByNameInDESC.add(e4);
		empSetByNameInDESC.add(e5);
		empSetByNameInDESC.add(e6);
		System.out.println(empSetByNameInDESC);

	}

}

class Emp implements Comparable {
	int eid;
	String ename;
	long phone;

	Emp(int eid, String ename, long phone) {
		this.eid = eid;
		this.ename = ename;
		this.phone = phone;

	}

	@Override
	public String toString() {
		return "EID:" + eid + " ENAME:" + ename + " PHONE:" + phone;
	}

	@Override
	public int compareTo(Object o) {
		Emp e = (Emp) o;

		return this.eid - e.eid;
	}
}

class SortByEmpID implements Comparator {

	public int compare(Object o1, Object o2) {

		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.eid - e2.eid;
	}

}

class SortByEmpName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.ename.compareTo(e2.ename);
	}

}

class SortByEmpPhone implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return (int) (e1.phone - e2.phone);
	}

}

class SortByEmpNameInDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e2.ename.compareTo(e1.ename);
	}

}