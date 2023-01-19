class Speaker1Tester{

	public static void main(String a[]){
	
		Speaker1 volume=new Speaker1();
		
		volume.color="black";
		volume.shape="rectangle";
		volume.price=20000.00;
		volume.type="metal";
		
		System.out.println(volume.color+" "+volume.shape+" "+volume.price+" "+volume.type);
		
		Speaker1 connection=new Speaker1();
		
		connection.color="grey";
		connection.shape="Square";
		connection.price=65446.00;
		connection.type="Plastic";
		
		System.out.println(connection.color+" "+connection.shape+" "+connection.price+" "+connection.type);
		
		Speaker1 onOrOff=new Speaker1();
		
		onOrOff.color="Black";
		onOrOff.shape="cube";
		onOrOff.price=34745.00;
		onOrOff.type="metal";
		
		System.out.println(onOrOff.color+" "+onOrOff.shape+" "+onOrOff.price+" "+onOrOff.type);
		
		Speaker1 battery=new Speaker1();
		
		battery.color="Black";
		battery.shape="rectangle";
		battery.price=30745.00;
		battery.type="plastic";
		
		System.out.println(battery.color+" "+battery.shape+" "+battery.price+" "+battery.type);
		
		Speaker1 audio=new Speaker1();
		
		audio.color="Cement";
		audio.shape="cube";
		audio.price=24745.00;
		audio.type="metal";
		
		System.out.println(onOrOff.color+" "+onOrOff.shape+" "+onOrOff.price+" "+onOrOff.type);
	}
}