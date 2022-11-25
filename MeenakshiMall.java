class MeenakshiMall{

	static String shoppes[]={"Ramraj","Louis Phillipe","Shrishti","Jackey"};
	
	public static void main(String a[]){
	
		System.out.println(shoppes.length);
		System.out.println("List of Shopes  available in Mall are: ");
		System.out.println(shoppes[0]+" "+shoppes[1]+" "+shoppes[2]+" "+shoppes[3]);
		
		
		for (int index=0;index<shoppes.length;index++){
			System.out.println(shoppes[index]);
		}
	}
}