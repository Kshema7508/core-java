class Movies{

	static String names[]={"Om" ,"Kantara" ,"KGF" , "Singham"};
	
	public static void main(String movie[]){
		
		getMovies();
		
	}
		
		
	public static void getMovies(){
		System.out.println("The name of Movies");
		System.out.println(names.length);
		//System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]);
		
		for (int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
}