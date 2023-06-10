package com.xworkz.donationapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.donationapp")
@EnableWebMvc
public class DonationConfiguration implements WebMvcConfigurer{
//default methods
	
	public DonationConfiguration() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//to handle static resources by DefaultServlet
		configurer.enable();
	}
	
	//addViewControllers() is used to change the default view. Default view is index.jsp. By using addViewControllers() we can change index.jsp to BloodGroup.jsp
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("start"); 
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() {
		
		LocalContainerEntityManagerFactoryBean lc=new LocalContainerEntityManagerFactoryBean();
		lc.setPersistenceUnitName("jpa");
		return lc;
	}
	
}
