package com.xworkz.citynameapp;

public class AreaTester {
	
	public static void main(String are[]){
		
		System.out.println("Main method stared");
		
		CityName cityname=new CityName();
		
		Area area=new Area(1,"Mangalore",12);
		cityname.add(area);
		
		Area area1=new Area(2,"Udupi",9);
		cityname.add(area1);
		
		Area area2=new Area(3,"Mysore",5);
		cityname.add(area2);
		
		cityname.getAreas();
		
		System.out.println("Main method ended");
	}

}
