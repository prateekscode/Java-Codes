package com.oops;

public class Lab233 {

	public static void main(String[] args) {
		  System.out.println(Hello2.b);
	        //System.out.println(Hello2.a); //instant var cannot access without object.
	        Hello2 h=new Hello2();
	        System.out.println(h.a);
	        System.out.println(h.b);
	        
	        Hello2.b=101;
	        
	        h.a=201;
	        System.out.println("***************************************");
	        System.out.println(h.a);
	        System.out.println(h.b);
	        System.out.println(Hello2.b);
	        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	        
	        Hello2 h1=new Hello2();
	        
	        System.out.println(h1.a);
	        System.out.println(h1.b);
	        System.out.println(Hello2.b);
	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	        
	        Hello2 h2=new Hello2();
	        System.out.println(h2.a);
	        System.out.println(h2.b);
	        System.out.println(Hello2.b);
	        h2.b=555555;
	        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	        
	        System.out.println(h.b);
	        System.out.println("###################################");
	        Hello2.b=7777777;
	        System.out.println(h.b);
	        System.out.println(h1.b);
	        System.out.println(h2.b);
	        System.out.println(Hello2.b);

	    }

	}

	class Hello2{
	    
	    static int b;
	    int a;
	}