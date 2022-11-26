class ZomatoTester{

	public static void main(String zomato[]){
		System.out.println("main method is started");
		
		double priceOfItem=Zomato.findItem("Pulav");
		System.out.println("The Item price is: "+priceOfItem);
		System.out.println("Main method ended");
	}
}