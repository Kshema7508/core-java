package com.xworkz.problems;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Kshema";
		int count=0;
		
		char ch[]=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			count+=1;
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("count words:"+count);
	}

}
