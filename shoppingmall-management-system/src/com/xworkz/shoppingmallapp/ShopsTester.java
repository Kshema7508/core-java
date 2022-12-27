package com.xworkz.shoppingmallapp;

public class ShopsTester {
	
	public static void main(String sho[]){
		
		System.out.println("Main method stared");
		
		ShoppingMall shoppingmall=new ShoppingMall();
		
		Shops shops=new Shops(1,"Trends");
		shoppingmall.add(shops);
		
		Shops shops1=new Shops(2,"Zudio");
		shoppingmall.add(shops1);
		
		
		shoppingmall.getShop();
		
		System.out.println("Main method ended");
	}

}
