package com.xworkz.theatreapp;

public class ScreenTester {
	
	public static void main(String scr[]){
		
		System.out.println("Main method stared");
		
		Theatre theatre=new Theatre();
		
		Screen screen=new Screen(1,"Inox",5);
		theatre.add(screen);
		
		Screen screen1=new Screen(2,"PVR",3);
		theatre.add(screen1);
		
		Screen screen2=new Screen(3,"Bharath",4);
		theatre.add(screen2);
		
		theatre.getScreens();
		
		System.out.println("Main method ended");
	}

}
