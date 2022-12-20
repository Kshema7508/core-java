class DiscoveryTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Discovery discovery=new Discovery();
		String data=discovery.newInformation();
		System.out.println("To watch discovery channel "+data);
		
		System.out.println("Main method ended");
	}
}