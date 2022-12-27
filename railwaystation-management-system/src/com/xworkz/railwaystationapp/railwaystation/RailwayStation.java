package com.xworkz.railwaystationapp;

public class RailwayStation {
	
	Platform platform[]=new Platform[3];
	int index;
	
	public RailwayStation(){
		System.out.println("RailwayStation object is created");
	}
	
	public boolean add(Platform platform){
		System.out.println("Add process is started");
		boolean isAdd=false;
		
		if(platform.platformName!=null){
			this.platform[index++]=platform;
			System.out.println("Plarform added sucessfully");
			isAdd=true;
		}
		
		System.out.println("Add process ended");
		return isAdd;
	} 
	
	public void getPlatforms(){
		System.out.println("list of platforms are:");
		for(int i=0;i<this.platform.length;i++){
			System.out.println(platform[i].platformId+" "+platform[i].platformName+" "+platform[i].platformRoute);
		}
	}

}
