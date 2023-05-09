package com.xworkz.laptopapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.laptopapp")
public class SpringConfig {

	@Bean
	public ViewResolver getViewResolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}
}
