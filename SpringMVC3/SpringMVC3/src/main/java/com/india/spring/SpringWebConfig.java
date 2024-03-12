package com.india.spring;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({ "com.india.spring", "com.raj.spring" })
public class SpringWebConfig {
	static {
		System.out.println("SIB -- SpringWebConfig");
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp"); // /show.jsp
		return viewResolver;
	}

	@Bean
	public DriverManagerDataSource getDS() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/test");
	ds.setUsername("root");
	ds.setPassword("ROOT");
	return ds;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
		factory.setHibernateProperties(props); // 1
		factory.setDataSource(dataSource); // 2
		factory.setPackagesToScan("com.india.spring"); // 3
		return factory;
	}

	@Bean
	public HibernateTemplate hTemp(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}

	@Bean
	public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
}
