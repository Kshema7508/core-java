class AmazonPrime{

	static String hindiSeries[]={"The Family Man" ,"Suzhal:The Vortex" ,"The Boys" ,"Hush Hush" ,"Crash Course" ,"Modern Love Mumbai" ,"Made in Heaven" ,"Guilty Minds" ,"Rudra: The Rdge of Darkness" ,"The Fame Game" ,"Mumbai Diaries 26/11" ,"Ray" ,"The Last Hour" ,"Tandav" ,"Scam 1992"};
	static String englisgSeries[]={"Killing Eve" ,"The Tick" ,"Mr. Robot" ,"Gossip Girl" ,"Parks and Recreation " ,"Invicible" ,"Mad men" ,"The Handmaid's Tale" ,"The Office(USA)" ,"Fleabag" ,"The Marvelous Mrs. Maisel" ,"The Boys" ,"The Last Hour" ,"Tandav" ,"Scam 1992"};
	
	public static void main(String a[]){
		
		nameOfHindiSeries();
		nameOfEnglishSeries();
	}
	
	public static void nameOfHindiSeries(){
		System.out.println("Hindi Series Names are: ");
		System.out.println("=============");
		//System.out.println(hindiSeries[0]+" "+hindiSeries[1]+" "+hindiSeries[2]+" "+hindiSeries[3]+" "+hindiSeries[4]+" "+hindiSeries[5]+" "+hindiSeries[6]+" "+hindiSeries[7]+" "+hindiSeries[8]+" "+hindiSeries[9]+" "+hindiSeries[10]+" "+hindiSeries[11]+" "+hindiSeries[12]+" "+hindiSeries[13]+" "+hindiSeries[14]);
		//System.out.println("English Series Names are: ");
		//System.out.println(englisgSeries[0]+" "+englisgSeries[1]+" "+englisgSeries[2]+" "+englisgSeries[3]+" "+englisgSeries[4]+" "+englisgSeries[5]+" "+englisgSeries[6]+" "+englisgSeries[7]+" "+englisgSeries[8]+" "+englisgSeries[9]+" "+englisgSeries[10]+" "+englisgSeries[11]+" "+englisgSeries[12]+" "+englisgSeries[13]+" "+englisgSeries[14]);
		
	//forloop
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