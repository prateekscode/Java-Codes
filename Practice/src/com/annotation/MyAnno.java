package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//multivalued annotation
/*
 * target annotation is use to specify where to use this annotation
 * first target value is to use this annotation in class, interface, enumeration
 * if we want to use it on methods also we use second target value separated with comma
 * if we want to use it on fields also we use third target value separated with comma
 * retention annotation is use to specify in which level annotation is available means in (source, class
 * or runtime) if we specify as runtime so it is available on compiler or JVM. 
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	
	int myvalue() default 0;
	
	String name() default "Prateek";
	
	String city() default "Kanpur";
}