package com.systemclass;
import java.io.*;
import java.util.*;

public class Lab526 {

	public static void main(String[] args) {
		System.out.println("Hello Guys");
		System.err.println("Hello!");
		
		PrintStream ps1=System.out;
		ps1.println("Hii Guys");
		PrintStream ps2=System.err;
		ps2.println("Hii!");
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		Properties pr=System.getProperties();
		System.out.println(pr);
		System.out.println("***************");
		
		System.setProperty("my.web.site","javalang.com");
		System.setProperty("trainer.name","raj sir");
		
		Enumeration em=pr.propertyNames();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		System.out.println("----------------");
		System.out.println(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(System.getProperty("trainer.name"));
		
		System.out.println("1.--------");
		System.exit(0);
		System.out.println("2.-------");
		System.out.println("main end");
		
	}

}
