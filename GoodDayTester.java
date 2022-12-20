class GoodDayTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		GoodDay goodday=new GoodDay();
		String data=goodday.eating();
		System.out.println("GoodDay contains "+data);
		
		System.out.println("Main method ended");
	}
}