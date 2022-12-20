class ClassmateTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Classmate classmate= new Classmate();
		String data=classmate.read();
		System.out.println("The classmate book is used for "+data);
		
		System.out.println("Main method ended");
	}
}