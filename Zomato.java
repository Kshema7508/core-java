class Zomato{
		
	public static double findItem(String item)
	{
		System.out.println("Invoke findItem()");
		
			//check the condition if it is matching in the tester part
			if(item=="Biriyani"){
				return 225.00;
			}
			if(item=="Pulav"){
				return 110.25;
			}
			if(item=="Idli"){
				return 30.90;
			}
			if(item=="Puliyogare"){
				return 35.00;
			}
			if(item=="Kabbab"){
				return 100.00;
			}
			if(item=="Dosa"){
				return 65.36;
			}
			if(item=="Parota"){
				return 180.00;
			}
			if(item=="Nudles"){
				return 190.25;
			}
			if(item=="Fish Currey"){
				return 200.00;
			}
			if(item=="veg Biriyani"){
				return 150.00;
			}
			if(item=="Chapathi"){
				return 80.00;
			}
			else{
				System.out.println("Item not available");
			}
		System.out.println("End of findItem()");
		return 0.0;
	} 
	
	
	
	public static double findItem(String item, int quantity)
	{
		
		System.out.println("Invoke findItem()");
		if(item=="Biriyani"){
			return 225.00*quantity;
		}
		if(item=="Pulav"){
			return 110.25*quantity;
		}
		if(item=="Idli"){
			return 30.90*quantity;
		}
		if(item=="Puliyogare"){
			return 35.00*quantity;
		}
		if(item=="Kabbab"){
			return 100.00*quantity;
		}
		if(item=="Dosa"){
			return 65.36*quantity;
		}
		if(item=="Parota"){
			return 180.00*quantity;
		}
		if(item=="Nudles"){
			return 190.25*quantity;
		}
		if(item=="Fish currey"){
			return 200.00*quantity;
		}
		if(item=="Veg Biriyani"){
			return 150.00*quantity;
		}
		if(item=="Chapathi"){
			return 80.00*quantity;
		}
		else{
			System.out.println("Item not available");
		}
		System.out.println("End of findItem()");
		return 0.0;
	}
	
}
