class WorldCup{
	
	static String worldCupWinnerNames[]={"West Indies" ,"West Indies" ,"India" ,"Australia" ,"Pakistan" ,"Sri Lanka" ,"Australia" ,"Australia" ,"Australia" ,"India" ,"Australia" ,"England"};
	static int worldCupWinnerYears[]={1975 ,1979 ,1983 ,1987 ,1992 ,1996 ,1999 ,2003 ,2007 ,2011 ,2015 ,2019};
	
	public static void main(String a[]){
	
		System.out.println(worldCupWinnerNames.length);
		//System.out.println("World Cup Winners Name: ");
		//System.out.println(worldCupWinnerNames[0]+" "+worldCupWinnerNames[1]+" "+worldCupWinnerNames[2]+" "+worldCupWinnerNames[3]+" "+worldCupWinnerNames[4]+" "+worldCupWinnerNames[5]+" "+worldCupWinnerNames[6]+" "+worldCupWinnerNames[7]+" "+worldCupWinnerNames[8]+" "+worldCupWinnerNames[9]+" "+worldCupWinnerNames[10]+" "+worldCupWinnerNames[11]);
		//System.out.println("World Cup Winners Year: ");
		//System.out.println(worldCupWinnerYears[0]+" "+worldCupWinnerYears[1]+" "+worldCupWinnerYears[2]+" "+worldCupWinnerYears[3]+" "+worldCupWinnerYears[4]+" "+worldCupWinnerYears[5]+" "+worldCupWinnerYears[6]+" "+worldCupWinnerYears[7]+" "+worldCupWinnerYears[8]+" "+worldCupWinnerYears[9]+" "+worldCupWinnerYears[10]+" "+worldCupWinnerYears[11]);
	
		for(int ksh=0;ksh<worldCupWinnerNames.length;ksh++){
			System.out.println(worldCupWinnerNames[ksh]);
		}
		
		System.out.println("World Cup Winners Year: ");
		for(int ksh=0;ksh<worldCupWinnerYears.length;ksh++){
			System.out.println(worldCupWinnerYears[ksh]);
		}
	}
}