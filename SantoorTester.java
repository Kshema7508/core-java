class SantoorTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Santoor santoor=new Santoor();
		String data=santoor.washing();
		System.out.println("The santoor soap is used for "+data);
		
		System.out.println("Main method ended");
	}
}