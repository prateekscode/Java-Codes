package com.india.spring;

import java.util.*;
import org.springframework.context.annotation.Bean;

public class Config {

	@Bean(name = "myemails")
	public List<String> getEmails() {
		System.out.println("Config-getEmails()");
		List<String> ems = new ArrayList<>();
		ems.add("A@mail.com");
		ems.add("B@mail.com");
		ems.add("C@mail.com");
		ems.add("D@mail.com");
		return ems;
	}

	@Bean(name = "myphones")
	public Set<Integer> getPhones() {
		System.out.println("Config-getPhones()");
		Set<Integer> phs = new TreeSet<>();
		phs.add(112233);
		phs.add(774488);
		phs.add(996633);
		phs.add(745896);
		return phs;
	}

	@Bean(name = "myrefs")
	public List<String> getRefs() {
		System.out.println("Config-getRefs()");
		List<String> ems = new ArrayList<>();
		ems.add("A@mail.com");
		ems.add("B@mail.com");
		ems.add("C@mail.com");
		ems.add("D@mail.com");
		return ems;
	}

	@Bean(name = "myprops")
	public Properties getProps() {
		System.out.println("Config-getProps()");
		Properties props = new Properties();
		props.put("A", 11);
		props.put("B", 22);
		props.put("C", 33);
		props.put("D", 44);
		return props;
	}

	@Bean(name = "myadd")
	public Address getAdd() {
		System.out.println("Config -getAdd() ");
		Address add = new Address();
		add.setStreet("Kidwai Nagar");
		add.setCity("Kanpur");
		add.setState("UP");
		return add;
	}

	@Bean(name = "myaccs")
	public List<Account> getAccounts() {
		System.out.println("Config -getAccounts() ");
		List<Account> myaccs = new ArrayList<>();
		myaccs.add(new Account(101, "SA", 15000));
		myaccs.add(new Account(102, "CA", 25000));
		myaccs.add(new Account(103, "DA", 35000));
		return myaccs;
	}

	@Bean(name = "mycust")
	public Customer createCustomer(List<String> myemails, Set<Integer> myphones, Map<String, Integer> myrefs,
			Properties myprops, Address myadd, List<Account> myaccs) {
		System.out.println("Config -createCustomer() ");
		Customer cust = new Customer(101, "Jack", "Jack@mail.com", 12345);
		cust.setEmails(myemails);
		cust.setPhones(myphones);
		cust.setRefs(myrefs);
		cust.setMyprops(myprops);
		cust.setAddress(myadd);
		cust.setAccounts(myaccs);
		return cust;
	}
}
