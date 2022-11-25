class CricketPlayers{ 

	static String names[]={"Rohith sharma" ,"Rishabh pant" ,"Virat Kohli" ,"Yuzvendra Chahal" ,"Bhuvaneshwar Kumar" ,"Arshdeep Singh" ,"Hardik Pandya" ,"Axar patel" ,"Dinesh Karthik"};
	
	public static void main(String a[]){
	
		System.out.println(names.length);
		System.out.println("Cricket Player names are: ");
		//System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]+" "+names[5]+" "+names[6]+" "+names[7]+" "+names[8]);
		
		for (int index=0;index<names.length;index++){
			System.out.println(names[index]);
		}
	}
}