class Grocery{

	public int id;
	public String name;
	public String location;
	public String ownerName;
	public String[] items;
	
	public Grocery(int id, String name,  String location, String ownerName, String[] items){
	
		this.id=id;
		this.name=name;
		this.location=location;
		this.ownerName=ownerName;
		this.items=items;

}

	public void displayDetails(){
	
		System.out.println("Displaying Grocery shop info");
		System.out.println("The Grocery shop id is "+this.id);
		System.out.println("The name of the Grocery shop is " +this.name);
		System.out.println("The Grocery shop location is "+this.location);
		System.out.println("The Grocery shop items are: ");
		for(int index=0;index<items.length;index++){
			System.out.println(items[index]);
		}
		
	}
}