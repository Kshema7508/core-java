package com.xworkz.problems;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine(); // it is used to get the space in between the words
		
		
		char ch[]=sentence.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}
