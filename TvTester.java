class TvTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Tv tv=new Tv();
		String data=tv.watching();
		System.out.println("Tv is used for "+data);
		
		System.out.println("Main method ended");
	}
}