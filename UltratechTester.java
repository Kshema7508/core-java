class UltratechTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Ultratech ultratech=new Ultratech();
		String data=ultratech.building();
		System.out.println("The ultratech cement is used for "+data);
		
		System.out.println("Main method ended");
	}
}