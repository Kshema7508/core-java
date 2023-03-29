package com.xworkz.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TesterFiveTimes {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Train train=applicationContext.getBean("train",Train.class);
		System.out.println(train);
		Train train1=applicationContext.getBean("train1",Train.class);
		System.out.println(train1);
		Train train2=applicationContext.getBean("train2",Train.class);
		System.out.println(train2);
		Train train3=applicationContext.getBean("train3",Train.class);
		System.out.println(train3);
		Train train4=applicationContext.getBean("train4",Train.class);
		System.out.println(train4);
		
		Glass glass=applicationContext.getBean("glass",Glass.class);
		System.out.println(glass);
		Glass glass1=applicationContext.getBean("glass1",Glass.class);
		System.out.println(glass1);
		Glass glass2=applicationContext.getBean("glass2",Glass.class);
		System.out.println(glass2);
		Glass glass3=applicationContext.getBean("glass3",Glass.class);
		System.out.println(glass3);
		Glass glass4=applicationContext.getBean("glass4",Glass.class);
		System.out.println(glass4);
		
		Kitchen kitchen=applicationContext.getBean("kitchen",Kitchen.class);
		System.out.println(kitchen);
		Kitchen kitchen1=applicationContext.getBean("kitchen1",Kitchen.class);
		System.out.println(kitchen1);
		Kitchen kitchen2=applicationContext.getBean("kitchen2",Kitchen.class);
		System.out.println(kitchen2);
		Kitchen kitchen3=applicationContext.getBean("kitchen3",Kitchen.class);
		System.out.println(kitchen3);
		Kitchen kitchen4=applicationContext.getBean("kitchen4",Kitchen.class);
		System.out.println(kitchen4);
		
		Laptop laptop=applicationContext.getBean("laptop",Laptop.class);
		System.out.println(laptop);
		Laptop laptop1=applicationContext.getBean("laptop1",Laptop.class);
		System.out.println(laptop1);
		Laptop laptop2=applicationContext.getBean("laptop2",Laptop.class);
		System.out.println(laptop2);
		Laptop laptop3=applicationContext.getBean("laptop3",Laptop.class);
		System.out.println(laptop3);
		Laptop laptop4=applicationContext.getBean("laptop4",Laptop.class);
		System.out.println(laptop4);
		
		Wire wire=applicationContext.getBean("wire",Wire.class);
		System.out.println(wire);
		Wire wire1=applicationContext.getBean("wire1",Wire.class);
		System.out.println(wire1);
		Wire wire2=applicationContext.getBean("wire2",Wire.class);
		System.out.println(wire2);
		Wire wire3=applicationContext.getBean("wire3",Wire.class);
		System.out.println(wire3);
		Wire wire4=applicationContext.getBean("wire4",Wire.class);
		System.out.println(wire4);
		
		FoodStall foodStall=applicationContext.getBean("foodstall",FoodStall.class);
		System.out.println(foodStall);
		FoodStall foodStall1=applicationContext.getBean("foodstall1",FoodStall.class);
		System.out.println(foodStall1);
		FoodStall foodStall2=applicationContext.getBean("foodstall2",FoodStall.class);
		System.out.println(foodStall2);
		FoodStall foodStall3=applicationContext.getBean("foodstall3",FoodStall.class);
		System.out.println(foodStall3);
		FoodStall foodStall4=applicationContext.getBean("foodstall4",FoodStall.class);
		System.out.println(foodStall4);
		
		Integer integer=applicationContext.getBean("Integer",Integer.class);
		System.out.println(integer);
		Integer integer1=applicationContext.getBean("Integer1",Integer.class);
		System.out.println(integer1);
		Integer integer2=applicationContext.getBean("Integer2",Integer.class);
		System.out.println(integer2);
		Integer integer3=applicationContext.getBean("Integer3",Integer.class);
		System.out.println(integer3);
		Integer integer4=applicationContext.getBean("Integer4",Integer.class);
		System.out.println(integer4);
		
		Character character=applicationContext.getBean("Character",Character.class);
		System.out.println(character);
		Character character1=applicationContext.getBean("Character1",Character.class);
		System.out.println(character1);
		Character character2=applicationContext.getBean("Character2",Character.class);
		System.out.println(character2);
		Character character3=applicationContext.getBean("Character3",Character.class);
		System.out.println(character3);
		Character character4=applicationContext.getBean("Character4",Character.class);
		System.out.println(character4);
		
		Short short1=applicationContext.getBean("Short",Short.class);
		System.out.println(short1);
		Short short2=applicationContext.getBean("Short1",Short.class);
		System.out.println(short2);
		Short short3=applicationContext.getBean("Short2",Short.class);
		System.out.println(short3);
		Short short4=applicationContext.getBean("Short3",Short.class);
		System.out.println(short4);
		Short short5=applicationContext.getBean("Short4",Short.class);
		System.out.println(short5);
	
		String string=applicationContext.getBean("String",String.class);
		System.out.println(string);
		String string1=applicationContext.getBean("String1",String.class);
		System.out.println(string1);
		String string2=applicationContext.getBean("String2",String.class);
		System.out.println(string2);
		String string3=applicationContext.getBean("String3",String.class);
		System.out.println(string3);
		String string4=applicationContext.getBean("String4",String.class);
		System.out.println(string4);
	}
}
