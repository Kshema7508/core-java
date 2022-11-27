class Watermelon{
	
	static String color;
	static int cost;
	 
	public static void main(String watermelon[]){ 
	 
		System.out.println("Invoking variables before initialization");
		System.out.println("==============");
	 
		System.out.println(color+" "+cost);

		
		color="Green";
		cost=156;
		
		System.out.println("Invoking variables after initialization");
		System.out.println("==============");
		
		System.out.println(color+" "+cost);
	}
}