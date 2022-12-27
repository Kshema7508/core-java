package com.xworkz.citynameapp;

public class UdupiTester {
	
	public static void main(String a[]){
		
		System.out.println("Main method stared");
		
		Udupi udupi=new Udupi();
		
		Area area=new Area(1,"Mangalore",12);
		udupi.add(area);
		
		Area area1=new Area(2,"Udupi",9);
		udupi.add(area1);
		
		Area area2=new Area(3,"Mysore",5);
		udupi.add(area2);
		
		
		udupi.getAreas();
		
		System.out.println("Main method ended");
	}

}
