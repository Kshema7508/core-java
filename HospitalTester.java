class HospitalTester{

	public static void main(String hos[]){
	
		System.out.println("Main method started");
		
		Hospital hospital=new Hospital();
		Patient patient=new Patient(1,"Hitesh","O+",56,"male");
		hospital.admit(patient);
		
		
		
		System.out.println("Main method ended");
		
	} 
	
	public void display(){
		
		System.out.println("");
	}
}