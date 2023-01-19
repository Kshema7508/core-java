class ChatAngadiTester{

	public static void main(String a[]){
	
		System.out.println("...Main method started...");
		
		String chatnames[]={"Panipuri","Masal Puri", "Bail puri","Gobi","Samosa"};
		
		ChatAngadi chat=new ChatAngadi(1,"Shri Chats",chatnames);
		chat.displayDetails();
		
		ChatAngadi chat1=new ChatAngadi(2,"Krishna Chats",chatnames);
		chat1.displayDetails();
		
		System.out.println("...Main method ended...");
	}
	
}