class Hospital{

	Patient patient[]=new Patient[1];
	int index;
	
	
	public Hospital(){
		System.out.println("Hospital object is created");
	}
	
	//Patient patient[]=new patient[size]
	//String str={'dev","vijay","Darshan","Sudeep'];
	//Datatypes variale[]=new Datatypes[size];
	//String str[]=new String[4];
	
	public boolean admit(Patient patient){
		System.out.println("Admit process started");
		boolean isAdmitted=false;
		
		//validation
		if(patient.patientName!=null){
			this.patient[index++]=patient;
			System.out.println("Patient added sucessfully");
			isAdmitted=true;
		}
		
		System.out.println("Admit process ended");
		return isAdmitted;
	}
	
	public void getPatient(){
		System.out.println("list of patient details are ");
		for(int ind=0;ind<this.patient.length;ind++){
			System.out.println(patient[ind].patientId+" "+patient[ind].patientName+" "+patient[ind].bloodGroup+" "+patient[ind].age+" "+patient[ind].gender);
		}
	}

}