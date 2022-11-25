class Bowlers{

	static String topFiveBowlers[]={"Jasprith Brmrah","Ravichandran Ashwin","Harbhajan Singh","Ishant Sharma","Anil Kumble"};
	
	public static void main(String a[]){
	
		System.out.println(topFiveBowlers.length);
		System.out.println("Top Five Bowlers in India: ");
		//System.out.println(topFiveBowlers[0]+" "+topFiveBowlers[1]+" "+topFiveBowlers[2]+" "+topFiveBowlers[3]+" "+topFiveBowlers[4]);
		
		
		for (int index=0;index<topFiveBowlers.length;index++){
			System.out.println(topFiveBowlers[index]);
		}
	}
}