package com.xworkz.problems;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String name=sc.next();
		
		char ch[]=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
