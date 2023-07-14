package com.xworkz.problems;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		
		int count=0;
		
		String ch[]=word.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			count++;
			System.out.println(ch[i]);
		}
		System.out.println("The no of words are "+count);
	}
	
}
