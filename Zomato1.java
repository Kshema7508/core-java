class Zomato1{

	public static void findItem(String item){
		
		System.out.println("Invoke findItem");
		if(item=="Biriyani"){
			System.out.println("The item is available");
			return;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("end of findItem");
		return;
	
	}
}