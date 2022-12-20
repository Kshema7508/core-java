class WildCraftTester{

	public static void main(String a[]){
	
		System.out.println("Main method started");
		
		WildCraft wildcraft=new WildCraft();
		String data=wildcraft.book();
		System.out.println("The bag is used for "+data);
		
		System.out.println("Main method ended");
	}
}