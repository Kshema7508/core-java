class StationeryTester{

	public static void main(String sta[]){
	
		System.out.println("...Main method started...");
		
		int notebooks[]={100,200,300,50};
		String pens[]={"Ballpoint","Gel pen" ,"Rollerball","Marker"};
		String charts[]={"Vegetables", "Fruits", "Flowers", "Alphabet"};
		
		Stationery stat=new Stationery(1,"Udupi Stationery",notebooks,pens,charts);
		stat.displayDetails();
		
		Stationery stat1=new Stationery(2,"Bhavani Stationery",notebooks,pens,charts);
		stat1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
	
}