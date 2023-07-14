package com.xworkz.problems;

public class StringTester {

	public static void main(String[] args) {
		
		//String str=null;
		//String str1=new String("null");
		//String st1=null;
		/*name=name+ "Poojary";*/
		
		//System.out.println("=======");
		//System.out.println(str==st1);
		//System.out.println(str==str1);
		 
		//System.out.println(str.equals(st1));
		//System.out.println(str.equals(str1));
		
		//String name="Kshema";
		String name="kshema N Poojary";
		String name1="Poojary";
		//String name1="ksheMA";
		//name= name.concat(" Poojary");
		System.out.println(name);
		
		//StringBuffer
		//StringBuilder
		StringBuffer buffer=new StringBuffer("");
		buffer.append("kshema").append("Poojary");
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		//
		System.out.println(name.replace("Poojary", "Poo"));
		System.out.println(name.replace('P','s'));
		
		//contains-->char sequence in string
		System.out.println(name.contains(name1));
		System.out.println(name.length());
		System.out.println(name1.indexOf('a'));
		System.out.println(name.substring(4));
		System.out.println(name.substring(0, 5));
		System.out.println(name.toCharArray());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		//find particular(individual) character in the string
		System.out.println(name.charAt(3));
		
		//equalsIgnoreCase-->it will not consider the case if full name is not available
		System.out.println(name.equalsIgnoreCase(name1));
		
		//char ch[]= {'c','h','a','r'};
	}
}
