package com.cjc.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

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
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/javabased_product_order");
		dm.setUsername("root");
		dm.setPassword("root");
		
		
		return dm;	
	}
	
	@Bean
	public LocalSessionFactoryBean localSession()
	{
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(driverManager());
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		
		sf.setHibernateProperties(p);
		sf.setAnnotatedClasses(ProductInfo.class,OrderInfo.class);
		
		return sf;
		
		
	}
}
