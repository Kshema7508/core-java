package com.xworkz.theatreapp;

public class AlankarTester {
	
	public static void main(String pla[]){
		
		System.out.println("Main method stared");
		
		Alankar alankar=new Alankar();
		
		Screen screen=new Screen(1,"Inox",5);
		alankar.add(screen);
		
		Screen screen1=new Screen(2,"PVR",3);
		alankar.add(screen1);
		
		Screen screen2=new Screen(3,"Bharath",4);
		alankar.add(screen2);
		
		alankar.getScreens();
		
		System.out.println("Main method ended");
	}

}
