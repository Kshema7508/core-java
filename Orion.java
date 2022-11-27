class Orion{
	
	static String shopeNames[]={"Shoppers Stop" ,"Orion Avenue" ,"Miniso" ,"See Selection" ,"Forever21" ,"Soch" ,"Landmark" ,"Nike" ,"Mochi"};
	
	public static void main(String a[]){
		
		getShopes();
		
	}
	
	public static void getShopes(){
		System.out.println(shopeNames.length);
		System.out.println("List of Shope Names are: ");
		//System.out.println(shopeNames[0]+" "+shopeNames[1]+" "+shopeNames[2]+" "+shopeNames[3]+" "+shopeNames[4]+" "+shopeNames[5]+" "+shopeNames[6]+" "+shopeNames[7]+" "+shopeNames[8]);
		
		
		for (int index=0;index<shopeNames.length;index++){
			System.out.println(shopeNames[index]);
		}
	}
}