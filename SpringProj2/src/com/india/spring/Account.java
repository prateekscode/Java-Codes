package com.india.spring;

public class Account {
	private int accno;
	private String atype;
	private double bal;
	
	public Account() {}

	public Account(int accno, String atype, double bal) {
		this.accno = accno;
		this.atype = atype;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
}
