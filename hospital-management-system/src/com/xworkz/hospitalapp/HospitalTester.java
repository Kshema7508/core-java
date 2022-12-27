package com.xworkz.hospitalapp;

public class HospitalTester {
	
	public static void main(String hos[]){
		
		System.out.println("Main method started");
		
		Hospital hospital=new Hospital();
		Patient patient=new Patient(1,"Hitesh","O+",56,"male");
		
		Patient patient1=new Patient(2,"Hema","B+",45,"female");
		
		Patient patient2=new Patient(3,"Jithesh","A+",25,"male");
		
		hospital.admit(patient);
		hospital.admit(patient1);
		hospital.admit(patient2);
		
		hospital.getPatients();
		
		System.out.println("getPatientByPatientId is proced...");
		hospital.getPatientByPatientId(2);
		
		System.out.println("getPatientByPatientName is proced...");
		hospital.getPatientByPatientName("Jithesh");
		
		System.out.println("getPatientByGender is proced...");
		hospital.getPatientByGender("female");
		
		System.out.println("getPatientByBloodGroup is proced...");
		hospital.getPatientByBloodGroup("A+");
		
		System.out.println("getPatientByAge is proced...");
		hospital.getPatientByAge(45);
		
		System.out.println("Updating the Patient Info");
		hospital.updatePatientAgeByPatientId(81, 1);
		
		System.out.println("Updating the Patient Info");
		hospital.updatedPatientNameByGender("Prajna", "female");
		
		hospital.getPatients();
		
		System.out.println("Main method ended");
		
	} 
	
	public void display(){
		
		System.out.println("");
	}

}
