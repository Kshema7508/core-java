package com.xworkz.shoppingmallapp;

public class ShoppingMall {
	
	Shops shops[]=new Shops[2];
	int index;
	
	public ShoppingMall(){
		System.out.println("ShoppingMall object is created");
	}
	
	public boolean add(Shops shops){
		System.out.println("Add process is started");
		boolean isAdd=false;
		
		if(shops.shopsName!=null){
			this.shops[index++]=shops;
			System.out.println("Shops added sucessfully");
			isAdd=true;
		}
		
		System.out.println("Add process ended");
		return isAdd;
	} 
	
	public void getShop(){
		System.out.println("list of shopes are:");
		for(int i=0;i<this.shops.length;i++){
			System.out.println(shops[i].shopsId+" "+shops[i].shopsName);
		}
	}

}
