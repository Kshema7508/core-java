class Beelivery{

	public static void findItem(String item){
		
		System.out.println("Invoke findItem()");
		if(item=="Vegetables"){
			System.out.println("The item is available");
			return;
		}
		else{
			System.out.println("The item is not available");
		}
		System.out.println("findItem() method ended");
		return;
	}
}