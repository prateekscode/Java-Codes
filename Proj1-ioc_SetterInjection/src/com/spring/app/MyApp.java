package com.spring.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.beans.MessageGenerator;

public class MyApp {

	public static void main(String[] args) {
		Resource res=new FileSystemResource("src/com/spring/cfgs/ApplicationContext.xml");
		
		//Bean factory object
		BeanFactory beanFactory =new XmlBeanFactory(res);
		MessageGenerator msgGenerator=(MessageGenerator)beanFactory.getBean("msgGenerate");
		String msg=msgGenerator.generateMsg("Prateek");
		System.out.println(msg);
	}

}
