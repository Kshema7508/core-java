package com.xworkz.problems;

import java.util.Scanner;

public class RepeatedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		char ch[]=word.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int z=0;
			
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					z++;
				}
			}
			System.out.println(ch[i]+" "+z);
		}
	}
}
