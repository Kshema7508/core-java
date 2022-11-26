class Dunzo{

	public static double findItem(String Item){
	
		System.out.println("Invoke findItem method");
		if(Item=="Milk"){
			return 50.25;
		}
		if(Item=="Egg"){
			return 175.00;
		}
		if(Item=="Vegetables"){
			return 250.45;
		}
		if(Item=="Fruits"){
			return 350.60;
		}
		if(Item=="Curd"){
			return 30.00;
		}
		if(Item=="Chips"){
			return 129.30;
		}
		if(Item=="Ice Cream"){
			return 210.00;
		}
		if(Item=="Coffee Powder"){
			return 180.25;
		}
		if(Item=="Bread"){
			return 56.00;
		}
		if(Item=="Butter"){
			return 190.00;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("findItem method ended");
		return 0.0;
	}
}