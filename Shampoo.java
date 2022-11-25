class shampoo{
 
	public static void main(String a[]){
		System.out.println("Main method started");
			wash("To wash the hair");
		System.out.println("Main method ended");
	}
		
	public static void wash(String  name){
		System.out.println("Invoking method started");
		System.out.println(name);
		System.out.println("Invoking method ended");
	}
}