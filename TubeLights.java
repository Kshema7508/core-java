class TubeLights{

	static boolean isConnected=false;
	
	public static void main(String a[]){
	//invoking a giveLight method
		giveLight();
		//giveLight();
	}
	
	//decleration of a giveLight method
	public static void giveLight(){
		System.out.println("giveLight method is invoked");
		
		if(isConnected==false){
			isConnected=true;
			System.out.println("Tube light is turned on");
		}
		else{
			System.out.println("Gube.... The switch is already turned on");
		}
		
		System.out.println("giveLight method is ended");
	}
}