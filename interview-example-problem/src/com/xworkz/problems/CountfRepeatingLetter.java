package com.xworkz.problems;

import java.util.Scanner;

public class CountfRepeatingLetter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the world");
		String world=sc.next();
		int count=0;
		System.out.println("Enter the letter to find");
		String letter=sc.next();
		
		char ch[]=world.toCharArray();
		for(int i=0;i<=ch.length;i++) {
			if(ch[i]==letter) {
				count++;
			}
		}
	}
}
