package com.xworkz.railwaystationapp;

public class MysoreRailwayStationTester {
	
	public static void main(String a[]){
		
		System.out.println("Main method started");
		
		MysoreRailwayStation mysorerailwaystation=new MysoreRailwayStation();
		
		Platform platform=new Platform(1,"Kengeri", "Mysore");
		mysorerailwaystation.add(platform);
		
		Platform platform1=new Platform(2,"Nagsandra", "Mangalore");
		mysorerailwaystation.add(platform1);
		
		Platform platform2=new Platform(3,"Magdi", "Bangalore");
		mysorerailwaystation.add(platform2);
		
		
		mysorerailwaystation.getPlatforms();
		
		System.out.println("Main method ended");
	}

}
