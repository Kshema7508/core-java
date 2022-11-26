class MicroWaveOven{
	
	static String ovenName="LG";
	static boolean isConnected;
	static int maxTemp=30;
	static int minTemp;
	static int currentTemp;
	
	public static void main(String a[]){
	
		System.out.println("Main method is started");
		
		onOrOff();
		//onOrOff();
		increaseTemp();
		increaseTemp();
		increaseTemp();
		increaseTemp();
		decreaseTemp();
		decreaseTemp();
		System.out.println("Microwave Oven name is: "+ovenName);
		System.out.println("Max Temperature is: "+maxTemp);
		System.out.println("Min Temperature name is: "+minTemp);
		System.out.println("Current Temperature is: "+currentTemp);
		System.out.println("Main method is ended");
	}
	
	public static void onOrOff(){
		
		System.out.println("Invoke onOrOff method");
		
		if(isConnected==false){
			isConnected=true;
			System.out.println("Oven switch is turned on...");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Oven switch is turned off...");
		}
	}
	
	public static void increaseTemp(){
		
		System.out.println("Invoke increaseTemp method");
		
		if(isConnected==true){
			if(currentTemp<maxTemp){
				currentTemp=currentTemp+1;
				System.out.println("The Current Temperature is: "+currentTemp);
			}
			else{
				System.out.println("Max Temperature Reached.....");
			}
		}
		else{
			System.out.println("Gube....First turn on the switch");
		}
	}
	
	public static void decreaseTemp(){
	
		System.out.println("Invoke decreaseTemp method");
		
		if(isConnected==true){
			if(currentTemp>minTemp){
				currentTemp=currentTemp-1;
				System.out.println("The Current Temperature is: "+currentTemp);
			}
			else{
				System.out.println("Min Temperature Reached....");
			}
		}
		else{
			System.out.println("Gube....First turn on the switch");
		}
	}
}