package com.xworkz.problems;

import java.util.Scanner;

public class RemoveCharaterRepeted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String a=sc.next();
		
		char ch[]=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != 'C' || ch[i] != 'c') {
				System.out.print(ch[i]);
			}
		}
	}
}
