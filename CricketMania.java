class CricketMania{
	
	static String topBatsmanInOdi[]={"Babar Azam","Imam-ul-Haq","Rassie Van","de Kock","Virat Kohli"};
	static int highestScoresOdi[]={264,237,219,215,200};
	
	public static void main(String a[]){
	
		System.out.println("Men's ODI Batting Ranking:");
		//System.out.println(topBatsmanInOdi[0]+" "+topBatsmanInOdi[1]+" "+topBatsmanInOdi[2]+" "+topBatsmanInOdi[3]+" "+topBatsmanInOdi[4]);
		for (int index=0;index<topBatsmanInOdi.length;index++){
			System.out.println(topBatsmanInOdi[index]);
		}
		
		System.out.println("Top 5 Highest run Scores in ODI are: ");
		//System.out.println(highestScoresOdi[0]+" "+highestScoresOdi[1]+" "+highestScoresOdi[2]+" "+highestScoresOdi[3]+" "+highestScoresOdi[4]);
		for (int index=0;index<highestScoresOdi.length;index++){
			System.out.println(highestScoresOdi[index]);
		}
		
		
	}
}

//store top 5 bowlers and read /fetch the data
//top5 wicket takers in ODI(women/men)
// int noOfTeamWinningWorldCup


//prime--kannadaSeries[15],hindiSeries[15],englishSeries[15]
//Netflix--kannadaSeries[15],hindiSeries[15],englishSeries[15]
