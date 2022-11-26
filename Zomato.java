class Zomato{
		
	public static double findItem(String item){
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
				return 180;
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
}
//if 10 item