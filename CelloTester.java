class CelloTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Cello cello=new Cello();
		String data=cello.write();
		System.out.println("The Cello pen is used for "+data);
		
		System.out.println("Main method ended");
	}
}