class SwiggyTester{

	public static void main(String swiggy[]){
		
		System.out.println("Main method started");
		
		double priceOfItem=Swiggy.findItem("Chicken tikka masala");
		System.out.println("The price of Item is: "+priceOfItem);
		
		System.out.println("Main method ended");
	}
}