class ZomatoTester{

	public static void main(String zomato[]){
		System.out.println("main method is started");
		
		//method with 1 parameter
		double priceOfItem=Zomato.findItem("Pulav");
		System.out.println("The Item price is: "+priceOfItem);
		
		//method with 2 parameter
		double itemWithQuantity=Zomato.findItem("Biriyani",3);
		System.out.println("The Price of Selected iyem is: "+itemWithQuantity);
		System.out.println("Main method ended");
	}
}