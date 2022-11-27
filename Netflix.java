class Netflix{

	static String hindiSeries[]={"Mismatched" ,"Delhi Crime" ,"Jamtara-Sabka Number Ayega" ,"Yeh Kaali Kaali Ankhein" ,"She" ,"Aranyak" ,"Kota Factory" ,"Masaba Masaba" ,"Fabulous Lives of Bollywood Wives" ,"Bombay Begums" ,"Indian Matchmaking" ,"Decoupled" ,"Ghoul" ,"Taj Mahal 1989" ,"Hasmukh"};
	static String englisgSeries[]={"Heartstopper" ,"you" ,"The Witcher" ,"Maid" ,"Midnight Mass " ,"Lupin" ,"Queer eye" ,"Squid Game" ,"Castlevania" ,"Big Mouth" ,"Never have I Ever" ,"American vandal" ,"The Unbrable kimmy Schmidt" ,"The Baby-Sitters Club" ,"One Day at a Time"};
	
	public static void main(String a[]){
		
		nameOfHindiSeries();
		nameOfEnglishSeries();
	}
	
	public static void nameOfHindiSeries(){
		System.out.println("Hindi Series Names are in Netflix: ");
		System.out.println("=============");
		//System.out.println(hindiSeries[0]+" "+hindiSeries[1]+" "+hindiSeries[2]+" "+hindiSeries[3]+" "+hindiSeries[4]+" "+hindiSeries[5]+" "+hindiSeries[6]+" "+hindiSeries[7]+" "+hindiSeries[8]+" "+hindiSeries[9]+" "+hindiSeries[10]+" "+hindiSeries[11]+" "+hindiSeries[12]+" "+hindiSeries[13]+" "+hindiSeries[14]);
		//System.out.println("English Series Names are in Netflix: ");
		//System.out.println(englisgSeries[0]+" "+englisgSeries[1]+" "+englisgSeries[2]+" "+englisgSeries[3]+" "+englisgSeries[4]+" "+englisgSeries[5]+" "+englisgSeries[6]+" "+englisgSeries[7]+" "+englisgSeries[8]+" "+englisgSeries[9]+" "+englisgSeries[10]+" "+englisgSeries[11]+" "+englisgSeries[12]+" "+englisgSeries[13]+" "+englisgSeries[14]);
		
		for(int index=0;index<hindiSeries.length;index++){
			System.out.println(hindiSeries[index]);
		}
	}
	
	public static void nameOfEnglishSeries(){	
		System.out.println("English Series Names are: ");
		System.out.println("=============");
		
		for (int index=0;index<englisgSeries.length;index++){
			System.out.println(englisgSeries[index]);
		}
		
	}
}
//