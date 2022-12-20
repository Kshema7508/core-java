class AirtelTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Airtel airtel=new Airtel();
		String data=airtel.communication();
		System.out.println("The Airtel is "+data);
		
		System.out.println("Main method ended");
	}
}