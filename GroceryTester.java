class GroceryTester{

	public static void main(String a[]){
		
		System.out.println("...Main method started...");
	
		String items[]={"Sugar","Salt","Oil","Tea Powder"};
		Grocery groc=new Grocery(1, "Kruthi shop", "JpNagar","Girish", items);
		groc.displayDetails();
		
		Grocery groc1=new Grocery(2, "Janani shop", "Mangalore","Prajwal",items);
		groc1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
}