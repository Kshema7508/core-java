class Swiggy{

	public static double findItem(String Item){
		
		System.out.println("Invoke findItem method");
		
		if(Item=="Chicken Chilli"){
			return 250.00;
		}
		if(Item=="Samosa"){
			return 25.00;
		}
		if(Item=="Chutney"){
			return 45.25;
		}
		if(Item=="VadaPav"){
			return 55.90;
		}
		if(Item=="Butter Chicken"){
			return 250.00;
		}
		if(Item=="Chicken tikka masala"){
			return 300.20;
		}
		if(Item=="Masala Dosa"){
			return 150.00;
		}
		if(Item=="Jalebi"){
			return 70.00;
		}
		if(Item=="Tandoori Chicken"){
			return 315.00;
		}
		if(Item=="Pani Puri"){
			return 50.00;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("IfindItem method ended");
		return 0.0;
	}
	
	
	public static double findItem(String Item, int quantity)
	{
		System.out.println("Invoke findItem method");
		
		if(Item=="Chicken Chilli"){
			return 250.00*quantity;
		}
		if(Item=="Samosa"){
			return 25.00*quantity;
		}
		if(Item=="Chutney"){
			return 45.25*quantity;
		}
		if(Item=="VadaPav"){
			return 55.90*quantity;
		}
		if(Item=="Butter Chicken"){
			return 250.00*quantity;
		}
		if(Item=="Chicken tikka masala"){
			return 300.20*quantity;
		}
		if(Item=="Masala Dosa"){
			return 150.00*quantity;
		}
		if(Item=="Jalebi"){
			return 70.00*quantity;
		}
		if(Item=="Tandoori Chicken"){
			return 315.00*quantity;
		}
		if(Item=="Pani Puri"){
			return 50.00*quantity;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("IfindItem method ended");
		return 0.0;
	}
		
}