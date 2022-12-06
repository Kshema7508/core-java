class ZeptoTester{

	public static void main(String a[]){
		System.out.println("Main method is started");
		
		double priceOfItem=Zepto.findItem("DairyMilk");
		System.out.println("The price of Item is: "+priceOfItem);
		
		double itemWithQuantity=Zepto.findItem("KitKat",7);
		System.out.println("The price of selected item is: "+itemWithQuantity);
		System.out.println("Main method ended");
	}
}