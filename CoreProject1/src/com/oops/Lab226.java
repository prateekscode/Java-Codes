package com.oops;

public class Lab226 {

	public static void main(String[] args) {	        
		//System.out.println(Hello.a);
	        Hello h=new Hello();
	        System.out.println(h.a);
	        h.a=100;
	        System.out.println(h.a);
	        h.a=1000;
	        System.out.println(h.a);
	        System.out.println("******************************************");
	        Hello h1=new Hello();
	        System.out.println(h1.a);
	        h1.a=200;
	        System.out.println(h1.a);
	        h1.a=2000;
	        System.out.println(h1.a);
	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	        Hello h2=new Hello();
	        System.out.println(h2.a);
	        h2.a=300;
	        System.out.println(h2.a);
	        h2.a=3000;
	        System.out.println(h2.a);
	        System.out.println(h.a);
	        

	    }

	}

	class Hello{
	    int a;
	    
	}