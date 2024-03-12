package com.india.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="hai")	//if there is more than one bean then it will find with the reference name.
	public Hai createHai() {
		Hai h=new Hai();
		return h;
	}
	


	
	@Bean(name="hello")
	public Hello createHello(Hai hai) {
		Hello h=new Hello();
		h.setHai(hai);
		return h;
	}

}
