class FasttrackTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Fasttrack fasttrack=new Fasttrack();
		String data=fasttrack.wearing();
		System.out.println("The fasttrack watch is used for "+data);
		
		System.out.println("Main method ended");
	}
}