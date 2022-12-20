class DairyMilkTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		DairyMilk dairymilk=new DairyMilk();
		String data=dairymilk.eating();
		System.out.println("The DairyMilk is "+data);
		
		System.out.println("Main method ended");
	}
}