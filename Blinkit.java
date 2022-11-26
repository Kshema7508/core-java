class Blinkit{

	public static void findItem(String item){
		
		System.out.println("Invoke findItem()");
		if(item=="Rise"){
			System.out.println("The item is available");
			return;
		}
		else{
			System.out.println("The item is not available");
		}
		System.out.println("findItem method ended");
		return;
	}
}