class Stationery{

	public int id;
	public String name;
	public int[] notebooks;
	public String[] pens;
	public String[] charts;
	
	public Stationery(int id, String name, int[] notebooks, String[] pens, String[] charts){
	
		this.id=id;
		this.name=name;
		this.notebooks=notebooks;
		this.pens=pens;
		this.charts=charts;
		
	}
	
	public void displayDetails(){
	
		System.out.println("Displaying Restuarant info");
		System.out.println("The Stationery id is "+this.id);
		System.out.println("The Stationery name is "+this.name);
		System.out.println("Notebooks pages are ");
		for(int index=0;index<notebooks.length;index++){
			System.out.println(notebooks[index]);
		}
		
		System.out.println("Types of pens are ");
		for(int index=0;index<pens.length;index++){
			System.out.println(pens[index]);
		}
		
		System.out.println("Types of charts are ");
		for(int index=0;index<charts.length;index++){
			System.out.println(charts[index]);
		}
	}

}