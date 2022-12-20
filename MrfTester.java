class MrfTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Mrf mrf=new Mrf();
		String data=mrf.playing();
		System.out.println("The Mrf bat is used to play the crickret for "+data);
		
		System.out.println("Main method ended");
	}
}