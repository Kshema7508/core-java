class WhirpoolTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Whirpool whirpool=new Whirpool();
		String data=whirpool.cooling();
		System.out.println("The Fridge is used for "+data);
		
		System.out.println("Main method ended");
	}
}