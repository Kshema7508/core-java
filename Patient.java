class Patient{

	//declaration of static variables
		static String patientName;
		static long patientContactNo;
		static int patientAge;
		static String patientDisease;
		static char patientWard;
		static double costOfMedicine;
		static boolean isAlive;

	public static void main(String a[]){
		
	//invoking/using/calling
		System.out.println("Invoking variables before initialization:");
		System.out.println("========================");
		System.out.println("Patient Name is: "+patientName+ " "+"Patient Contact No is: "+patientContactNo+" "+"Patient Age is: "+patientAge+" "+"Patient Disease is: "+patientDisease+" "+"Patient Ward no is: "+patientWard+" "+"medicine Cost: "+costOfMedicine+" "+"Patien Alive: "+isAlive);	
		
		//initialization of variables
		patientName="Shivappa";
		patientContactNo=8908908908l;
		patientAge=78;
		patientDisease="Dengue";
		patientWard='B';
		costOfMedicine=150.85;
		isAlive=true;
		
		System.out.println("Invoking variables after initialization:");
		System.out.println("========================");
		System.out.println("Patient Name is: "+patientName+ " "+"Patient Contact No is: "+patientContactNo+" "+"Patient Age is: "+patientAge+" "+"Patient Disease is: "+patientDisease+" "+"Patient Ward no is: "+patientWard+" "+"medicine Cost: "+costOfMedicine+" "+"Patien Alive: "+isAlive);
		
	}
}