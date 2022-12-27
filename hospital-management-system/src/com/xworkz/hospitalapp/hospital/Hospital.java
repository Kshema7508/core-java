package com.xworkz.hospitalapp;

public class Hospital {
	
	Patient patient[]=new Patient[3];
	int index;
	
	
	public Hospital(){
		System.out.println("Hospital object is created");
	}
	
	
	public boolean admit(Patient patient){
		System.out.println("Admit process started");
		boolean isAdmitted=false;
		
		//validation
		if(patient.patientName!=null && patient.patientName!=""){
			this.patient[index++]=patient;
			System.out.println("Patient added sucessfully");
			isAdmitted=true;
		}
		
		System.out.println("Admit process ended");
		return isAdmitted;
	}
	
	//Read operation
	public void getPatients(){
		System.out.println("list of patient details are ");
		for(int ind=0;ind<this.patient.length;ind++){
			System.out.println(patient[ind].patientId+" "+patient[ind].patientName+" "+patient[ind].bloodGroup+" "+patient[ind].age+" "+patient[ind].gender);
		}
	}
	
	public Patient getPatientByPatientId(int patientId) {
		System.out.println("Inside getPatientByPatientId method");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].patientId==patientId) {
				System.out.println("Patient Id is matching.. proced the data");
				System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
				return patient[in];
			}
			System.out.println("end of getPatientByPatientId");
		}
		return null;
	}
	
	
	public Patient getPatientByPatientName(String patientName) {
		System.out.println("Inside getPatientByPatientName method");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].patientName==patientName) {
				System.out.println("Patient name is matching.. proced the data");
				System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
				return patient[in];
			}
			System.out.println("end of getPatientByPatientName");
		}
		return null;
	}
	
	
	public Patient getPatientByGender(String gender) {
		System.out.println("Inside getPatientByGender");
			for(int in=0;in<patient.length;in++) {
				
				if(patient[in].gender==gender) {
					System.out.println("Patient gender is matching.. proced the data");
					System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
					return patient[in];
				}
				System.out.println("end of getPatientByGender");
			}
			return null;
	}
	
	
	public Patient getPatientByBloodGroup(String bloodGroup) {
		System.out.println("Inside getpatientByBloodGroup");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].bloodGroup==bloodGroup) {
				System.out.println("Patient BlooGroup is matching.. proced the data");
				System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
				return patient[in];
			}
			System.out.println("end of getPatientByBloodGroup");
		}
		return null;
	}
	
	
	public Patient getPatientByAge(int age) {
		System.out.println("Inside getpatientByAge");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].age==age) {
				System.out.println("Patient Age is matching.. proced the data");
				System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
				return patient[in];
			}	
			System.out.println("end of getPatientByAge");
		}
		return null;
	}
	
	
	public boolean updatePatientAgeByPatientId(int newAge, int patientId) {
		
		boolean isAgeUpdated=false;
		System.out.println("updatePatientAgeByPatientId started");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].patientId==patientId) {
				System.out.println("The current age is "+patient[i].age);
				patient[i].age=newAge;
				System.out.println("The Updated age is "+patient[i].age);
			}
		}
		return isAgeUpdated;
	}
	
	
	public boolean updatedPatientNameByGender(String newName, String gender) {
		
		boolean isNameUpdated=false;
		System.out.println("updatePatientNameByGender");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].gender==gender) {
				System.out.println("The current name is "+patient[i].patientName);
				patient[i].patientName=newName;
				System.out.println("The Updated name is "+patient[i].patientName);
			}
		}
		return isNameUpdated;
	}
		
	//getPatientByPatientName(String patientName)
	//getPatientByGender(String gender)
	//getPatientByBloogGroup(String bloodGroup)
	//getPatientByAge(int Age)      ....patient[i].age=newAge;--->reinitialize the existing data
	//updated patientNameByPatientGender
	
	

}
