package com.xworkz.showroomapp;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;


public class ShowRoomTester {
	
	public static void main(String a[]) {
		System.out.println("Main method started");
		
		ShowRoom room=new ShowRoom();
		Manager manager=new Manager(1,"Karthik","MBA",7353587639l,"Male");
		Manager manager1=new Manager(2,"Prajna","MSC",7899142501l,"Female");
		
		room.saveManager(manager);
		room.saveManager(manager1);
		
		room.getAllManagers();
		
		room.getManagerBycqualification("MBA");
		room.getManagerBymanagerId(2);
		room.getManagerBymanagerName("Karthik");
		room.getManagerBycontactNo(7353587639l);
		room.getManagerBygender("Female");
		room.updateContacNoBymanagerId(8197857508l, 2);
		
		room.getAllManagers();
		
		System.out.println("Main method ended");
	}

}
