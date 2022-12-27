package com.xworkz.airportapp;

public class KempegowdaAirportTester {
	
	public static void main(String a[]){
		
		System.out.println("Main method started");
		
		KempegowdaAirport kempegowdaairport=new KempegowdaAirport();
		Terminal terminal=new Terminal(1,"Bangterm",3);
		
		Terminal terminal1=new Terminal(2,"Kemmpterm",5);
		
		kempegowdaairport.add(terminal);
		kempegowdaairport.add(terminal1);
		
		
		kempegowdaairport.getTerminals();
		
		System.out.println("Main method ended");
	}

}
