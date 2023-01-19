class HouseTester{

	public static void main(String a[]){
	
		System.out.println("...Main method started...");
		
		String familyMembers[]={"Father","Mother","Brother","Sister","Grandfather","Grandmother"};
		
		House hous=new House(1,"Kshema Nilaya","NarayanaPoojary",familyMembers);
		hous.displayDetails();
		
		House hous1=new House(2,"Karthik Nilaya","Karthik",familyMembers);
		hous1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
	
}