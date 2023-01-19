class RestuarantTester{

	public static void main(String res[]){
		
		System.out.println("...Main method started...");
	
		String workers[]={"Balaji","Hemanth","Kishore","Babu"};
		String menu[]={"Gobi","Masala Papad","Veg Biriyani"};
		
		Restuarant rest=new Restuarant(1, "Mgroad", "Sagar", workers, menu);
		rest.displayDetails();
		
		Restuarant rest1=new Restuarant(2, "Vvpuram", "Udupi", workers, menu);
		rest1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
}