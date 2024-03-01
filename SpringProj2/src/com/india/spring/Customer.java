package com.india.spring;
import java.util.*;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private List<String>emails;
	private Set<Integer>phones;
	private Map<String,Integer> refs;
	private Properties myprops;	
	private Address address;
	private List<Account> accounts;
	
	public Customer() {}
	public Customer(int cid,String cname,String email,long phone) {
		super();
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		this.phone=phone;
	}
	
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Set<Integer> getPhones() {
		return phones;
	}
	public void setPhones(Set<Integer> phones) {
		this.phones = phones;
	}
	public Map<String, Integer> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}
	public Properties getMyprops() {
		return myprops;
	}
	public void setMyprops(Properties myprops) {
		this.myprops = myprops;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
