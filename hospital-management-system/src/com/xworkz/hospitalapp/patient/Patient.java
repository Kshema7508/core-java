package com.xworkz.hospitalapp;

public class Patient {
	
	public int patientId;
	public String patientName;
	public String bloodGroup;
	public int age;
	public String gender;
	
	public Patient(int patientId, String patientName, String bloodGroup, int age,String gender){
	
		this.patientId=patientId;
		this.patientName=patientName;
		this.bloodGroup=bloodGroup;
		this.age=age;
		this.gender=gender;
	}

}
