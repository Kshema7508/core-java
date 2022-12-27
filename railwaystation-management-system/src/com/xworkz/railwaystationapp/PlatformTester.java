package com.xworkz.railwaystationapp;

public class PlatformTester {
	
	public static void main(String pla[]){
		
		System.out.println("Main method stared");
		
		RailwayStation railwaystation=new RailwayStation();
		
		Platform platform=new Platform(1,"Kengeri", "Mysore");
		railwaystation.add(platform);
		
		Platform platform1=new Platform(2,"Nagsandra", "Mangalore");
		railwaystation.add(platform1);
		
		Platform platform2=new Platform(3,"Magdi", "Bangalore");
		railwaystation.add(platform2);
		
		railwaystation.getPlatforms();
		
		System.out.println("Main method ended");
	}

}
