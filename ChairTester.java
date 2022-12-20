class ChairTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Chair chair=new Chair();
		String data=chair.support();
		System.out.println("The Chair is used for "+data);
		
		System.out.println("Main method ended");
	}
}