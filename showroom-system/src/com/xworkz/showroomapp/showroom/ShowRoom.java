package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;

public class ShowRoom {
	
	Manager manager[]=new Manager[2];
	int index;
	
	
	public ShowRoom() {
		System.out.println("ShowRoom object is created");
	}
	
	public boolean saveManager(Manager manager) {
		System.out.println("saveManager process is started");
		boolean isSaveManager=false;
		
		if(manager.managerName!=null && !(manager.managerName.isEmpty())) {
			this.manager[index++]=manager;
			System.out.println("manager saved sucessfully");
			isSaveManager=true;
		}
		System.out.println("saveManager process ended");
		return isSaveManager;
	}
	
	public void getAllManagers() {
		System.out.println("List of manager details are");
		for(int i=0;i<manager.length;i++) {
			System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
		}
	}
	
	public Manager getManagerBycqualification(String qualification) {
		System.out.println("Inside getManagerByqualification");
		for(int i=0;i<manager.length;i++) {
			
			if(manager[i].qualification==qualification) {
				System.out.println("Qualification is matching... proceed the data");
				System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
				return manager[i];
			}
			System.out.println("End of getManagerByqualification");
		}
		return null;
	}

	public Manager getManagerBymanagerId(int managerId) {
		System.out.println("Inside getManagerBymanagerId");
		for(int i=0;i<manager.length;i++) {
			
			if(manager[i].managerId==managerId) {
				System.out.println("Manager Id is mathing.. proceed the data");
				System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
				return manager[i];
			}
			System.out.println("End of getManagerBymanagerId");
		}
		return null;
	}
	
	public Manager getManagerBymanagerName(String managerName) {
		System.out.println("inside getManagerBymanagerName");
		for(int i=0;i<manager.length;i++) {
			
			if(manager[i].managerName==managerName) {
				System.out.println("Manager name is matching.. proceed the data");
				System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
				return manager[i];
			}
			System.out.println("End of getManagerBymanagerName");
		}
		return null;
	}
	
	public Manager getManagerBycontactNo(long contactNo) {
		System.out.println("Inside getManagerBycontactNo");
		for(int i=0;i<manager.length;i++) {
			
			if(manager[i].contactNo==contactNo) {
				System.out.println("ContactNo is matching.. proceed the data");
				System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
				return manager[i];
			}
			System.out.println("End of getManagerBycontactNo");
		}
		return null;
	}
	
	public Manager getManagerBygender(String gender) {
		System.out.println("Inside getManagerBygender");
		for(int i=0;i<manager.length;i++) {
			
			if(manager[i].gender==gender) {
				System.out.println("gender is matching.. proceed the data");
				System.out.println(manager[i].managerId+" "+manager[i].managerName+" "+manager[i].qualification+" "+manager[i].contactNo+" "+manager[i].gender);
				return manager[i];
			}
			System.out.println("End of getManagerBygender");
		}
		return null;
	}
	
	public boolean updateContacNoBymanagerId(long newContactNo, int managerId) {
		
		boolean isContactNoUpdated=false;
		System.out.println("updateContactNoBymanagerId");
		for(int i=0;i<manager.length;i++) {
			if(manager[i].managerId==managerId) {
				System.out.println("Current contact no is :"+manager[i].contactNo);
				manager[i].contactNo=newContactNo;
				System.out.println("Updated contact no is :"+manager[i].contactNo);
			}
		}
		return isContactNoUpdated;
	}
	
}
