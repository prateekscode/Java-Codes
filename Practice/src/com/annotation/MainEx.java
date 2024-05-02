package com.annotation;

import java.lang.annotation.Annotation;

public class MainEx {
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		Class c=demo.getClass();
		System.out.println(c.getName());
		
		MyAnno annotation = (MyAnno) c.getAnnotation(MyAnno.class);
		System.out.println(annotation.myvalue());
		System.out.println(annotation.name());
		System.out.println(annotation.city());
		
	}
}
