package com.india.spring;

import org.springframework.web.servlet.support.*;

public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" ** getRootConfigClasses **");
		return new Class[] { SpringWebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" ** getServletConfigClasses **");
		return new Class[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" ** getServletMappings **");
		return new String[] { "*.do" };
	}
}