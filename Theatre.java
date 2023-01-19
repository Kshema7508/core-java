class Theatre{

	public int id;
	public String name;
	public int noOfScreens;
	public String[] typesOfScreens;
	
	public Theatre(int id, String name, int noOfScreens, String[] typesOfScreens){
	
		this.id=id;
		this.name=name;
		this.noOfScreens=noOfScreens;
		this.typesOfScreens=typesOfScreens;

	}
	
	public void displayDetails(){
	
		System.out.println("Displaying Theatre info");
		System.out.println("The Theatre id is "+this.id);
		System.out.println("The Theatre name is "+this.name);
		System.out.println("No of Screens are "+this.noOfScreens);
		System.out.println("Types of Screens are ");
		for(int index=0;index<typesOfScreens.length;index++){
			System.out.println(typesOfScreens[index]);
		}
		
	}


}