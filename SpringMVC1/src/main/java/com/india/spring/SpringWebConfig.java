package com.india.spring;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({ "com.india.spring" })
public class SpringWebConfig {
	static {
		System.out.println("SIB-- SpringWebConfig");
	}
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
