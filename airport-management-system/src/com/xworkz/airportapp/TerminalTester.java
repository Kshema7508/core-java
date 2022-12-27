package com.xworkz.airportapp;

public class TerminalTester {
	
	public static void main(String ter[]){
		
		System.out.println("Main method started");
		
		Airport airport=new Airport();
		
		Terminal terminal=new Terminal(1,"Bangterm",3);
		airport.add(terminal);
		
		Terminal terminal1=new Terminal(2,"Kemmpterm",5);
		airport.add(terminal1);
		
		airport.getTerminals();
		
		System.out.println("Main method ended");
		
	}
	
	public void display(){
		System.out.println("");
	}

}
