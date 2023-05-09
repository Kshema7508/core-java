package com.xworkz.laptopapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LaptopWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("Initializing servlet config class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("initializing servlet config class");
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		System.out.println("Inside getServletMappings");
		return new String[] {"/"};
	}

}
