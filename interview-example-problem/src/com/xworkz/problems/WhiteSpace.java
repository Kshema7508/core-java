package com.xworkz.problems;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input to a sentence");
		String sentence=sc.nextLine();//for whole line 
		char ch[]=sentence.toCharArray();
		String withoutspace="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				System.out.print(ch[i]);
			}
		}
		sc.close();
	}
}
