package com.cjc.utility;

import java.util.Properties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Address;
import com.cjc.model.Student;

@ComponentScan(basePackages = "com.cjc")
@EnableWebMvc
@Configuration
public class AppConfig {

	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver ir=new InternalResourceViewResolver();
		ir.setSuffix(".jsp");
		return ir;
	}
	@Bean
	public DriverManagerDataSource driverManager()
	{
		DriverManagerDataSource dmd=new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/springotomapping");
		dmd.setUsername("root");
		dmd.setPassword("root");
		return dmd;
		
	}
	@Bean
	public LocalSessionFactoryBean LocalSession()
	{
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(driverManager());
		
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		lsf.setHibernateProperties(p);
		lsf.setAnnotatedClasses(Student.class,Address.class);
		return lsf;
	}
}
