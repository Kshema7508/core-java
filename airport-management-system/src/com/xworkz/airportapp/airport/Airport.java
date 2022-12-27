package com.xworkz.airportapp;

public class Airport {
	
	Terminal terminal[]=new Terminal[2];
	int index;
	
	
	public Airport(){
		System.out.println("Airport object is created");
	}
	
	public boolean add(Terminal terminal){
		System.out.println("Add process is started");
		boolean isAdd=false;
		
		if(terminal.terminalName!=null){
			this.terminal[index++]=terminal;
			System.out.println("Terminal added sucessfully");
			isAdd=true;
		}
		
		System.out.println("Add process ended");
		return isAdd;
	}
	
	public void getTerminals(){
		System.out.println("List of terminal details are: ");
		for(int i=0;i<this.terminal.length;i++){
			System.out.println(terminal[i].terminalId+" "+terminal[i].terminalName+" "+terminal[i].noOfGates);
		}
	}

}
