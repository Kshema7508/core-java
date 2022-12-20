class RedbullTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Redbull redbull=new Redbull();
		String data=redbull.drinking();
		System.out.println("The redbull is a some kind of "+data);
		
		System.out.println("Main method ended");
	}
}