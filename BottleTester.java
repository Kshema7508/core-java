class BottleTester{

	public static void main(String bottle[]){
	
		TupperwareBottle tupperwareBottle=new TupperwareBottle();
		
		tupperwareBottle.color="blue";
		tupperwareBottle.shape="cylinder";
		tupperwareBottle.price=99.00;
		tupperwareBottle.type="metal";
		
		System.out.println(tupperwareBottle.color+" "+tupperwareBottle.shape+" "+tupperwareBottle.price+" "+tupperwareBottle.type);
		
		TupperwareBottle bottle1=new TupperwareBottle();
		
		bottle1.color="pink";
		bottle1.shape="Rectangle";
		bottle1.price=78.00;
		bottle1.type="Plastic";
		
		System.out.println(bottle1.color+" "+bottle1.shape+" "+bottle1.price+" "+bottle1.type);
		
		TupperwareBottle tupperWare=new TupperwareBottle();
		
		tupperWare.color="purple";
		tupperWare.shape="squarer";
		tupperWare.price=345.00;
		tupperWare.type="tupperware";
		
		System.out.println(tupperWare.color+" "+tupperWare.shape+" "+tupperWare.price+" "+tupperWare.type);
	}
}