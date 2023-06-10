package com.xworkz.donationapp.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.donationapp.constants.ApplicationConstant;

public class DonationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	public DonationWebInit() {
		
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] {DonationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
	
		int maxSize=ApplicationConstant.MAX_FILE_SIZE;
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement(ApplicationConstant.TEMP_FILE_LOCATION, maxSize, maxSize*2, maxSize/2);
		 
		registration.setMultipartConfig(multipartConfigElement);
	}

}
