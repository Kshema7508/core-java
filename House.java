class House{

	public int id;
	public String name;
	public String ownerName;
	public String[] familyMembers;
	
	public House(int id, String name, String ownerName, String[] familyMembers){
	
		this.id=id;
		this.name=name;
		this.ownerName=ownerName;
		this.familyMembers=familyMembers;

}

	public void displayDetails(){
	
		System.out.println("Displaying House info");
		System.out.println("The House id is "+this.id);
		System.out.println("The name of the House is " +this.name);
		System.out.println("The House owner name is " +this.ownerName);
		System.out.println("The family members are: ");
		for(int index=0;index<familyMembers.length;index++){
			System.out.println(familyMembers[index]);
		}
	}
}