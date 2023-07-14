package com.xworkz.problems;

import java.util.Scanner;

public class SwapTwoWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String a=sc.next();
		String b=sc.next();
		
		System.out.println("The word before swaping "+a+" & "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("The word after swaping "+a+" & "+b);
	}
}
