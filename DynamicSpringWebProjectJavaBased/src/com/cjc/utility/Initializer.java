package com.cjc.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
	
		AnnotationConfigWebApplicationContext ac=new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		ac.setServletContext(sc);
		
		ServletRegistration.Dynamic sr=sc.addServlet("dispatcher", new DispatcherServlet(ac));
		sr.addMapping("/");
		
	}

}
