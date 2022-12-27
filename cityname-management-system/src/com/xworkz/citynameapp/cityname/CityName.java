package com.xworkz.citynameapp;

public class CityName {
	
	Area area[]=new Area[3];
	int index;
	
	public CityName(){
		System.out.println("CityName object is created");
	}
	
	public boolean add(Area area){
		System.out.println("Add process is started");
		boolean isAdd=false;
		
		if(area.areaName!=null){
			this.area[index++]=area;
			System.out.println("Area added sucessfully");
			isAdd=true;
		}
		
		System.out.println("Add process ended");
		return isAdd;
	} 
	
	public void getAreas(){
		System.out.println("list of areas are:");
		for(int i=0;i<this.area.length;i++){
			System.out.println(area[i].areaId+" "+area[i].areaName+" "+area[i].noOfWards);
		}
	}

}
