package com.india.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	public A createA() {
		A a=new A();
		a.setA(111);
		a.setMsg("From A");
		return a;
	}
	
	@Bean("BO")
	public B createB() {
		B b=new B(101,"Rahul");
		return b;
	}
	
	@Bean("Mhello")
	//@Scope("prototype")
	@Lazy(true)
	public Hello createH(A a,B b) {
		Hello h=new Hello(b);
		h.setObj1(a);
		return h;
	}
	}
