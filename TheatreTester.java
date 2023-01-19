class TheatreTester{

	public static void main(String a[]){
	
		System.out.println("...Main method started...");
		
		String typesOfScreens[]={"Inox","PVR","Silver Screen"};
		
		Theatre thet=new Theatre(1,"Bharath Cinema",5,typesOfScreens);
		thet.displayDetails();
		
		Theatre thet1=new Theatre(2,"Bhavani",4,typesOfScreens);
		thet1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
	
}