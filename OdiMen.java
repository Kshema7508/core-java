class OdiMen{
	
	static String topWicketTakers[]={"Muttiah Muralitharan" ,"Wasim Akram" ,"Waqar Younis" ,"Chaminda Vaas" ,"Shahid Afridi"};
	
	public static void main(String a[]){
	
		System.out.println(topWicketTakers.length);
		System.out.println("Top Five Wicket takers in ODI Men's: ");
		//System.out.println(topWicketTakers[0]+" "+topWicketTakers[1]+" "+topWicketTakers[2]+" "+topWicketTakers[3]+" "+topWicketTakers[4]);
		
		for (int index=0;index<topWicketTakers.length;index++){
			System.out.println(topWicketTakers[index]);
		}
	}
}