package com.xworkz.hospitalapp;

public class ApolloHospitalsTester {

	public static void main(String a[]){
		
		System.out.println("Main method started");
		
		ApolloHospitals apollohospitals=new ApolloHospitals();
		Patient patient=new Patient(1,"Hitesh","O+",56,"male");
		
		Patient patient1=new Patient(2,"jithesh","B+",45,"male");
		
		Patient patient2=new Patient(3,"Hema","A+",30,"female");
		
		apollohospitals.admit(patient);
		apollohospitals.admit(patient1);
		apollohospitals.admit(patient2);
		
		
		apollohospitals.getPatients();
		
		System.out.println("Main method ended");
	}
}
