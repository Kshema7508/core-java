class Jeans{
	
		static String name;
		static String color;
		static int price;
		static boolean warrenty;
	public static void main(String a[]){
		
		System.out.println("Invoking variables before initialization:");
		System.out.println("========================");
	
		System.out.println("The Product Information are:");
		System.out.println("The cloth name is:"+name);
		System.out.println("The color is: "+color);
		System.out.println("The amount is: "+price);
		System.out.println("One Year Warrenty: "+warrenty);
		
		name="Jeans";
		color="Blue";
		price=999;
		warrenty=false;
		
		
		System.out.println("Invoking variables after initialization:");
		System.out.println("========================");
		
		System.out.println("The Product Information are:");
		System.out.println("The cloth name is:"+name);
		System.out.println("The color is: "+color);
		System.out.println("The amount is: "+price);
		System.out.println("One Year Warrenty: "+warrenty);
	}
}