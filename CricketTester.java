class CricketTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Cricket cricket=new Cricket();
		String data=cricket.playing();
		System.out.println("The playing of cricket for "+data);
		
		System.out.println("Main method ended");
	}
}