package com.xworkz.springmaven;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Person person=applicationContext.getBean("person",Person.class);
		System.out.println(person);
		
		Person person1=applicationContext.getBean("person1",Person.class);
		System.out.println(person1);
		
		Train train=applicationContext.getBean(Train.class);
		System.out.println(train);
		
		Glass glass=applicationContext.getBean(Glass.class);
		System.out.println(glass);
		
		String str=applicationContext.getBean(String.class);
		System.out.println(str);
		
		Integer integer=applicationContext.getBean(Integer.class);
		System.out.println(integer);
		
		Byte byte1=applicationContext.getBean(Byte.class);
		System.out.println(byte1);
		
		Float float1=applicationContext.getBean(Float.class);
		System.out.println(float1);
		
		Double double1=applicationContext.getBean(Double.class);
		System.out.println(double1);
		
		Character character=applicationContext.getBean(Character.class);
		System.out.println(character);
		
		Long long1=applicationContext.getBean(Long.class);
		System.out.println(long1);
		
		Short short1=applicationContext.getBean(short.class);
		System.out.println(short1);
		
		Boolean boolean1=applicationContext.getBean(Boolean.class);
		System.out.println(boolean1);
		
		Scanner sc=applicationContext.getBean(Scanner.class);
		System.out.println(sc);
	}
}
