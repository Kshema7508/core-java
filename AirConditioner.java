class AirConditioner{

	static String name="Voltas";
	static boolean isWireLess;
	static boolean isConnected;
	static int maxTemp=80;
	static int minTemp;
	static int currentTemp;
	
	public static void main(String a[]){
		
		System.out.println("Main method is started");
		
		
		onOrOff();
		//onOrOff();
		increaseTemp();
		increaseTemp();
		increaseTemp();
		decreaseTemp();
		System.out.println("Air Conditioner name is: "+name);
		System.out.println("Air Conditioner is wire Less: "+isWireLess);
		System.out.println("Max Temperature is: "+maxTemp);
		System.out.println("Min Temperature name is: "+minTemp);
		System.out.println("Current Temperature is: "+currentTemp);
		System.out.println("Main method is ended");
		
	}
	
	public static void onOrOff(){
	
		System.out.println("Inside onOrOff method");
		
		if(isConnected==false){
			isConnected=true;
			System.out.println("Air Conditioner is turned on....");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Air Conditioner is turned off...");
		}
		
		System.out.println("onOrOff method ended");
	}
	
	public static void increaseTemp(){
		
		System.out.println("...Invoke increaseTemp method...");
		System.out.println("No of parameter: "+0);
		
		if(isConnected==true){
			if(currentTemp<maxTemp){
				currentTemp=currentTemp+1;
				System.out.println("The Current Temperature is: "+currentTemp);
			}
			else{
				System.out.println("===Max Temperature Reached===");
			}
		}
		else{
			System.out.println("Gube... First turn on the switch");
		}
	}
	
	public static void decreaseTemp(){
	
		System.out.println("...Invoke decreaseTemp method...");
		System.out.println("No of parameter: "+0);
		
		if(isConnected==true){
			if(currentTemp>minTemp){
				currentTemp=currentTemp-1;
				System.out.println("The Current Temperature is: "+currentTemp);
			}
			else{
				System.out.println("===Min Temperature Reached===");
			}
		}
		else{
			System.out.println("Gube...First turn on the switch");
		}
	}
}			