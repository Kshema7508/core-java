class Golvo{

	public static void findItem(String item){
		
		System.out.println("Invoke findItem()");
		if(item=="Puliyogare"){
			System.out.println("The item is available");
			System.out.println("The Price of item is 250");
			return;
		}
		else{
			System.out.println("The item is not available");
		}
		System.out.println("findItem() method ended");
		return;
	}
}