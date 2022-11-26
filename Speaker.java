class Speaker{

	static String brandName="Bose";
	static String frequency="20Hz";
	static boolean isWireLess=true;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=5;
	static int currentVolume;
	
	
	public static void main(String a[]){
		
		System.out.println("Main method is started");
		
		onOrOff();
		//onOrOff();
		increaseVolume();
		increaseVolume();
		//increaseVolume();
		//increaseVolume();
		//increaseVolume();
		//increaseVolume();
		decreaseVolume();
		//decreaseVolume();
		//decreaseVolume();
		
		System.out.println("The speaker Brand name is: "+brandName);
		System.out.println("The Speaker is wire less: "+isWireLess);
		System.out.println("Frequency is: "+frequency);
		System.out.println("Minimum volume is: "+minVolume);
		System.out.println("Maximum volume is: "+maxVolume);
		System.out.println("Current volume is: "+currentVolume);
		System.out.println("Main method is ended");
	}
	
	public static void onOrOff(){
		
		System.out.println("inside onoroff method");
		
		if(isConnected==false){
			isConnected=true;
			System.out.println("Speaker is turned on....enjoy...");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Speaker is turned off....");
		}
		System.out.println("onOrOff method ended");
	}
	
	
	public static void increaseVolume(){
		
		System.out.println("===invoke increaseVolume method===");
		System.out.println("No of parameter: "+0);
		
			if(isConnected==true){
				if(currentVolume<maxVolume){
					currentVolume=currentVolume+1;
					System.out.println("The current volume is: "+currentVolume);
				}
				else{
					System.out.println("Max volume Reached....");
				}
			}
			else{
				System.out.println("Gube... First turn on the Speaker");
			}
	}
	
	
	
	public static void decreaseVolume(){
		
		System.out.println("===invoke decreaseVolume method===");
		System.out.println("No of parameter: "+0);
		
			if(isConnected==true){
				if(currentVolume>minVolume){
					currentVolume=currentVolume-1;
					System.out.println("The current volume is: "+currentVolume);
				}
				else{
					System.out.println("Min volume Reached......");
				}
			}
			else{
				System.out.println("Gube... First turn on the Speaker");
			}
	}
	
}