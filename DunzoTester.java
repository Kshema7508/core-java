class DunzoTester{

	public static void main(String dunzo[]){
	
		System.out.println("Main method started");
		
		double priceOfItem=Dunzo.findItem("Chips");
		System.out.println("Cost of Item is: "+priceOfItem);
		
		double itemWithQuantity=Dunzo.findItem("Butter",3);
		System.out.println("The price of selected item is: "+itemWithQuantity);
		System.out.println("Main method ended");
	}
}