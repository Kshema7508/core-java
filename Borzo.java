class Borzo{

	public static void findItem(String Item){
		
		System.out.println("Invoke findItem()");
		if(Item=="Shoes"){
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