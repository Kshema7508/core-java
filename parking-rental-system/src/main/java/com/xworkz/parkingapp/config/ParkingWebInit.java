package com.xworkz.parkingapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ParkingWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	public ParkingWebInit() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] {ParkingConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] {"/"};
	}

}
