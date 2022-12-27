package com.xworkz.showroomapp.manager;

public class Manager {

	public int managerId;
	public String managerName;
	public String qualification;
	public long contactNo;
	public String gender;

	public Manager(int managerId, String managerName, String qualification, long contactNo, String gender) {
		
		this.managerId=managerId;
		this.managerName=managerName;
		this.qualification=qualification;
		this.contactNo=contactNo;
		this.gender=gender;
	}
}