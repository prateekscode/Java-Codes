package com.javabeantest;

import com.javabean.UserBean;

public class Test {

	public static void main(String[] args) {
		UserBean ub=new UserBean();
		ub.setUserId("PG101");
		ub.setUserName("PrateeksCode");
		
		String Uid=ub.getUserId();
		String Uname=ub.getUserName();
		System.out.println(Uid);
		System.out.println(Uname);
		

		System.out.println(ub);
	}

}
