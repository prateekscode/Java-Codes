package com.oops;

public class Lab232 {

	public static void main(String[] args) {
		        System.out.println(H1.b);	//static var. can be access directly without creating object. 
		        H1.b=101;
		        System.out.println(H1.b);
		        
		    }
		  
		}

		class H1{
		    static int b;	//static variable.
		}