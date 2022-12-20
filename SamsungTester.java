class SamsungTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Samsung samsung=new Samsung();
		String data=samsung.calling();
		
		System.out.println("Mobile calling is for "+data);
		System.out.println("Main method ended");
	}
}