class BingoTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		Bingo bingo=new Bingo();
		String data=bingo.eating();
		System.out.println("Bingo "+data);
		
		System.out.println("Main method ended");
	}
}