class FinolexTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Finolex finolex=new Finolex();
		String data=finolex.electricity();
		System.out.println("The finolex wire is used for "+data);
		
		System.out.println("Main method ended");
	}
}