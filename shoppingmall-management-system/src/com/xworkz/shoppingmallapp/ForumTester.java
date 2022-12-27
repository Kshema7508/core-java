package com.xworkz.shoppingmallapp;

public class ForumTester {
	
	public static void main(String a[]){
		
		System.out.println("Main method stared");
		
		Forum forum=new Forum();
		
		Shops shops=new Shops(1,"Trends");
		forum.add(shops);
		
		Shops shops1=new Shops(2,"Zudio");
		forum.add(shops1);
		
		
		forum.getShop();
		
		System.out.println("Main method ended");
	}

}
