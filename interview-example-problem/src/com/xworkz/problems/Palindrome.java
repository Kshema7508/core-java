package com.xworkz.problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		String rev="";
		
		char ch[]=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		
		if(word.equals(rev)) {
			System.out.println("The given word is palindrome");
		}
		else {
			System.out.println("The given word is not palindrome");
		}
	}
}
