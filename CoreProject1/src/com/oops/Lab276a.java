package com.oops;

public class Lab276a {
	
	    public static void main(String[] args) {
	        System.out.println("Main started..");
	        Hello7 ref=new Hello7(25);
	        System.out.println(ref.a);
	        System.out.println(Hello7.name);
	        
	        ref.show(10);
	        
	        Hello7.hai();
	        System.out.println("Main ended...");
	    }

	}

	class Hello7{
	    int a;
	    static String name="RAJ";
	    {
	        System.out.println("IIB...");
	    }
	    static {
	        System.out.println("SIB....");
	    }
	    Hello7(){
	        System.out.println("Default const Hello7()...");
	    }
	    
	    Hello7(int a){
	        System.out.println("Parametric const.. Hello7(int a)");
	        this.a=a;
	    }
	    
	    void show(int a) {
	        System.out.println("show");
	        System.out.println(a);
	        System.out.println(this.a);
	        System.out.println(name);
	    }
	    
	    static void hai() {
	        System.out.println("hai");
	        Hello7 h1=new Hello7();
	        System.out.println(h1.a);
	        System.out.println(name);
	    }
	}
