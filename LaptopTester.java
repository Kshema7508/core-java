class LaptopTester{

	public static void main(String a[]){
	
		Laptop power=new Laptop();
		
		power.color="black";
		power.voltage="210 volts";
		power.price=20000.00;
		power.type="remote";
		
		System.out.println(power.color+" "+power.voltage+" "+power.price+" "+power.type);
		
		Laptop samsung=new Laptop();
		
		samsung.color="grey";
		samsung.voltage="240 volts";
		samsung.price=65446.00;
		samsung.type="remote";
		
		System.out.println(samsung.color+" "+samsung.voltage+" "+samsung.price+" "+samsung.type);
		
		Laptop lg=new Laptop ();
		
		lg.color="Black";
		lg.voltage="230 volts";
		lg.price=34745.00;
		lg.type="remote";
		
		System.out.println(lg.color+" "+lg.voltage+" "+lg.price+" "+lg.type);
		
		Ac panasonic=new Ac();
		
		panasonic.color="Black";
		panasonic.voltage="220 volts";
		panasonic.price=20000.00;
		panasonic.type="remote";
		
		System.out.println(panasonic.color+" "+panasonic.voltage+" "+panasonic.price+" "+panasonic.type);
		
		Ac hitachi=new Ac();
		
		hitachi.color="Cemen5";
		hitachi.voltage="250 volts";
		hitachi.price=30000.00;
		hitachi.type="remote";
		
		System.out.println(hitachi.color+" "+hitachi.voltage+" "+hitachi.price+" "+hitachi.type);
	}
}