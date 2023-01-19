class ChatAngadi{

	public int id;
	public String name;
	public String[] chatnames;
	
	public ChatAngadi(int id, String name, String[] chatnames){
	
		this.id=id;
		this.name=name;
		this.chatnames=chatnames;

}

	public void displayDetails(){
	
		System.out.println("Displaying ChatAngadi info");
		System.out.println("The ChatAngadi id is "+this.id);
		System.out.println("The name of the ChatAngadi is " +this.name);
		System.out.println("The chatnames are: ");
		for(int index=0;index<chatnames.length;index++){
			System.out.println(chatnames[index]);
		}
	}
}