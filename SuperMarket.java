class SuperMarket{

	static String fruits[]={"Mango","Orange","Banana","Apple","Graps","Pomegranate","Chiku","Kiwi","Papaya","Pineapple"};
	static String vegetables[]={"Beans","tomato","Onion","Cucumber","Pumpkin","Corn","Carrot","Beetroot","Califlower","Potato"};
	static String chocolates[]={"Dairy Milk","KitKat","Milkybar","Munch","5Star","Perk","Snickers","Ferrero Rocher","Melody"};
	static String biscuits[]={"Marie Gold","Bourbon","Hide&seek","Good Day","50-50","Tiger","Parle-G","Little Heart","Sunfeast","Oreo","Unibic","Horlicks"};
	static String perfumes[]={"Envy","Neud Luxury","Bella Vita Organic Rose","Fogg","Renee Eau De","Wild Stone","Ustraa","Denver","Armaff","Black"};
	static String clothes[]={"Kurta","Jeans","Frock","T-Shirts","Sweater","Jacket","Coat","Hooide","JumpSuit","Tops"};
	static String groceries[]={"Oils","Sauces","Milk","Cheese","Bread","Biscuits","Flour","Moong Dal","Maida","Snacks"};
	static String kichenSet[]={"Spatula","Pestle","Cooking Pot","strainer","Knife","Spoon"};
	static String shampoo[]={"Matrix","Dove","Pantene","Sunsilk","Tresemme","Garnier","Biolage","Head&Shoulder","Kerastase","Wow"};
	static String shoes[]={"Adidas","Nike","Reebok","Puma","Clarks"};
	static String dryFruits[]={"Pista","Khajoor","Kaju","Badam","Kismis","Apricots","Almondd"};
	static String cosmetics[]={"Lipstick","Eye Liner","Foundation", "Blusher","Primer","Concealer","Moisturizer","Lip Liner","Lip gloss","Face Powder"};
	
	public static void main(String market[]){
		
		getFruits();
		getFruits();
	}

	public static void getFruits(){
		System.out.println("The list of Fruits are: ");
		System.out.println("=================");
		for(int a=0;a<fruits.length;a++){
			System.out.println(fruits[a]);
		}
	}
		
		/*System.out.println("The list of Vegetables are: ");
		System.out.println("=================");
		for(int a=0;a<vegetables.length;a++){
			System.out.println(vegetables[a]);
		}00
		
		System.out.println("The list of Chocolates are: ");
		System.out.println("=================");
		for(int a=0;a<chocolates.length;a++){
			System.out.println(chocolates[a]);
		}
		
		System.out.println("The list of Biscuits are: ");
		System.out.println("=================");
		for(int a=0;a<biscuits.length;a++){
			System.out.println(biscuits[a]);
		}
		
		System.out.println("The list of Perfumes are: ");
		System.out.println("=================");
		for(int a=0;a<perfumes.length;a++){
			System.out.println(perfumes[a]);
		}
		
		System.out.println("The list of Clothes are: ");
		System.out.println("=================");
		for(int a=0;a<clothes.length;a++){
			System.out.println(clothes[a]);
		}
		
		System.out.println("The list of Groceries are: ");
		System.out.println("=================");
		for(int a=0;a<groceries.length;a++){
			System.out.println(groceries[a]);
		}
		
		System.out.println("The list of Kichen Set are: ");
		System.out.println("=================");
		for(int a=0;a<kichenSet.length;a++){
			System.out.println(kichenSet[a]);
		}
		
		System.out.println("The list of Shampoos are: ");
		System.out.println("=================");
		for(int a=0;a<shampoo.length;a++){
			System.out.println(shampoo[a]);
		}
		
		System.out.println("The list of Shoes are: ");
		System.out.println("=================");
		for(int a=0;a<shoes.length;a++){
			System.out.println(shoes[a]);
		}
		
		System.out.println("The list of Dry Fruits are: ");
		System.out.println("=================");
		for(int a=0;a<dryFruits.length;a++){
			System.out.println(dryFruits[a]);
		}
		
		System.out.println("The list of Cosmetics are: ");
		System.out.println("=================");
		for(int a=0;a<cosmetics.length;a++){
			System.out.println(cosmetics[a]);
		}*/
}