package com.prateeks.test;

import com.prateeks.components.Test;

public class TestingNewInstance1 {

	public static void main(String[] args) {
		Class c=null;
		try {
			c=Class.forName(args[0]);
			Object obj=c.newInstance();
			//typecasting
			Test t=(Test)obj;
			System.out.println(t);
		}
		catch(InstantiationException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ev) {
			ev.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
