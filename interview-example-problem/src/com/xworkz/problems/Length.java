package com.xworkz.problems;

public class Length {

	public static void main(String[] args) {
		String name="Kshema N Poojary";
		int count=0;
		
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count+=1;	
		}
		System.out.println("The length of name is: "+count);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}
}
