package com.xworkz.problems;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]= {1,2,2,3,3,5,6};
		
		for(int i=0;i<=num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("duplicate element"+num[i]);
				}
			}
		}
	}
}
