class DunzoTester{

	public static void main(String dunzo[]){
	
		System.out.println("Main method started");
		
		double priceOfItem=Dunzo.findItem("Chips");
		System.out.println("Cost of Item is: "+priceOfItem);
		System.out.println("Main method ended");
	}
}