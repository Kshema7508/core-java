class Zepto{

	public static double findItem(String Item)
	{
		System.out.println("Invoke findItem method");
		if(Item=="Pepsi"){
			return 79.90;
		}
		if(Item=="Amul cool"){
			return 50.00;
		}
		if(Item=="Colgate"){
			return 60.50;
		}
		if(Item=="Maggie"){
			return 90.53;
		}
		if(Item=="Dry Fruits"){
			return 500.00;
		}
		if(Item=="Saffola"){
			return 200.00;
		}
		if(Item=="DairyMilk"){
			return 170.00;
		}
		if(Item=="Coke"){
			return 85.00;
		}
		if(Item=="KitKat"){
			return 65.00;
		}
		if(Item=="Paneer"){
			return 200.50;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("Find item method is ended");
		return 0.0;
	}
	
	
	public static double findItem(String Item, int quantity)
	{
		System.out.println("Invoke findItem method");
		if(Item=="Pepsi"){
			return 79.90*quantity;
		}
		if(Item=="Amul Cool"){
			return 50.00*quantity;
		}
		if(Item=="Colgate"){
			return 60.50*quantity;
		}
		if(Item=="Maggie"){
			return 90.53*quantity;
		}
		if(Item=="Dry Fruits"){
			return 500.00*quantity;
		}
		if(Item=="Saffola"){
			return 200.00*quantity;
		}
		if(Item=="DairyMilk"){
			return 170.00*quantity;
		}
		if(Item=="Coke"){
			return 85.00*quantity;
		}
		if(Item=="KitKat"){
			return 65.00*quantity;
		}
		if(Item=="Paneer"){
			return 200.50*quantity;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("Find Item method is ended");
		return 0.0;
	}
}