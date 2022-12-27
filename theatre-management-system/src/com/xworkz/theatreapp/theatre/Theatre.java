package com.xworkz.theatreapp;

public class Theatre {

	Screen screen[]=new Screen[3];
	int index;
	
	public Theatre(){
		System.out.println("Theatre object is created");
	}
	
	public boolean add(Screen screen){
		System.out.println("Add process is started");
		boolean isAdd=false;
		
		if(screen.screenName!=null){
			this.screen[index++]=screen;
			System.out.println("Screen added sucessfully");
			isAdd=true;
		}
		
		System.out.println("Add process ended");
		return isAdd;
	} 
	
	public void getScreens(){
		System.out.println("list of screens are:");
		for(int i=0;i<this.screen.length;i++){
			System.out.println(screen[i].screenId+" "+screen[i].screenName+" "+screen[i].noOfScreens);
		}
	}
}
